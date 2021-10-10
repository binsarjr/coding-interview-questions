**Guideline**

```
Utility class representing a Guideline helper object for ConstraintLayout.Helper objects are not displayed on device (they are marked as View.GONE)
and are only used for layout purposes. They only work within a ConstraintLayout.

A Guideline can be either horizontal or vertical:

-> Vertical Guidelines have a width of zero and the height of their ConstraintLayout parent
-> Horizontal Guidelines have a height of zero and the width of their ConstraintLayout parent
   Positioning a Guideline is possible in three different ways:

-> specifying a fixed distance from the left or the top of a layout (layout_constraintGuide_begin)
-> specifying a fixed distance from the right or the bottom of a layout (layout_constraintGuide_end)
-> specifying a percentage of the width or the height of a layout (layout_constraintGuide_percent)

```
For more information on how to use guidelines in android visit the documentation [here](https://developer.android.com/reference/androidx/constraintlayout/widget/Guideline)
