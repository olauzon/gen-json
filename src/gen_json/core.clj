(ns gen-json.core
  (require [clojure.string           :as string]
           [clojure.core.memoize     :as memo]
           [clojure.java.io          :as io]
           [clojure.data.csv         :as csv]
           [clojure.data.json        :as json]
           [clojure.data.generators  :as gen]
           [clj-time.format          :as tf]
           [clojure.tools.reader.edn :as edn]
           [me.raynes.fs             :as fs])
  (use clojure.java.io))

(def file-path
  (atom "example.edn"))

(defn raw
  "Read config string from config-file"
  [path]
  (string/trim (slurp (fs/normalized-path path))))

(def config
  (memo/memo #(edn/read-string (raw @file-path))))

(defn reset-file-path!
  [path]
  (do
    (reset! file-path path)
    (memo/memo-clear! config)))

(defn append!
  "Append a data vector to a file path"
  [file msg]
  (with-open [wtr (io/writer file :append true)]
    (.write wtr (str (json/write-str msg) "\n"))))

(defn data
  []
  (eval ((config) :data)))

(defn output-file
  []
  ((config) :output-file))

(defn lines
  []
  ((config) :lines))

(defn generate!
  []
  (time
    (do
      (println (str (lines) " rows will be written to " (output-file)))
      (loop [cnt 0]
        (if (>= cnt (lines))
          (println (str cnt " rows were written to " (output-file)))
          (do
            (append! (output-file) (data))
            (recur (inc cnt))))))))

(defn -main
  [config-file]
  (do
    (in-ns 'gen-json.core)
    (reset-file-path! config-file)
    (generate!)))
