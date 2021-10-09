**View Binding**
```
View binding is a feature that allows you to more easily write code that interacts with views. 
Once view binding is enabled in a module, it generates a binding class for each XML layout file present in that module.
An instance of a binding class contains direct references to all views that have an ID in the corresponding layout.

```
**Use view binding in activities**
```
1) To set up an instance of the binding class for use with an activity, perform the following steps in the activity's onCreate() method:

2) Call the static inflate() method included in the generated binding class. This creates an instance of the binding class for the activity to use.
   Get a reference to the root view by either calling the getRoot() method or using Kotlin property syntax.
3) Pass the root view to setContentView() to make it the active view on the screen.

```
**Use view binding in fragments**
```
1) To set up an instance of the binding class for use with a fragment, perform the following steps in the fragment's onCreateView() method:

2) Call the static inflate() method included in the generated binding class. This creates an instance of the binding class for the fragment to use.
   Get a reference to the root view by either calling the getRoot() method or using Kotlin property syntax.
3) Return the root view from the onCreateView() method to make it the active view on the screen.

```
More info about View Binding click [here](https://developer.android.com/topic/libraries/view-binding)

**Data Binding Library**
```
The Data Binding Library is a support library that allows you to bind UI components in your layouts to data sources in your app using a declarative
format rather than programmatically.

Layouts are often defined in activities with code that calls UI framework methods. For example, the code below calls findViewById() to find a 
TextView widget and bind it to the userName property of the viewModel variable

```
More info about Data Binding click [here](https://developer.android.com/topic/libraries/data-binding)

