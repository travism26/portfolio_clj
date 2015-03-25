(ns webapp.controllers.posts
(:require
  [clostache.parser :as clostache]
  [webapp.models.posts :as posts-model]
  [public.layout :as layout]))

(defn read-template [template-name]
  (slurp (clojure.java.io/resource
           (str "views/posts/" template-name ".mustache"))))

(defn render-template [template-file params]
  (clostache/render (read-template template-file) params))

(defn index []
  (render-template "index" {:posts (posts-model/all)}))

(defn layout []
  (layout/index-page))