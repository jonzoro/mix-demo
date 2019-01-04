(defproject mix-demo "0.1.0-SNAPSHOT"
  :description "FIXME: write description"
  :url "http://example.com/FIXME"
  :license {:name "Eclipse Public License"
            :url "http://www.eclipse.org/legal/epl-v10.html"}

  :dependencies [[org.clojure/clojure "1.8.0"]]

  ;; If you'd rather use a different directory structure, you can set these.
  :source-paths ["src/main/clojure"]
  :java-source-paths ["src/main/java"]  ; Java source is stored separately.

  ;; Options to pass to java compiler for java source,
  ;; exactly the same as command line arguments to javac.
  :javac-options ["-target" "1.8" "-source" "1.8" "-Xlint:-options"]

  :main ^:skip-aot com.jonz.demo.core)

