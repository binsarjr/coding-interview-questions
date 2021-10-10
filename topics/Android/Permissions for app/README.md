**Permissions on Android**

```
App permissions help support user privacy by protecting access to the following:

Restricted data, such as system state and a user's contact information.
Restricted actions, such as connecting to a paired device and recording audio.

This page provides an overview to how Android permissions work, including a high-level
workflow for using permissions, descriptions of different types of permissions, and some
best practices for using permissions in your app. Other pages explain how to evaluate whether
your app needs to request permissions, declare permissions, request runtime permissions, and 
restrict how other apps can interact with your app's components.

```

**Workflow for using permissions**

```
If your app offers functionality that might require access to restricted data or restricted actions,
determine whether you can get the information or perform the actions without needing to declare permissions.
You can fulfill many use cases in your app, such as taking photos, pausing media playback, and displaying relevant ads,
without needing to declare any permissions.

If you decide that your app must access restricted data or perform restricted actions to fulfill a use case, declare
the appropriate permissions. Some permissions, known as install-time permissions, are automatically granted when your
app is installed. Other permissions, known as runtime permissions, require your app to go a step further and request
the permission at runtime.

```

Types of permissions

Android categorizes permissions into different types, including install-time permissions, runtime permissions,
and special permissions. Each permission's type indicates the scope of restricted data that your app can access,
and the scope of restricted actions that your app can perform, when the system grants your app that permission.

**Install-time permissions**

```
Install-time permissions give your app limited access to restricted data, and they allow your app to perform
restricted actions that minimally affect the system or other apps. When you declare install-time permissions 
in your app, the system automatically grants your app the permissions when the user installs your app.

```

**Normal permissions**

```
These permissions allow access to data and actions that extend beyond your app's sandbox.
However, the data and actions present very little risk to the user's privacy, and the operation of other apps.

The system assigns the "normal" protection level to normal permissions, as shown on the permissions API reference page.

```
**Signature permissions**

```
If the app declares a signature permission that another app has defined,
and if the two apps are signed by the same certificate,then the system grants
the permission to the first app at install time. Otherwise, that first app cannot be granted the permission.

```

**Runtime permissions**

```
Runtime permissions, also known as dangerous permissions, give your app additional access to restricted data,
and they allow your app to perform restricted actions that more substantially affect the system and other apps.
Therefore, you need to request runtime permissions in your app before you can access the restricted data or 
perform restricted actions.

Many runtime permissions access private user data, a special type of restricted data that includes potentially
sensitive information. Examples of private user data include location and contact information.

```

For more information visit the given link [here](https://developer.android.com/guide/topics/permissions/overview)
