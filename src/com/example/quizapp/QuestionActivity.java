package com.example.quizapp;



import android.app.Activity;
import android.os.Bundle;
import android.widget.Button;
import android.widget.TextView;
import java.util.List;

public class QuestionActivity extends Activity
{
	
    /** Called when the activity is first created. */
	
	List<Question> quesList;
	int score = 0;
	int qid = 0;
	StartActivity q = new StartActivity();
	Question currentQ;
	TextView txtQuestion, times, scored;
	Button buttonA, buttonB, buttonC,buttonD;
	@Override
    public void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.question);
        txtQuestion = (TextView) findViewById(R.id.questiontv);
        String x;
        //x= q.getLists();
        x = q.getcourselist();
        txtQuestion.setText(x);
        
    }
}