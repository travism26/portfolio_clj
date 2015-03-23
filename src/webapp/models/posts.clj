(ns webapp.models.posts
  (:refer-clojure :exclude [get])
  (:require [clojure.java.jdbc :as sql]
    ;[clojure.java.jdbc.sql :as s]
            ))
(def mysql-db {:subprotocol "mysql"
               :subname "//127.0.0.1:33060/blog"
               :user "homestead"
               :password "secret"
               :zeroDateTimeBehaviour "convertToNull"})

;(def now
;  (str (java.sql.Timestamp. (System/currentTimeMillis))))

(defn all []
  (sql/query mysql-db ["SELECT * FROM posts"]))

;(sql/db-do-commands "mysql://localhost:33060" (sql/create-table-ddl :blog_trav [:posts :text]))