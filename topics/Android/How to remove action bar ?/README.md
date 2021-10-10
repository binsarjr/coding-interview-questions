**How to remove the action bar ? **

```
To remove the ActionBar from all activities, we can set the parent of the default AppTheme in the styles.xml file
to “Theme.AppCompat.Light.NoActionBar”or “Theme.AppCompat.NoActionBar”.
If we want to remove the ActionBar only from specific activities, we can create a child theme with the AppTheme as 
it’s parent, set windowActionBar to false and windowNoTitle to true and then apply this theme on an activitylevel 
by using the android:theme attribute in the AndroidManifest.xml file.

```
