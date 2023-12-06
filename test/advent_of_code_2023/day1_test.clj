(ns advent-of-code-2023.day1-test
  (:require [clojure.test :refer :all]
            [advent-of-code-2023.day1 :refer :all]))

(deftest day1-example
  (testing "Day 1 example"
    (is (= (find-calibration-value-sum "day1-example.txt") 142))))

(deftest day1-full
  (testing "Day 1 full"
    (is (= (find-calibration-value-sum "day1-full.txt") 142))))
