`gen-json`
==========

A Clojure utility for generating "random" JSON objects.

  * Data generated using [clojure.data.generators](https://github.com/clojure/data.generators)
  * Time formatted with [clj-time](https://github.com/clj-time/clj-time)

Usage
-----

### Write 10 randomly generated JSON objects

```bash
lein run example.edn
```

#### Example config in `example.edn`

```clojure
{
  :data {
    :uuid   (str (gen/uuid))
    :num    (+ 40 (rand-int 60))
    :date   (str (gen/date))
    :letter (gen/one-of "a" "b" "c" "d")
    :bool   (gen/boolean)
    :short  (gen/short)
    :int    (gen/int)
    :long1  (gen/long)
    :string (gen/string)
    :long2  (gen/long)
    :ten    10
    :more   {
      :bool (gen/boolean)
      :more {
        :int (gen/int)
      }
    }
  }
  :output-file "example.json"
  :lines 10
}
```

#### Example output in `example.json`

```json
{"date":"Thu Jan 07 17:11:28 EST 1982","string":"=:_uC:LjwIgD0X3n0W","long2":-4588066762141701118,"long1":-7912908803613548926,"bool":true,"more":{"bool":false,"more":{"int":1084521971}},"int":-2012543340,"uuid":"5ba0a3f3-32f7-02b1-d15b-23ed02d53e28","num":69,"ten":10,"letter":"c","short":31066}
{"date":"Tue Oct 05 23:35:32 EDT 1982","string":";zm\\CBIKLLn.oK:21rNG\\b=VCrlZCbv2l[L=","long2":-8487172994898555456,"long1":-6731013670330063931,"bool":false,"more":{"bool":false,"more":{"int":-11480910}},"int":-2030170198,"uuid":"09570ca0-77fa-de46-7bdd-30f57598e44a","num":88,"ten":10,"letter":"b","short":-6832}
{"date":"Mon May 01 08:01:01 EDT 1972","string":"]itX|'i:uCH?=J)f0l-(\"T:{u@!lQoWaT*Wu[Duo8{EV8n^","long2":-7118474111917486870,"long1":9005652045203794402,"bool":false,"more":{"bool":false,"more":{"int":1022123327}},"int":1526265982,"uuid":"56f9aa9c-814a-a5fa-c20e-3ef017fe82f0","num":41,"ten":10,"letter":"b","short":561}
{"date":"Sun Aug 12 16:12:18 EDT 1979","string":"qb\/ldknp},ZS.RT?dD!))0uGp?H$Y\/MVQc`pj;CP;|V+ITVe","long2":-7451485235432246024,"long1":-3356282887119310997,"bool":true,"more":{"bool":true,"more":{"int":-546209933}},"int":628579426,"uuid":"d71037ea-9732-2a09-18cb-b615420a8641","num":50,"ten":10,"letter":"a","short":7433}
{"date":"Mon Mar 05 21:48:53 EST 1990","string":"~XjQ'O0Oa^BThQ0cSK@#kb<\\UQR9\/bEK9MGW\/8P7\\@^m}Pz9]yXf,a-S&d`oM?lj;RH{ynms@qGYx{[0H%E&)w3UU'","long2":7690126608758977573,"long1":-8113911624402688253,"bool":false,"more":{"bool":false,"more":{"int":476037419}},"int":1805510065,"uuid":"08a12ee7-a852-94d4-2dee-e42bbc9711cf","num":58,"ten":10,"letter":"a","short":15828}
{"date":"Sat May 12 21:39:12 EDT 2074","string":"\\e\"mDpPm}T!.,`awFsx-K.f9#sRt\"K=.[K`VZccQa73W[sS|-?p_<6k]","long2":5888756209027563785,"long1":3179601064751172392,"bool":false,"more":{"bool":true,"more":{"int":644532041}},"int":740672507,"uuid":"9a879aa7-7ca3-a060-378f-5f5f1bcf284d","num":93,"ten":10,"letter":"b","short":10257}
{"date":"Mon Jun 02 08:45:03 EDT 2031","string":"1J3U-.lHU;u%EMtN?F $zI-#X:5fP%\\P}n*WfUQ@h_6[ryo9Vz dnvj(b!_rwRqE {+V>`lNhkO:c1=@+eN:{Dd>|e.Kd5D29ZM~,JBP=*|e24U@E_\/tRBS'l\"VAB-Q]5noa-}QUub^S,uCF%[-8hA9ibXUdbb~oOjCencz\"OfDZ]amEwD:]q%0d-iiYxZaRpx0[.lQH^39t>Z\/E xT,+!j3kFIqm#npDGq`pnM[hmE@KN-Pvzu0@?.lut","long2":3930309226770985576,"long1":2450511670853034136,"bool":false,"more":{"bool":false,"more":{"int":1478422842}},"int":-990660663,"uuid":"1d0c6a63-ed7f-70e0-1be7-d604e5c94c1e","num":91,"ten":10,"letter":"b","short":-6003}
{"date":"Sun Aug 07 15:42:40 EDT 1983","string":"bn:","long2":-7773418264728399811,"long1":4318048165107432018,"bool":true,"more":{"bool":true,"more":{"int":-1285595627}},"int":701484599,"uuid":"73501c39-9fb8-23e3-6482-017eb4c228c7","num":97,"ten":10,"letter":"a","short":-4637}
{"date":"Thu Jul 09 16:44:09 EDT 1987","string":"EGhCvzQ1>5?(|U@>pEo|P\"S=D`\\-_C[>U7~GXV(4&8 HmrKzq?W\\p9yb7L44)cC\"xt3$]g`Lb(eV>tg1D)u!Ey^[VN","long2":-7479297482452105886,"long1":3706550385263427884,"bool":true,"more":{"bool":false,"more":{"int":1581996064}},"int":412796518,"uuid":"52890ca4-cae1-30a5-c3b9-0e3afd784e14","num":63,"ten":10,"letter":"a","short":23845}
{"date":"Wed Dec 05 00:07:28 EST 2029","string":"1g35w)","long2":5669492953851700171,"long1":7845584124940836124,"bool":true,"more":{"bool":true,"more":{"int":-693617079}},"int":-1251342910,"uuid":"b5c0d0ff-d1f2-038d-daf6-56dcb82d8b10","num":56,"ten":10,"letter":"c","short":-23831}
```

### Create other config files based on example.edn

License
-------

Copyright © 2013 Olivier Lauzon

Distributed under the Eclipse Public License.
