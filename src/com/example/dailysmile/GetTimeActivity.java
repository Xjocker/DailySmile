package com.example.dailysmile;

import android.content.*;
import android.view.View;
import android.os.Bundle;

import android.app.Activity;
import android.view.Menu;
import android.widget.Button;
import android.widget.TimePicker;


public class GetTimeActivity extends Activity {
	


	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_get_time);
		
		
		//Capture the time
		 
	
		
		Button button1=(Button) findViewById(R.id.button1);
		 
		 // Perform action on click
		final Context mycontext = this.getApplicationContext();
		button1.setOnClickListener(new View.OnClickListener() {
	             public void onClick(View v) {
	            	 TimePicker time=(TimePicker) findViewById(R.id.time);
	            	 int TimeE=time.getCurrentHour();
	            	 
	            	 
	             }
	         });
		
		
	
		//Save the time
		
	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.get_time, menu);
		return true;
	}

}
