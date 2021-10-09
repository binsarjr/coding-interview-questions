class Fragments:Fragment(R.Layout.Fragments)
{
  private lateinit var binding:Fragments Binding
  
  override fun onview created(view:View,
                              saved Instance State:Bundle?){
    super.onviewCreated(view,savedInstance State)
    
    binding=FragmentsBinding.bind(view)
    binding.tvHelloWorld
  }
}
