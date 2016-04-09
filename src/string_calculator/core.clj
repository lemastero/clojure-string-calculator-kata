(ns string-calculator.core)

(defn- tokenize-by-delimiter [s]
  (re-seq #"-?\d+" s))

(defn- string-as-numbers [s]
  (map read-string (tokenize-by-delimiter s)))

(defn- less-than-1000 [n]
  (< n 1000))

(defn sum-numbers [s]
  (let [num (string-as-numbers s)]
    (when-let [negative-numbers (not-empty (filter neg? num))] ;; how to clean up
      (throw (Exception. (str "Negative not allowed:" negative-numbers)))) ;; TODO get rid of this monstrosity
  (reduce + (filter less-than-1000 num))))


