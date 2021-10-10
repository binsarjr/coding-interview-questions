**Spinners**

```
Spinners provide a quick way to select one value from a set. In the default state,
a spinner shows its currently selected value. Touching the spinner displays a dropdown
menu with all other available values, from which the user can select a new one.

```

**Populate the Spinner with User Choices**

```
The choices you provide for the spinner can come from any source, but must be provided
through an SpinnerAdapter, such as an ArrayAdapter if the choices are available in an array
or a CursorAdapter if the choices are available from a database query.

```

```
The createFromResource() method allows you to create an ArrayAdapter from the string array.
The third argument for this method is a layout resource that defines how the selected choice
appears in the spinner control. The simple_spinner_item layout is provided by the platform and
is the default layout you should use unless you'd like to define your own layout for the spinner's appearance.

```

**Responding to User Selections**

```
When the user selects an item from the drop-down, the Spinner object receives an on-item-selected event.

To define the selection event handler for a spinner, implement the AdapterView.OnItemSelectedListener interface
and the corresponding onItemSelected() callback method.

```

For more info about spinner visit [here](https://developer.android.com/guide/topics/ui/controls/spinner)
