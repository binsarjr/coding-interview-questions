```
An enter transition determines how views in an activity enter the scene.
For example, in the explode enter transition, the views enter the scene
from the outside and fly in towards the center of the screen.

```

```
An exit transition determines how views in an activity exit the scene.
For example, in the explode exit transition, the views exit the scene away from the center.

```

```
A shared elements transition determines how views that are shared between two activities transition between these activities.
For example, if two activities have the same image in different positions and sizes,the changeImageTransform shared element 
transition translates and scales the image smoothly between these activities.

```
**Android supports these enter and exit transitions:**
```

explode - Moves views in or out from the center of the scene.
slide - Moves views in or out from one of the edges of the scene.
fade - Adds or removes a view from the scene by changing its opacity.

```
```
Any transition that extends the Visibility class is supported as an enter or exit transition.
For more information,see the API reference for the Transition class.

Android also supports these shared elements transitions:

changeBounds - Animates the changes in layout bounds of target views.
changeClipBounds - Animates the changes in clip bounds of target views.
changeTransform - Animates the changes in scale and rotation of target views.
changeImageTransform - Animates changes in size and scale of target images.

```
