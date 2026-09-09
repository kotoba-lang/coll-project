(ns kotoba.coll.project
  "project -- one definition, addressed on its own.

  Split out of kotoba.lang.text on 2026-09-09. The unit here is the
  DEFINITION, not the library: this repo holds project and names, in its
  deps.edn, exactly the definitions project reaches. Nothing else."
  )

(defn project
  "Return a relation (set of maps) built from `xrel` by keeping only the
  keys in `ks` of each map. Mirrors clojure.set/project. Maps that become
  identical after projecting (because the dropped keys were the only
  difference) collapse into one entry, since the result is a set."
  [xrel ks]
  (set (map #(select-keys % ks) xrel)))
