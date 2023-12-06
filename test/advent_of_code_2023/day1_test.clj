(ns advent-of-code-2023.day1-test
  (:require [clojure.test :refer :all]
            [advent-of-code-2023.day1 :refer :all]))

(deftest day1-example
  (testing "Day 1 example"
    (is (= (find-answer) 2))))