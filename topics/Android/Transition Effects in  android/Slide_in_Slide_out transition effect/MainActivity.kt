Intent i = new Intent(this, NewlyStartedActivity::class.java).also{
startActivity(i);
overridePendingTransition(R.anim.slide_in, R.anim.slide_out);
}
//here when we start another activity the slide transition can be seen 
