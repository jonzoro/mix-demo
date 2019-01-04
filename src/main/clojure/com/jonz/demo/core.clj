(ns com.jonz.demo.core
  (:import (com.jonz.demo Hello)))

(defn -main []
  (.sayHi (Hello.) "Jonz"))
