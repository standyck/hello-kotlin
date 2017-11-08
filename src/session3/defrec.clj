(defrecord User [name age])

(def u (->User "Stan" 19))
;; or
(def u (map->User {:name "Stan" :age 19}))

(println u)
