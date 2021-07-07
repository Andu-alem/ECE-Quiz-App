package com.example.quizapp;

import android.os.*;
import android.view.View;
//import android.view.View;
import android.app.*;
//import android.content.*;

public class SettingActivity extends Activity
{
    /** Called when the activity is first created. */
    @Override
    public void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.setting);
        
    }
    
    public void onSettingBackClick(View view)
    {
    	finish();
    	
    }
}