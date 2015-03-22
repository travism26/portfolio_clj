(ns webapp.handler
  (:require [webapp.views :as views]
            [compojure.core :refer :all :as cc]
            [compojure.handler :as handeler]
            [compojure.route :as route]
            [ring.middleware.defaults :refer :all]
            [ring.util.response :as response]))

(defn say-hello [name]
  (str "<h1>Hello " name "!</h1>"))

;(defn hiccup-routes]]
;  (GET "/user/:name" ][name] (say-hello name)))
(def foobar
  {:status 302
   :body "Hello"
   }
  )
(cc/defroutes app-routes
              (cc/GET "/"
                      []
                      (response/redirect "index.html"))
              (route/resources "/")
              (route/not-found "Not Found"))

(def app
  (wrap-defaults app-routes site-defaults))