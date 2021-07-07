package com.example.quizapp;

import android.os.*;
import android.view.View;
//import android.view.View;
import android.app.*;
//import android.content.*;

public class InstructionActivity extends Activity
{
    /** Called when the activity is first created. */
    @Override
    public void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.instructions);
        
    }
    public void onInstructionBackClick(View view)
    {
    	finish();
    	
    }
    
}