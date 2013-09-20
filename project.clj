(defproject gen-json "0.1.0-SNAPSHOT"
  :description "Generate \"random\" JSON files"
  :url "https://github.com/olauzon/gen-json"
  :license {:name "Eclipse Public License"
            :url "http://www.eclipse.org/legal/epl-v10.html"}
  :dependencies [
    [org.clojure/clojure         "1.5.1"]
    [org.clojure/core.memoize    "0.5.6"]
    [org.clojure/data.csv        "0.1.2"]
    [org.clojure/data.json       "0.2.3"]
    [org.clojure/data.generators "0.1.2"]
    [org.clojure/tools.reader    "0.7.5"]
    [clj-time                    "0.4.5"]
    [me.raynes/fs                "1.4.0"]]
  :main gen-json.core)
