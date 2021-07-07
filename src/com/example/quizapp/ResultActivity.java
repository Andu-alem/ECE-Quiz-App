package com.example.quizapp;

import android.os.*;
import android.view.View;
import android.widget.TextView;
import android.widget.Toast;
import android.app.*;

public class ResultActivity extends Activity
{
		TextView numberOfQuestion,result,score;
		public int scores=0,numbers=0;
		String nu="",re="",sc;
		
		
		
	    /** Called when the activity is first created. */
	    @Override
	    public void onCreate(Bundle savedInstanceState)
	    {
	    	super.onCreate(savedInstanceState);
	        setContentView(R.layout.result);
	        
	        // Bundle b = getIntent().getExtras();
	        // scores = b.getString("score","");
	        //noq = b.getString("numberofQ","");
	        scores = getIntent().getIntExtra("score", 0);
	        int noq = getIntent().getIntExtra("numberofQ", 0);
	        
	        //scores=getIntent().getIntExtra("score",0);
	        
	        numberOfQuestion = (TextView) findViewById(R.id.textResultnumbers);
	        numberOfQuestion.setText("From "+Integer.toString(noq)+" questions");
	        result = (TextView) findViewById(R.id.textResult);
	        score = (TextView) findViewById(R.id.textResultscore);
	        
	        score.setText("Your score is: "+Integer.toString(scores));
	        
	        //Toast.makeText(getApplicationContext(), scores, Toast. LENGTH_SHORT ).show();
	        
	    }
	    public void putvalues()
	    {
	    	
	    	
	    }
	   
	    public void onResultExitButtonClick(View view)
	    {
	    	finish();
	    	
	    }
    
}