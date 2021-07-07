package com.example.quizapp;

import android.os.*;
import android.view.View;
import android.app.Activity;

public class Entty extends Activity
{
    /** Called when the activity is first created. */
    @Override
    public void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        
    }
    
    public void onEnttyExitButtonClick(View view)
    {
    	finish();
    	
    }
}