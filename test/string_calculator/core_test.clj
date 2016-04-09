(ns string-calculator.core-test
  (:require [expectations :refer :all]
            [string-calculator.core :refer :all]))

;; An empty string should return 0
(expect 0 (sum-numbers ""))

;; When string contains single digit then returns given digit as integer
(expect 0 (sum-numbers "0"))
(expect 1 (sum-numbers "1"))

;; When string contains two digits space separated then returns sum of them
(expect 2 (sum-numbers "1 1"))
