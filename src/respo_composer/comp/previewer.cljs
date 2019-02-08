
(ns respo-composer.comp.previewer
  (:require [hsl.core :refer [hsl]]
            [respo-ui.core :as ui]
            [respo.core
             :refer
             [defcomp cursor-> action-> mutation-> <> div button textarea span]]
            [respo.comp.space :refer [=<]]
            [respo-md.comp.md :refer [comp-md]]
            [respo-composer.config :refer [dev?]]))

(defcomp
 comp-previewer
 (template mock-data shadows?)
 (div
  {:style (merge ui/flex ui/center {:background-color (hsl 0 0 90)}),
   :class-name (if shadows? "use-shadows" nil)}
  (<> "previewer")))
