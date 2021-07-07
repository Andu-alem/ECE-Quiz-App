package com.example.quizapp;
import android.os.Bundle;
import android.app.Activity;
import android.content.Intent;
import android.view.Menu;
import android.view.View;

public class ActivityMain extends Activity {

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);
	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.activity_main, menu);
		return true;
	}
	
	
	 public void onMainStartButtonClick(View view)
	    {
	      Intent startIntent=new Intent(this, StartActivity.class);
	      startActivity(startIntent);
	    }
	    public void onMainSettingButtonClick(View view)
	    {
	    	Intent startIntent = new Intent(this, SettingActivity.class);
	        startActivity(startIntent);
	    	
	    }
	    public void onMaininstractionButtonClick(View view)
	    {
	    	Intent startIntent = new Intent(this, InstructionActivity.class);
	        startActivity(startIntent);
	    	
	    }
	    public void onMainaboutusButtonClick(View view)
	    {
	    	Intent startIntent = new Intent(this, About_usActivity.class);
	        startActivity(startIntent);
	    }
	    
	    
	    public void onMainExitButtonClick(View view)
	    {
	    	finish();
	    	
	    }

}
