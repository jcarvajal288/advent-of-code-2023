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
