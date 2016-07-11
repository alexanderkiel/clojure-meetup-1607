(ns user)

;; What does Clojure look like?

(+ 3 4)
(max 8 17 2)
(print-str "Hello, World!")

;; Arithmetic

(+ 1 1)
(- 12 4)
(* 13 2)
(/ 27 9)
(+ 4/3 7/8)
(- 9 4.2 1/2)
(/ 27/2 1.5)

;; Assigning names to values

(def mangoes 3)
(def oranges 5)
(+ mangoes oranges)

;; Assign results to symbols

(def fruit (+ mangoes oranges))
(def average-fruit-amount (/ fruit 2))
average-fruit-amount

;; Vectors

(vector 5 10 15)
(conj [5 10] 15)

(count [5 10 15])
(nth [5 10 15] 1)
(first [5 10 15])
(rest [5 10 15])

;; Maps

{:first "Sally" :last "Brown"}
{:a 1 :b "two"}
{}

(assoc {:first "Sally"} :last "Brown")
(dissoc {:first "Sally" :last "Brown"} :last)
(merge {:first "Sally"} {:last "Brown"})

(count {:first "Sally" :last "Brown"})
(get {:first "Sally" :last "Brown"} :first)
(get {:first "Sally"} :last)
(get {:first "Sally"} :last :MISS)

(keys {:first "Sally" :last "Brown"})
(vals {:first "Sally" :last "Brown"})

;; Maps - Update

(def hello {:count 1 :words "hello"})
(update hello :count inc)
(update hello :words str ", world")

;; Vector of Maps

(def characters
  [{:name "Snoopy"
    :species "dog"}
   {:name "Woodstock"
    :species "bird"}
   {:name "Charlie Brown"
    :species "human"}])

(:name (first characters))
(map :name characters)

;; Functions - map

(map count ["a" "abc" "abcdefg"])
(map even? [0 1 2 3 4])

;; Functions - reduce

(reduce + [30 60 90])
(reduce str ["h" "e" "l" "l" "o"])

;; EXERCISE: Find the average

;; Flow Control - EXERCISE 1

(defn ordinal [n]
  (if ;; condition
    ;; then
    ;; else
    ))

(ordinal 1)
(ordinal 5)

;; Flow Control - EXERCISE 2

(ordinal 2)
(ordinal 3)

;; Flow Control - EXERCISE 3

(defn to-celcius [degrees scale]
  (cond
    ;; ...
    ))

;; NEXT: https://github.com/ClojureBridge/global-growth
