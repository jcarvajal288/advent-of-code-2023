(ns advent-of-code-2023.day1
  (:require [advent-of-code-2023.util :refer :all]
            [clojure.string :as str]))

(defn find-calibration-value-sum [filename]
  (->> (get-resource-file-by-line filename)
       (map #(filter is-digit? %))
       (map #(vec [(first %) (last %)]))
       (map #(str/join "" %))
       (map str-to-int)
       (reduce +)))

(defn contains-number-word? [word]
  (let [number-words ["one" "two" "three" "four" "five" "six" "seven" "eight" "nine"]]
    (boolean (some true? (map #(str/includes? word %) number-words)))))

(defn get-number [word]
  (cond
    (str/includes? word "one") \1
    (str/includes? word "two") \2
    (str/includes? word "three") \3
    (str/includes? word "four") \4
    (str/includes? word "five") \5
    (str/includes? word "six") \6
    (str/includes? word "seven") \7
    (str/includes? word "eight") \8
    :else \9))

(defn find-first-number [line]
  (let [iterate (fn [current rest]
                  (cond
                    (is-digit? (first rest)) (first rest)
                    (contains-number-word? (str current (first rest)))
                                     (get-number (str current (first rest)))
                    :else (recur (str current (first rest)) (next rest))))]
    (iterate "" line)))

(defn find-last-number [line]
  (let [iterate (fn [current rest]
                  (cond
                    (is-digit? (last rest)) (last rest)
                    (contains-number-word? (str (last rest) current))
                                     (get-number (str (last rest) current))
                    :else (recur (str (last rest) current) (butlast rest))))]
    (iterate "" line)))

(defn parse-number-words [line]
  [(find-first-number line) (find-last-number line)])

(defn find-calibration-value-sum-2 [filename]
  (->> (get-resource-file-by-line filename)
       (map #(parse-number-words %))
       (map #(filter is-digit? %))
       (map #(vec [(first %) (last %)]))
       (map #(str/join "" %))
       (map str-to-int)
       (reduce +)))
