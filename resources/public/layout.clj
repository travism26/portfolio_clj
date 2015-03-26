(ns public.layout
  (:use [hiccup.core :only [html]])
  (:use [hiccup.page])
  (:use [hiccup.util])
  (:use [hiccup.def]))
;(defn index-page []
;  (html
;    [:div {:class "url"}
;    [:a {:href "http://clojure.org"} "Clojure - home"]])
;  )
;<script src="https://oss.maxcdn.com/libs/html5shiv/3.7.0/html5shiv.js"></script>
;<script src="https://oss.maxcdn.com/libs/respond.js/1.4.2/respond.min.js"></script>

(defn index-page []
  (html
    [:head
     [:title "Stylish Portfolio - Start Bootstrap Theme"]
     (include-css "css/bootstrap.min.css")
     (include-css "css/stylish-portfolio.css")
     (include-css "font-awesome/css/font-awesome.min.css")
     (include-css "http://fonts.googleapis.com/css?family=Source+Sans+Pro:300,400,700,300italic,400italic,700italic")
     [:script {:src "https://oss.maxcdn.com/libs/html5shiv/3.7.0/html5shiv.js"}]
     [:script {:src "https://oss.maxcdn.com/libs/respond.js/1.4.2/respond.min.js"}]
     ]
    [:body
     (nav)
     (header)
     (about-section)
     (services)
     [:div
      [:h1 {:class "info"} "Hiccup"]
      ]
     ]))

(defhtml header []
         [:header {:id "top" :class "header"}
          [:div {:class "text-vertical-center"}
           [:h1 "Start Bootstrap"]
           [:h3 "Free Bootstrap Themes & Templates"]
           [:br]
           [:a {:href "#about" :class "btn btn-dark btn-lg"} "Find Out More"]]]
         )

(defn nav []
  [:a {:id "menu-toggle" :href "#" :class "btn btn-dark btn-lg toggle"} [:i {:class "fa fa-bars"}]]
  [:nav {:id "sidebar-wrapper"}
   [:ul {:class "sidebar-nav"}
    [:a {:id "menu-close" :href "#" :class "btn btn-light btn-lg pull-right toggle"} [:i {:class "fa fa-times"}]]
    [:li {:class "sidebar-brand"} [:a {:href "#top" :onclick "$(\"#menu-close\").click();"} "Start Bootstrop"]]
    [:li [:a {:href "#top" :onclick "$(\"#menu-close\").click();"} "home"]]
    [:li [:a {:href "#about" :onclick "$(\"#menu-close\").click();"} "About"]]
    [:li [:a {:href "#services" :onclick "$(\"#menu-close\").click();"} "Services"]]
    [:li [:a {:href "#portfolio" :onclick "$(\"#menu-close\").click();"} "Portfolio"]]
    [:li [:a {:href "#contact" :onclick "$(\"#menu-close\").click();"} "Contact"]]
    ]]
  )
(defn about-section []
  [:section {:id "about" :class "about"}
   [:div {:class "container"}
    [:div {:class "row"}
     [:div {:class "col-lg-12 text-center"}
      [:h2 "Stylish Portfolio is the perfect theme for your next project!"]
      [:p {:class "lead"} "This theme features some wonderful photography courtesy of "
       [:a {:target "_blank" :href "http://join.deathtothestockphoto.com/"} "Death to the Stock Photo"] "."]]]]]
  )

(defn services []
  [:section {:id "service" :class "services bg-primary"}
   [:div {:class "container"}
    [:div {:class "row text-center"}
     [:div {:class "col-lg-10 col-lg-offset-1"}
      [:h2 "My Services"]
      [:hr {:class "small"}]
      [:div {:class "row"}
       [:div {:class "col-md-3 col-sm-6"}
        [:div {:class "service-item"}
         [:span {:class "fa-stack fa-4x"}
          [:i {:class "fa fa-circle fa-stack-2x"}]
          [:i {:class "fa fa-cloud fa-stack-1x text-primary"}]]
         [:h4 [:stong "SOME TITLE"]]
         [:p "SOME DESCRIPTION"]
         ]]]]]]])

(defn services-layout []
  [:section {:id "service" :class "services bg-primary"}
   [:div {:class "container"}
    [:div {:class "row text-center"}
     [:div {:class "col-lg-10 col-lg-offset-1"}
      [:h2 "My Services"]
      [:hr {:class "small"}]
      [:div {:class "row"}
       [:div {:class "col-md-3 col-sm-6"}
        [:div {:class "service-item"}
         [:span {:class "fa-stack fa-4x"}
          [:i {:class "fa fa-circle fa-stack-2x"}]
          [:i {:class "fa fa-cloud fa-stack-1x text-primary"}]]
         [:h4 [:stong "SOME TITLE"]]
         [:p "SOME DESCRIPTION"]
         ]]]]]]])

;<div class="col-lg-10 col-lg-offset-1">

; keeping just in case i break something :)
;[:a {:id "menu-toggle" :href "#" :class "btn btn-dark btn-lg toggle"} [:i {:class "fa fa-bars"}]]
;[:nav {:id "sidebar-wrapper"}
; [:ul {:class "sidebar-nav"}
;  [:a {:id "menu-close" :href "#" :class "btn btn-light btn-lg pull-right toggle"} [:i {:class "fa fa-times"}]]
;  [:li {:class "sidebar-brand"} [:a {:href "#top" :onclick "$(\"#menu-close\").click();"} "Start Bootstrop"]]
;  [:li [:a {:href "#top" :onclick "$(\"#menu-close\").click();"} "home"]]
;  [:li [:a {:href "#about" :onclick "$(\"#menu-close\").click();"} "About"]]
;  [:li [:a {:href "#services" :onclick "$(\"#menu-close\").click();"} "Services"]]
;  [:li [:a {:href "#portfolio" :onclick "$(\"#menu-close\").click();"} "Portfolio"]]
;  [:li [:a {:href "#contact" :onclick "$(\"#menu-close\").click();"} "Contact"]]
;  ]]                                                   ;NAVIGATION BAR
;[:header {:id "top" :class "header"}
; [:div {:class "text-vertical-center"}
;  [:h1 "Start Bootstrap"]
;  [:h3 "Free Bootstrap Themes & Templates"]
;  [:br]
;  [:a {:href "#about" :class "btn btn-dark btn-lg"} "Find Out More"]]]