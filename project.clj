(defproject nail-polish-bot "0.1.0-SNAPSHOT"
  :description "A silly little project that generates random scenes of
                nail polish bottles using POV-Ray and posts them to
                a special Twitter account"
  :url "https://github.com/quephird/nail-polish-bot"
  :license {:name "Eclipse Public License"
            :url "http://www.eclipse.org/legal/epl-v10.html"}
  :dependencies [[org.clojure/clojure "1.8.0"]
                 [me.raynes/conch "0.8.0"]
                 [twitter-api "1.8.0"]
                 [environ "1.1.0"]]
  :min-lein-version "2.0.0"
  :main nail-polish-bot.core)
