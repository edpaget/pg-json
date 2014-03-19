(ns pg-json.core
  (:require [cheshire.core :refer [generate-string parse-string]])
  (:import [org.postgresql.util PGobject]))

(defn to-json-column
  [x]
  (doto (PGobject.)
    (.setType "json")
    (.setValue (generate-string this))))

(defprotocol JSONretrievable
  (from-json-column [this]))

(extend-type org.postgresql.util.PGobject
  JSONretrievable
  (from-json-column [this]
    (when (= (.getType this) "json")
      (parse-string (.getValue this)))))
