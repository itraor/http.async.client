(defproject org.clojars.vgeshel/http.async.client "0.2.2-SNAPSHOT"
  :description      "Asynchronous HTTP Client for Clojure"
  :url              "http://github.com/neotyk/http.async.client/"
  :source-path      "src/clj"
  :java-source-path "src/jvm"
  :min-lein-version "1.4.1"
  :dependencies     [[org.clojure/clojure "1.2.0"]
		     [org.clojure/clojure-contrib "1.2.0"]
		     [com.ning/async-http-client "1.5.0-SNAPSHOT"]]
  :dev-dependencies [[swank-clojure "1.2.1"]
		     ;[autodoc "0.7.1"]
                     [org.danlarkin/clojure-json "1.1"]
                     [org.eclipse.jetty/jetty-server "7.1.4.v20100610"]
                     [org.eclipse.jetty/jetty-security "7.1.4.v20100610"]
                     [lein-difftest "1.2.2"]
                     [lein-run "1.0.0"]
                     [log4j "1.2.13"]]
  :repository {"snapshots" "http://oss.sonatype.org/content/repositories/snapshots/"}
  :autodoc {:name "http.async.client"
            :web-src-dir "http://github.com/neotyk/http.async.client/blob/"
            :web-home "http://neotyk.github.com/http.async.client/autodoc/"
            :copyright "Copyright 2010 Hubert Iwaniuk"})
