(ns advent-of-code-2023.day1-test
  (:require [clojure.test :refer :all]
            [advent-of-code-2023.day1 :refer :all]))

(deftest day1-part1-example
  (testing "Day 1 example"
    (is (= (find-calibration-value-sum "day1-example.txt") 142))))

(deftest day1-part1-full
  (testing "Day 1 full"
    (is (= (find-calibration-value-sum "day1-full.txt") 54953))))

(deftest day1-part2-example
  (testing "Day 2 example"
    (is (= (find-calibration-value-sum-2 "day1-example-2.txt") 281))))

(deftest day1-part2-full
  (testing "Day 2 full"
    (is (= (find-calibration-value-sum-2 "day1-full.txt") 53868))))
