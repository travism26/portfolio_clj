(ns webapp.views
  (:require [clojure.string :as str]
            [hiccup.page :as hic-p]))

(defn gen-page-head
  [title]
  [:head
   [:title (str "Locations: " title)]
   (hic-p/include-css "/css/styles.css")])

(def header-links
  [:div#header-links
   "[ "
   [:a {:href "/"} "index"]
   " | "
   [:a {:href "/index.html"} "Add a Location"]
   " | "
   [:a {:href "/all-locations"} "View All Locations"]
   " ]"])

(defn home-page
  []
  (hic-p/html5
    (gen-page-head "")
    header-links
    [:h1 "Home"]
    [:p "Webapp to store and display some 2D (x,y) locations."]))