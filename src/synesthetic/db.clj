(ns synesthetic.db
  (:require [korma.db :as db]
            [korma.core :as k])

(defn add [x y]
  (+ x y))

(defdb test (mysql {:db "syn-test"
                    :user "root"
                    :password "password"
                    }))

(defentity users
  (pk :id)
  (table :users))
