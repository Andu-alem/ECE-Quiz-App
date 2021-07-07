package com.example.quizapp;
import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

import java.util.List;


public class QuestionActivity1 extends Activity {
	List<Question> quesList;
	int qid = 0,attempt;
	String info = "";
	public static int score = 0;
	public int no_question=0;
	Question currentQ;
	TextView txtQuestion, times, qby, noQ, scr_view, life;
	Button button1, button2, button3, button4;
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.question);
		
		QuizHelper db = new QuizHelper(this); // my question bank class
		quesList = db.getAllQuestions(); // this will fetch all selected course questions
		no_question = quesList.size(); //this will save maximum question number
		
		
		//declare fields
		attempt=3;
		life =(TextView) findViewById(R.id.life);
		life.setText("Attempt:"+Integer.toString(attempt));
		scr_view =(TextView) findViewById(R.id.score);
		noQ = (TextView) findViewById(R.id.numberofQ);
		String qr = "Questions:"+Integer.toString(no_question);
		noQ.setText(qr);
		txtQuestion = (TextView) findViewById(R.id.questiontv);
		qby = (TextView) findViewById(R.id.qbytv);
		//times = (TextView) findViewById(R.id.timers);
		//times.setText("");
		// the textview in which the question will be displayed
		// the three buttons,
		// the idea is to set the text of three buttons with the options from question bank
		button1 = (Button) findViewById(R.id.optionA);
		button2 = (Button) findViewById(R.id.optionB);
		button3 = (Button) findViewById(R.id.optionC);
		button4 = (Button) findViewById(R.id.optionD);
		// the textview in which score will be displayed
		//scored = (TextView) findViewById(R.id.score);


		// weather there is question or not
		checkQuestion();
		
		// button click listeners
		button1.setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View v) {
				// passing the button text to other method
				// to check whether the anser is correct or not
				// same for all three buttons
				if(info=="back")
				{
					finish();
				}
				else
				{
				getAnswer(button1.getText().toString());
				}
			}
		});
		button2.setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View v) {
				if(info=="back")
				{
					finish();
				}
				else
				{
				getAnswer(button2.getText().toString());
				}
			}
		});

		button3.setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View v)
			{
				if(info=="back")
				{
					finish();
				}
				else
				{
					getAnswer(button3.getText().toString());
				}
			}
		});
		button4.setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View v) {
				if(info=="back")
				{
					finish();
				}
				else
				{
					getAnswer(button4.getText().toString());
				}
			}
		});
	}


	public void getAnswer(String AnswerString) {

		if (currentQ.getANSWER().equals(AnswerString))
		{
			score++;
			String sc = "Score:"+Integer.toString(score);
			scr_view.setText(sc);
			if (qid < quesList.size()) {     // if questions are not over then do this
				
				Toast.makeText(getApplicationContext(), "correct", Toast. LENGTH_SHORT ).show();
				currentQ = quesList.get(qid);
				setQuestionView();
			}
			else{
				Toast.makeText(getApplicationContext(), "out of question correct", Toast. LENGTH_SHORT ).show();
				Intent intent = new Intent(QuestionActivity1.this,ResultActivity.class);
				// passing the int value
				intent.putExtra("score",score);
				intent.putExtra("numberofQ", no_question);
				score = 0;
				startActivity(intent);
                finish();
			}
			
		}
		
		else{ 
			// if questions are not correct then do this
			attempt--;
			life.setText("Attempt:"+Integer.toString(attempt));
			Toast.makeText(getApplicationContext(), "Wrong!!, answer is "+currentQ.getANSWER(), Toast. LENGTH_LONG ).show();
			
			if(attempt<1)
			{
				Toast.makeText(getApplicationContext(), "Gameover out of Life", Toast. LENGTH_SHORT ).show();
				Intent intent = new Intent(this, ResultActivity.class);
				intent.putExtra("score",score);
				intent.putExtra("numberofQ", no_question);
				score = 0;
                startActivity(intent);
                finish();
			}
			
			else
			{
				if (qid < quesList.size())
				{     // if questions are not over then do this
					currentQ = quesList.get(qid);
					setQuestionView();
				}
				else
				{
					Toast.makeText(getApplicationContext(), "Out of Questions!!", Toast. LENGTH_SHORT ).show();  
					Intent intent = new Intent(this, ResultActivity.class);
					intent.putExtra("score",score);
					intent.putExtra("numberofQ", no_question);
					score = 0;
	                startActivity(intent);
	                finish();
				}
				
			}
			
		}
		
	}


		
	public void checkQuestion()
	{
		if(quesList.size()>0)
		{
			//There is a Question here
			try{
				currentQ = quesList.get(qid); // the current question
				setQuestionView();
			}catch(Exception e)
			{
				
			}
		}

		else
		{
			//There is no Question here
			txtQuestion.setText("There is no quetion on your selected course list yet, please choose another courses to play");
			button1.setText("Go Back");
			button2.setText("Go Back");
			button3.setText("Go Back");
			button4.setText("Go Back");
			info = "back";
		}
	}
	
	public void gotoQuestion()
	{
		// If question are not over
		try{
			currentQ = quesList.get(qid); // the current question
		}catch(Exception e){}   
		setQuestionView();
		   
		   
	}
	
	private void setQuestionView()
	{
		// the method which will put all things together
		txtQuestion.setText(currentQ.getQUESTION());
		button1.setText(currentQ.getOPTA());
		button2.setText(currentQ.getOPTB());
		button3.setText(currentQ.getOPTC());
		button4.setText(currentQ.getOPTD());
		qby.setText(currentQ.getQBY());
		qid++;
	}
	
	/*
	public String getnuber() {
    	return getString(no_question);
	}
	
	public String getscore() {
    	return getString(score);
	}*/
}
