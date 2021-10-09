Intent i = new Intent(this, NewlyStartedActivity.class);
startActivity(i);
overridePendingTransition(R.anim.fade_in, R.anim.fade_out);
//here we are starting an another activity using intents and at the start we applying transition effect 
