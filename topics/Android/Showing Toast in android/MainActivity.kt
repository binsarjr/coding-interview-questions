import android.widget.Toast

btnShowToast.setonClickListener{
  Toast.makeText(application context,
                text"Hi,I'm a toast!",Toast.LENGTH_LONG).show()
}

                       or

btnShowToast.setonClickListener{
  Toast.makeText(context:this,
                text:"Hi I'm a toast!",Toast.LENGTH_LONG).show()
}

//Here I have shown two ways to use toasts in android app 
