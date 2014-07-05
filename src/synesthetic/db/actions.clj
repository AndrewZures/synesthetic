(ns synesthetic.db.actions
  (:require [korma.core :as k]
            [synesthetic.db.entities :refer :all]))

(defn save [entity values]
  (k/insert entity (k/values values)))

(defn update [entity values criteria]
  (k/update entity (k/set-fields values) (k/where criteria)))

(defn select
  ([entity] (k/select entity))
  ([entity criteria] (k/select entity (k/where criteria))))

(defn delete
  ([entity] (k/delete entity))
  ([entity criteria] (k/delete entity (k/where criteria))))
