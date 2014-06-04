(defproject ring/ring-headers "0.1.0-SNAPSHOT"
  :description "Ring middleware for common response headers"
  :url "https://github.com/ring-clojure/ring-headers"
  :license {:name "The MIT License"
            :url "http://opensource.org/licenses/MIT"}
  :dependencies [[org.clojure/clojure "1.3.0"]
                 [ring/ring-core "1.3.0"]]
  :profiles
  {:dev {:dependencies [[ring-mock "0.1.5"]]}})
