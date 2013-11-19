package com.example.dailysmile;


import android.view.View;
import android.os.Bundle;
import android.os.Handler;
import android.app.Activity;
import android.view.Menu;
import android.content.Intent;




public class MainActivity extends Activity {

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);
		
	    //Start the second activity GetTimeActivity after 5 seconds
		int DELAY = 5000;

	    Handler handler = new Handler();
	    handler.postDelayed(new Runnable() {            
	        @Override
	        public void run() {
	        	
	        	//Start the second activity GetTimeActivity
	            Intent intent = new Intent(MainActivity.this, GetTimeActivity.class);
	            startActivity(intent);  
	            finish(); //To exit the app if we click on back button in the second activity so it finishes the fist activity directly
	        }
	    }, DELAY);


	    
	    
		
	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.main, menu);
		return true;
	}

}
