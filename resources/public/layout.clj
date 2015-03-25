(ns public.layout
  (:require [hiccup.core :only [html]]
    ;[hiccup.page-helpers :only [doctype include-css]]
        ))
(defn index-page
  [:p "Hello " [:em "World!"]]
;(html
;  [:div {:class "url"}
;  [:a {:href "http://clojure.org"} "Clojure - home"]])
  )
;"<div class=\"url\"><a href=\"http://clojure.org\">Clojure - home</a></div>"
;
;(defn index-page
;  (html
;    {:lang "en"}
;    [:head (include-js "myscript.js") (include-css "css/bootstrap.min.css")
;     (include-css "css/stylish-portfolio.css")
;     (include-css "font-awesome/css/font-awesome.min.css")
;     (include-css "http://fonts.googleapis.com/css?family=Source+Sans+Pro:300,400,700,300italic,400italic,700italic")]
;    [:body [:div [:h1 {:class "info"} "Hiccup"]]]))
;font-awesome/css/font-awesome.min.css
;http://fonts.googleapis.com/css?family=Source+Sans+Pro:300,400,700,300italic,400italic,700italic
;"<!DOCTYPE html>\n<html lang=\"en\"><head><script src=\"myscript.js\" type=\"text/javascript\"></script><link href=\"mystyle.css\" rel=\"stylesheet\" type=\"text/css\"></head><body><div><h1 class=\"info\">Hiccup</h1></div></body></html>"
