(ns corax.core-test
  (:require [clojure.test :refer :all]
            [corax.calculator :refer :all]))

(deftest adding
  (is (= 4 (plus 2 2))))

(deftest dividing
  (is (= 4 (divide 8 2))))

(deftest diving-by-zero
  (is (thrown? ArithmeticException (divide 1 0))))
