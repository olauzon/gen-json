gen-json
========

A Clojure utility for generating "random" JSON objects.

  * Data generated using [clojure.data.generators](https://github.com/clojure/data.generators)
  * Time formatted with [clj-time](https://github.com/clj-time/clj-time)

Usage
-----

### Build uberjar

```bash
lein uberjar
```

### Write 10 randomly generated JSON objects to hello.json

```bash
java -cp target/gen-json-0.1.0-SNAPSHOT-standalone.jar clojure.main -m gen-json.core example.edn
```

#### Example config in `example.edn`

```clojure
{
  :data {
    :uuid   (gen/uuid)
    :num    (+ 40 (rand-int 60))
    :date   (gen/date)
    :letter (gen/one-of "a" "b" "c" "d")
    :bool   (gen/boolean)
    :short  (gen/short)
    :int    (gen/int)
    :long1  (gen/long)
    :string (gen/string)
    :long2  (gen/long)
    :ten    10
  }
  :output-file "hello.json"
  :lines 10
}
```

#### Example output in `hello.json`

```json
{"date":"Thu Jan 07 17:11:28 EST 1982","string":"=:_uC:LjwIgD0X3n0W","long2":"-4588066762141701118","long1":"-7912908803613548926","bool":"true","int":"-1758082576","uuid":"cc7229ce-080b-069b-5108-46b65ba0a3f3","num":"90","ten":"10","letter":"d","short":"-32043"}
{"date":"Sun Nov 25 14:26:20 EST 1979","string":"Rr4X1C,I]bzT#$jh[@{MT g[&@;.7D*-;0;j^~ka(k_LK9L,m|bE:ZBB|1w:lk+Etv;y<^8F}ue !<UHrM='t^cX- \\nIyt,a33~|O(Pqi^,F!QIh]HR7#.Xfg|u","long2":"-6834366834248567851","long1":"8221944818177641515","bool":"true","int":"-1701421671","uuid":"2c588417-7537-a68c-e5cb-54862f653a5b","num":"76","ten":"10","letter":"c","short":"22771"}
{"date":"Sun Feb 27 09:59:33 EST 2011","string":"$Y\/MVQc`pj;CP;|V+ITVeXmsC]o)vZW\/~XjQ'O0Oa^","long2":"6619736205161434398","long1":"-8284882916436724031","bool":"true","int":"-1687429471","uuid":"3af3bb56-2d50-c1da-048e-fcd3b66ca153","num":"96","ten":"10","letter":"c","short":"20955"}
{"date":"Thu Sep 25 21:23:19 EDT 1986","string":"<","long2":"4332977493309597071","long1":"8312423081133895108","bool":"false","int":"598941085","uuid":"90d97aa1-2d42-c3b9-8441-7c0d0db8dc7c","num":"58","ten":"10","letter":"b","short":"-15467"}
{"date":"Thu Jul 28 12:00:53 EDT 2039","string":"EK9MGW\/8P7\\@^m}Pz","long2":"4925782288543390495","long1":"-6572922273250295796","bool":"true","int":"56921189","uuid":"4f716f2e-beda-fc44-6234-6ae921cb4453","num":"65","ten":"10","letter":"b","short":"-15491"}
{"date":"Thu Oct 30 16:16:07 EST 1975","string":"oV!'@de|vKu=T^G01KQv+eVbtV^*d@HJ67)y%`i^e-72c#mB u5D1t22.Yz;[)=Xb8CDv3r=`Wr|2ewk5yM|5r5mp\/Ecl'IUF]\"w;LLm.xN*1k9-RX5or_R2]??W;A<CPC]2+xC]Ld^5\\{(9HozW;|lPpfO6s\/'p[Y5ybAW-,L\\C{|*a9K9x_`-;9jI(Bp~^I?M=g Mm;VG\\{%I@X<mTskkM?-1o$|tdb)9","long2":"5975282525948902333","long1":"-3349173856144723305","bool":"false","int":"166295501","uuid":"13b74bc5-1abd-7516-cdf9-f16d82c4f446","num":"94","ten":"10","letter":"d","short":"5170"}
{"date":"Mon Nov 24 07:55:45 EST 2008","string":"-Q]5noa-}QUub^S,uCF%[-8hA9ibXUdbb~oOjCencz\"OfDZ]am","long2":"7202613045196186750","long1":"-1501843754440404881","bool":"false","int":"406904465","uuid":"af4fe872-a4bf-f8f9-bf78-e4cedb0b5a40","num":"51","ten":"10","letter":"b","short":"-26359"}
{"date":"Mon Jun 30 17:39:38 EDT 2098","string":"OF<2s`E5Qo\/K#;PvNEld-NxRO3\"n(}X<Rpb1ivmYt ","long2":"6976632513619112205","long1":"-1815641401476724878","bool":"true","int":"1405945853","uuid":"7bdcc7a4-293c-675c-9f69-0ebbc3628055","num":"41","ten":"10","letter":"a","short":"20534"}
{"date":"Mon Apr 04 00:12:07 EDT 2005","string":"KN-Pvzu0@?.lut4,*p9**_Fbwbn:V6e3_JEnH[\/EGhCvzQ1>5?(|","long2":"-8003117795686964107","long1":"6390016758477649625","bool":"false","int":"-194695370","uuid":"49e2d9d3-6579-ece3-4986-7fbfd5757f6b","num":"81","ten":"10","letter":"a","short":"-17555"}
{"date":"Fri Apr 06 10:58:38 EDT 2012","string":"#Ld!}{?6PB`),~ yGCt>p7[O[#w8S~=sK6w@mUf6hJc9$:K6v|#","long2":"-3385014592132833671","long1":"-7145984928441672239","bool":"true","int":"-770806166","uuid":"e4f66655-ed25-d87a-bff3-cec12c02ea1f","num":"76","ten":"10","letter":"d","short":"-7583"}
```

### Create other config files based on example.edn

License
-------

Copyright ©2013 Olivier Lauzon

Distributed under the Eclipse Public License either version 1.0 or (at
your option) any later version.
