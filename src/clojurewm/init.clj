(assembly-load "clojurewm")
(assembly-load "ClojureClrEx")
(assembly-load "System.Windows.Forms")

(ns clojurewm.init
  (:require [clojure.tools.logging :as log]
            [clojurewm.keys :as keys]
            [clojurewm.win :as win])
  (:import [System.Windows.Forms Screen]))

(keys/init-hooks)

(let [screen (Screen/PrimaryScreen)
        width (.. screen WorkingArea Width)
        screen-height (.. screen WorkingArea Height)
        height (int 30)
      window-top (int (- screen-height height))]
  (doto win/info-bar
    (.set_Width width)
    (.set_Height height)
    (.set_Left 0)
    (.set_Top window-top)))
