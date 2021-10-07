**GLIDE**

```
Glide is a fast and efficient open source media management and 
image loading framework for Android that wraps media decoding, memory and disk caching, 
and resource pooling into a simple and easy to use interface.

Glide supports fetching, decoding, and displaying video stills, images, and animated GIFs. 
Glide includes a flexible API that allows developers to plug in to almost any network stack. 
By default Glide uses a custom HttpUrlConnection based stack, 
but also includes utility libraries plug in to Google's Volley project or Square's OkHttp library instead
```

##**How to setup for Glide Library ?**

build.gradle:app

```
repositories {
  google()
  mavenCentral()
}

dependencies {
  implementation 'com.github.bumptech.glide:glide:4.12.0'
  annotationProcessor 'com.github.bumptech.glide:compiler:4.12.0'
}

```
MainActivity:


```
// For a simple view:
@Override public void onCreate(Bundle savedInstanceState) {
  ...
  ImageView imageView = (ImageView) findViewById(R.id.image_view);
  //you can you view binding/ data binding too

  Glide.with(this).load("http://goo.gl/gkljhd").into(imageView);
}

// For a simple image list:
@Override public View getView(int position, View recycled, ViewGroup container) {
  final ImageView myImageView;
  if (recycled == null) {
    myImageView = (ImageView) inflater.inflate(R.layout.my_image_view, container, false);
  } else {
    myImageView = (ImageView) recycled;
  }

  String url = myUrls.get(position);

  Glide
    .with(myFragment)
    .load(url)
    .centerCrop()
    .placeholder(R.drawable.loading_spinner)
    .into(myImageView);

  return myImageView;
}

```
