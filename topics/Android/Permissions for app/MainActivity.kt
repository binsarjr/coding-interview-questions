
private fun has WriteExternalStoragePermission()=Activitycompat.checkSelfPermission(this,
Manifest,permission.WRITE_EXTERNAL_STORAGE)==PackageManager.PERMISSION_GRANTED

private fun requestPermission(){
  var permissionToRequest=muitableListof<string>
  if(!hasWriteExternalStoragePermission()){
    permissionsToRequest.add(Manifest.permission.WRITE_EXTERNAL_STORAGE)
  }
}
//Here I have given the code to add the external storage permission 
//For more permissions refer documentation
