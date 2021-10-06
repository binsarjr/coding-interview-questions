 fun share() {

        val imageFolder = File(requireContext().cacheDir, "images")
        //cacheDir the kotlin way of accessing getCacheDir() function from JAVA
        var uri: Uri? = null
        try {
            imageFolder.mkdirs()
            val file = File(imageFolder, "shared_image.png")
            val image = binding.imageView.drawable.toBitmap() //Here I am extracting an image from an image view and converting it to Bitmap and the assigning it to a variable
            val fostream: FileOutputStream = FileOutputStream(file)
            image.compress(Bitmap.CompressFormat.PNG, 85, fostream)
            fostream.flush()
            fostream.close()
            uri = FileProvider.getUriForFile(requireContext(), ${BuildConfig.APPLICATION_ID}.provider, file)
            // use requireContext() in fragments and use this keyword if in an Activity
        } catch (e: IOException) {
            Log.d(ContentValues.TAG, "IOException while trying to write file for sharing: ")
        }

        val intent = Intent(Intent.ACTION_SEND).setType("images/png")
        intent.putExtra(Intent.EXTRA_STREAM, uri)
        intent.setFlags(Intent.FLAG_ACTIVITY_NEW_TASK)
        intent.addFlags(Intent.FLAG_GRANT_WRITE_URI_PERMISSION)
        intent.addFlags(Intent.FLAG_GRANT_READ_URI_PERMISSION)
        startActivity(Intent.createChooser(intent, "Share Image"))
    }
