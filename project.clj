(defproject pg-json "0.1.0-SNAPSHOT"
  :description "FIXME: write description"
  :url "http://example.com/FIXME"
  :license {:name "Eclipse Public License"
            :url "http://www.eclipse.org/legal/epl-v10.html"}
  :javac-opts ["-target" "1.6" "-source" "1.6"]
  :dependencies [[org.postgresql/postgresql "9.3-1101-jdbc41"]]
  :profiles {:dev
             {:dependencies [[org.clojure/clojure "1.5.1"]]}})

