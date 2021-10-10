**Toasts overview**

```
A toast provides simple feedback about an operation in a small popup.
It only fills the amount of space required for the message and the current activity remains visible and interactive.
Toasts automatically disappear after a timeout.

For example, clicking Send on an email triggers a "Sending message..."
toast, as shown in the following screen capture

```

**Alternatives to using toasts**

```
If your app is in the foreground, consider using a snackbar instead of using a toast.
Snackbars include user-actionable options, which can provide a better app experience.

If your app is in the background, and you want users to take some action, use a notification instead.

```

**Instantiate a Toast object**

```
Use the makeText() method, which takes the following parameters:

1) The application Context.
2) The text that should appear to the user.
3) The duration that the toast should remain on the screen.

The makeText() method returns a properly initialized Toast object.

```
For more info visit [here](https://developer.android.com/guide/topics/ui/notifiers/toasts)


