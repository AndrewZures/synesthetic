(ns synesthetic.db.actions-spec
  (:require [speclj.core :refer :all]
            [synesthetic.db.actions :as a]
            [synesthetic.db.entities :refer [user entry]]))

(describe "database actions"

  (before
      (a/save user { :first_name "john" :last_name "doe"}))

  (it "saves an entity"
       (let [first-user (first (a/select user))]
         (should= "john" (:first_name first-user))
         (should= "doe" (:last_name first-user))))

  (it "updates an entity"
      (a/update user {:first_name "dave" } {:last_name "doe"})
       (let [first-user (first (a/select user {:last_name "doe"}))]
         (should= "dave" (:first_name first-user))
         (should= "doe" (:last_name first-user))))

  (it "selects an entity"
      (a/save user { :first_name "andrew" :last_name "zures"})
      (let [selected (first (a/select user {:last_name "zures"}))]
        (should= "andrew" (:first_name selected))))

  (it "deletes an entity"
      (a/delete user)
       (should= [] (a/select user)))

)
