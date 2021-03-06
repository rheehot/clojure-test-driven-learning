;; https://github.com/yogthos/markdown-clj
(ns clojure-learning-test.markdown-clj
  (:require [clojure.test :refer :all]
            [markdown.core :as md]))


(deftest string-to-string-test
  (is (= "<h1>hello</h1>" (md/md-to-html-string "# hello")))
  (is (= "<h1 id=\"hello\">hello</h1>"
         (md/md-to-html-string "# hello" :heading-anchors true)))
  (is (= "<p>$ hello</p>"
         (md/md-to-html-string "$ hello" :heading-anchors true))))


(deftest code-test
  (is (= "<pre><code class=\"clojure\">some code
</code></pre>"
         (md/md-to-html-string "```clojure
some code
```"))))
