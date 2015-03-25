(ns webapp.handler
  (:require [webapp.views :as views]
            [compojure.core :refer :all :as cc]
            [compojure.handler :as handeler]
            [compojure.route :as route]
            [ring.middleware.defaults :refer :all]
            [ring.util.response :as response]
            [webapp.controllers.posts :as posts-controller]))

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
                      (posts-controller/layout)
                      ;(response/redirect "index.html")
                      )
              (cc/GET "/layout"
                      []
                      "hello"
                      ;(posts-controller/layout)
                      )
              (GET "/www" [] "hi")
              (route/resources "/")
              (route/not-found "Not Found"))

(def app
  (wrap-defaults app-routes site-defaults))