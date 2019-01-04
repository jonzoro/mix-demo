(ns com.jonz.demo.core
  (:import (com.jonz.demo Test)
           (com.jonz.demo Hello$Client)
           (org.apache.thrift.protocol TBinaryProtocol)
           (org.apache.thrift.transport TSocket)))

(def transport (TSocket. "127.0.0.1" 9898 30000))
(def protocol (TBinaryProtocol. transport))
(def client (Hello$Client. protocol))

(defn test-mian []
  (.sayHi (Test.) "Jonz"))

(defn thrift-main []
  (.open transport)
  (println (.helloString client "Jonz")))

(defn -main []
  (thrift-main))
