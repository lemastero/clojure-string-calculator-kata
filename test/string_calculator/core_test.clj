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

;; Sum multiple numbers
(expect 6 (sum-numbers "1 2 3"))
(expect 15 (sum-numbers "1 2 3 4 5"))

;; Treat new line as separator
(expect 6 (sum-numbers "1\n2 3"))

;; Treat comma as separator
(expect 3 (sum-numbers "1,2"))

;; Allow specify custom delimiters
(expect 3 (sum-numbers "//;\n1;2"))

;; Ignore numbers greater than 1000
(expect 2 (sum-numbers "1001,2"))

;; Negative numbers shoud throw exception
(expect Exception (sum-numbers "-1,2"))


;; Handle multiple characters delimiters
(expect 6 (sum-numbers "/[***]\n1***2***3"))

;; Handle multiple delimiters
(expect 6 (sum-numbers "//[*][%]\n1*2%3"))
