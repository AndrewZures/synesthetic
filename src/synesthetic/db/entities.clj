(ns synesthetic.db.entities
  (:require [korma.db :refer :all]
            [korma.core :refer :all]))

(declare user entry)

;; TODO: AJZ - choose db type - prod/test
(defdb test (mysql {:db "synesthetic-test" :user "root" }))

(defentity user
  (pk :id)
  (table :users)
  (has-many entry))

(defentity entry
  (pk :id)
  (table :entries)
  (belongs-to user)
  )
