(ns synesthetic.db-spec
  (:require [speclj.core :refer :all]
            [synesthetic.db :as db]))

(describe "database"
    (it "generates db"
        (should= 3 (db/add 1 2)))
)
