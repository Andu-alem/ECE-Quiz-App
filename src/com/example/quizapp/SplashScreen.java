package com.example.quizapp;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;

public class SplashScreen extends Activity{
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.splash);
		
		new Handler().postDelayed(new Runnable(){

			@Override
			public void run() {
				// TODO Auto-generated method stub
				Intent i = new Intent(SplashScreen.this,ActivityMain.class);
				startActivity(i);
				finish();
			}
			
		}, 5000);
		
	}

}
