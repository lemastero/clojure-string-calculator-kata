(ns string-calculator.core)

(defn- tokenize-by-delimiter [s]
  (clojure.string/split s #" "))

(defn- string-as-numbers [s]
  (map read-string (tokenize-by-delimiter s)))


(defn sum-numbers
  "Summ numbers passed in string"
  [s]
  (if (empty? s)
      0
      (reduce + (string-as-numbers s))))

