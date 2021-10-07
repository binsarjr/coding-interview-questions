//This is an example of using Glide Library in a small project

//Here I am loading an image from the JSON response from an API
     
var currentUrl: String? = null
val url = "https://meme-api.herokuapp.com/gimme"
 
 
 private fun load() {
        val cache = DiskBasedCache(requireContext().cacheDir, 1024 * 1024) // 1MB cap

        // Set up the network to use HttpURLConnection as the HTTP client.
        val network = BasicNetwork(HurlStack())

        // Instantiate the RequestQueue with the cache and network. Start the queue.
        val requestQueue = RequestQueue(cache, network).apply {
            start()
        }
        binding.pbar.visibility = View.VISIBLE
        // Instantiate the RequestQueue.
        val jsonObjectRequest = JsonObjectRequest(
            Request.Method.GET, url, null,
            Response.Listener { response ->
                currentUrl = response.getString("url")

                Glide.with(requireContext()).load(currentUrl).listener(object : RequestListener<Drawable> {
                    override fun onResourceReady(
                        resource: Drawable?,
                        model: Any?,
                        target: Target<Drawable>?,
                        dataSource: DataSource?,
                        isFirstResource: Boolean
                    ): Boolean {
                        binding.pbar.visibility = View.GONE
                        return false
                    }

                    override fun onLoadFailed(
                        e: GlideException?,
                        model: Any?,
                        target: Target<Drawable>?,
                        isFirstResource: Boolean
                    ): Boolean {
                        binding.pbar.visibility = View.GONE
                        return false
                    }
                }).diskCacheStrategy(DiskCacheStrategy.ALL).into(binding.memeImg)
            },
            Response.ErrorListener {
                Toast.makeText(requireContext(), "Internet Error", Toast.LENGTH_SHORT).show()
            })
        // Add the request to the RequestQueue.
        VolleySingleton.getInstance(requireContext()).addToRequestQueue(jsonObjectRequest)
    }
    
 //I have used Volley Library too and that also with Singleton pattern. I will discuss this in a separate example in a separate folder
