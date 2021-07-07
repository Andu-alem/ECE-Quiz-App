package com.example.quizapp;

import android.os.*;
import android.view.View;
//import android.view.View;
import android.app.*;
//import android.content.*;
import android.content.Intent;

public class About_usActivity extends Activity
{
    /** Called when the activity is first created. */
    @Override
    public void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.about_us);
        
    }
    public void onAboutClick(View view)
    {
    	finish();
    }
}