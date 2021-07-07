package com.example.quizapp;


import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.Toast;
import android.app.Activity;
//import android.content.Intent;
import android.content.Intent;


public class StartActivity extends Activity
{
	
	
	public static String selectedCourselist="";
	Button btnPlay,btnBack;
	CheckBox ch11,ch21,ch22,ch23,ch24,ch25,ch26,ch27,ch28,ch29,ch210,ch31,ch32,ch33,ch34,ch35,ch36,ch37,ch38,ch39,ch310,ch311,ch312,ch41,ch42,ch43,ch44,ch45,ch46,ch47,ch48,ch49,ch410,ch411,ch412,ch413,ch414,ch415,ch416,ch417,ch418,ch419,ch420,ch421,ch422,ch423,ch424,ch425,ch426,ch427,ch428,ch429,ch430,ch431,ch432,ch433,ch434,ch51,ch52,ch53,ch54,ch55,ch56;
    @Override
    public void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.start);
        
        btnPlay = (Button) findViewById(R.id.startPlayButton);
        btnBack = (Button) findViewById(R.id.startBackButton);
        ch11 =(CheckBox) findViewById(R.id.ch11);
        ch21 =(CheckBox) findViewById(R.id.ch21);
        ch22 =(CheckBox) findViewById(R.id.ch22);
        ch23 =(CheckBox) findViewById(R.id.ch23);
        ch24 =(CheckBox) findViewById(R.id.ch24);
        ch25 =(CheckBox) findViewById(R.id.ch25);
        ch26 =(CheckBox) findViewById(R.id.ch26);
        ch27 =(CheckBox) findViewById(R.id.ch27);
        ch28 =(CheckBox) findViewById(R.id.ch28);
        ch29 =(CheckBox) findViewById(R.id.ch29);
        ch210 =(CheckBox) findViewById(R.id.ch210);
        ch31 =(CheckBox) findViewById(R.id.ch31);
        ch32 =(CheckBox) findViewById(R.id.ch32);
        ch33 =(CheckBox) findViewById(R.id.ch33);
        ch34 =(CheckBox) findViewById(R.id.ch34);
        ch35 =(CheckBox) findViewById(R.id.ch35);
        ch36 =(CheckBox) findViewById(R.id.ch36);
        ch37 =(CheckBox) findViewById(R.id.ch37);
        ch38 =(CheckBox) findViewById(R.id.ch38);
        ch39 =(CheckBox) findViewById(R.id.ch39);
        ch310 =(CheckBox) findViewById(R.id.ch310);
        ch311 =(CheckBox) findViewById(R.id.ch311);
        ch312 =(CheckBox) findViewById(R.id.ch312);
        ch41 =(CheckBox) findViewById(R.id.ch41);
        ch42 =(CheckBox) findViewById(R.id.ch42);
        ch43 =(CheckBox) findViewById(R.id.ch43);
        ch44 =(CheckBox) findViewById(R.id.ch44);
        ch45 =(CheckBox) findViewById(R.id.ch45);
        ch46 =(CheckBox) findViewById(R.id.ch46);
        ch47 =(CheckBox) findViewById(R.id.ch47);
        ch48 =(CheckBox) findViewById(R.id.ch48);
        ch49 =(CheckBox) findViewById(R.id.ch49);
        ch410 =(CheckBox) findViewById(R.id.ch410);
        ch411 =(CheckBox) findViewById(R.id.ch411);
        ch412 =(CheckBox) findViewById(R.id.ch412);
        ch413 =(CheckBox) findViewById(R.id.ch413);
        ch414 =(CheckBox) findViewById(R.id.ch414);
        ch415 =(CheckBox) findViewById(R.id.ch415);
        ch416 =(CheckBox) findViewById(R.id.ch416);
        ch417 =(CheckBox) findViewById(R.id.ch417);
        ch418 =(CheckBox) findViewById(R.id.ch418);
        ch419 =(CheckBox) findViewById(R.id.ch419);
        ch420 =(CheckBox) findViewById(R.id.ch420);
        ch421 =(CheckBox) findViewById(R.id.ch421);
        ch422 =(CheckBox) findViewById(R.id.ch422);
        ch423 =(CheckBox) findViewById(R.id.ch423);
        ch424 =(CheckBox) findViewById(R.id.ch424);
        ch425 =(CheckBox) findViewById(R.id.ch425);
        ch426 =(CheckBox) findViewById(R.id.ch426);
        ch427 =(CheckBox) findViewById(R.id.ch427);
        ch428 =(CheckBox) findViewById(R.id.ch428);
        ch429 =(CheckBox) findViewById(R.id.ch429);
        ch430 =(CheckBox) findViewById(R.id.ch430);
        ch431 =(CheckBox) findViewById(R.id.ch431);
        ch432 =(CheckBox) findViewById(R.id.ch432);
        ch433 =(CheckBox) findViewById(R.id.ch433);
        ch434 =(CheckBox) findViewById(R.id.ch434);
        ch51 =(CheckBox) findViewById(R.id.ch51);
        ch52 =(CheckBox) findViewById(R.id.ch52);
        ch53 =(CheckBox) findViewById(R.id.ch53);
        ch54 =(CheckBox) findViewById(R.id.ch54);
        ch55 =(CheckBox) findViewById(R.id.ch55);
        ch56 =(CheckBox) findViewById(R.id.ch56);
        
     /*   btnPlay.setOnClickListener( new View.OnClickListener() {
        	@Override
        	public void onClick(View v)
        	{
        		
        	}
       	});
       */ 
        
        btnBack.setOnClickListener( new View.OnClickListener() {
        	@Override
        	public void onClick(View v)
        	{
        		
        		finish();
        	}
        	});
        
    }
    
    
    public void courslist()
    {
    	
    	String courselist="SELECT * FROM quest WHERE ";
		int x=0;
	    try{ 
	    	if(ch11.isChecked()){if(x>0){courselist +=" OR";} courselist+=" qcorsecode='ch11'"; x++;}
			if(ch21.isChecked()){if(x>0){courselist +=" OR";} courselist+=" qcorsecode='ch21'"; x++;}
		   	if(ch22.isChecked()){if(x>0){courselist +=" OR";} courselist+=" qcorsecode='ch22'"; x++;}
		   	if(ch23.isChecked()){if(x>0){courselist +=" OR";} courselist+=" qcorsecode='ch23'"; x++;}
		   	if(ch24.isChecked()){if(x>0){courselist +=" OR";} courselist+=" qcorsecode='ch24'"; x++;}
		   	if(ch25.isChecked()){if(x>0){courselist +=" OR";} courselist+=" qcorsecode='ch25'"; x++;}
		   	if(ch26.isChecked()){if(x>0){courselist +=" OR";} courselist+=" qcorsecode='ch26'"; x++;}
		   	if(ch27.isChecked()){if(x>0){courselist +=" OR";} courselist+=" qcorsecode='ch27'"; x++;}
		   	if(ch28.isChecked()){if(x>0){courselist +=" OR";} courselist+=" qcorsecode='ch28'"; x++;}
		   	if(ch29.isChecked()){if(x>0){courselist +=" OR";} courselist+=" qcorsecode='ch29'"; x++;}
		   	if(ch210.isChecked()){if(x>0){courselist +=" OR";} courselist+=" qcorsecode='ch210'"; x++;}
		   	if(ch31.isChecked()){if(x>0){courselist +=" OR";} courselist+=" qcorsecode='ch31'"; x++;}
		   	if(ch32.isChecked()){if(x>0){courselist +=" OR";} courselist+=" qcorsecode='ch32'"; x++;}
		   	if(ch33.isChecked()){if(x>0){courselist +=" OR";} courselist+=" qcorsecode='ch33'"; x++;}
		   	if(ch34.isChecked()){if(x>0){courselist +=" OR";} courselist+=" qcorsecode='ch34'"; x++;}
		   	if(ch35.isChecked()){if(x>0){courselist +=" OR";} courselist+=" qcorsecode='ch35'"; x++;}
		   	if(ch36.isChecked()){if(x>0){courselist +=" OR";} courselist+=" qcorsecode='ch36'"; x++;}
		   	if(ch37.isChecked()){if(x>0){courselist +=" OR";} courselist+=" qcorsecode='ch37'"; x++;}
		   	if(ch38.isChecked()){if(x>0){courselist +=" OR";} courselist+=" qcorsecode='ch38'"; x++;}
		   	if(ch39.isChecked()){if(x>0){courselist +=" OR";} courselist+=" qcorsecode='ch39'"; x++;}
		   	if(ch310.isChecked()){if(x>0){courselist +=" OR";} courselist+=" qcorsecode='ch310'"; x++;}
		   	if(ch311.isChecked()){if(x>0){courselist +=" OR";} courselist+=" qcorsecode='ch311'"; x++;}
		   	if(ch312.isChecked()){if(x>0){courselist +=" OR";} courselist+=" qcorsecode='ch12'"; x++;}
		   	if(ch41.isChecked()){if(x>0){courselist +=" OR";} courselist+=" qcorsecode='ch41'"; x++;}
		   	if(ch42.isChecked()){if(x>0){courselist +=" OR";} courselist+=" qcorsecode='ch42'"; x++;}
		   	if(ch43.isChecked()){if(x>0){courselist +=" OR";} courselist+=" qcorsecode='ch43'"; x++;}
		   	if(ch44.isChecked()){if(x>0){courselist +=" OR";} courselist+=" qcorsecode='ch44'"; x++;}
		   	if(ch45.isChecked()){if(x>0){courselist +=" OR";} courselist+=" qcorsecode='ch45'"; x++;}
		   	if(ch46.isChecked()){if(x>0){courselist +=" OR";} courselist+=" qcorsecode='ch46'"; x++;}
		   	if(ch47.isChecked()){if(x>0){courselist +=" OR";} courselist+=" qcorsecode='ch47'"; x++;}
		   	if(ch48.isChecked()){if(x>0){courselist +=" OR";} courselist+=" qcorsecode='ch48'"; x++;}
		   	if(ch49.isChecked()){if(x>0){courselist +=" OR";} courselist+=" qcorsecode='ch49'"; x++;}
		   	if(ch410.isChecked()){if(x>0){courselist +=" OR";} courselist+=" qcorsecode='ch410'"; x++;}
		   	if(ch411.isChecked()){if(x>0){courselist +=" OR";} courselist+=" qcorsecode='ch411'"; x++;}
		   	if(ch412.isChecked()){if(x>0){courselist +=" OR";} courselist+=" qcorsecode='ch412'"; x++;}
		   	if(ch413.isChecked()){if(x>0){courselist +=" OR";} courselist+=" qcorsecode='ch413'"; x++;}
		   	if(ch414.isChecked()){if(x>0){courselist +=" OR";} courselist+=" qcorsecode='ch414'"; x++;}
		   	if(ch415.isChecked()){if(x>0){courselist +=" OR";} courselist+=" qcorsecode='ch415'"; x++;}
		   	if(ch416.isChecked()){if(x>0){courselist +=" OR";} courselist+=" qcorsecode='ch416'"; x++;}
		   	if(ch417.isChecked()){if(x>0){courselist +=" OR";} courselist+=" qcorsecode='ch417'"; x++;}
		   	if(ch418.isChecked()){if(x>0){courselist +=" OR";} courselist+=" qcorsecode='ch418'"; x++;}
		   	if(ch419.isChecked()){if(x>0){courselist +=" OR";} courselist+=" qcorsecode='ch419'"; x++;}
		   	if(ch420.isChecked()){if(x>0){courselist +=" OR";} courselist+=" qcorsecode='ch420'"; x++;}
		   	if(ch421.isChecked()){if(x>0){courselist +=" OR";} courselist+=" qcorsecode='ch421'"; x++;}
		   	if(ch422.isChecked()){if(x>0){courselist +=" OR";} courselist+=" qcorsecode='ch422'"; x++;}
		   	if(ch423.isChecked()){if(x>0){courselist +=" OR";} courselist+=" qcorsecode='ch423'"; x++;}
		   	if(ch424.isChecked()){if(x>0){courselist +=" OR";} courselist+=" qcorsecode='ch424'"; x++;}
		   	if(ch425.isChecked()){if(x>0){courselist +=" OR";} courselist+=" qcorsecode='ch425'"; x++;}
		   	if(ch426.isChecked()){if(x>0){courselist +=" OR";} courselist+=" qcorsecode='ch426'"; x++;}
		   	if(ch427.isChecked()){if(x>0){courselist +=" OR";} courselist+=" qcorsecode='ch427'"; x++;}
		   	if(ch428.isChecked()){if(x>0){courselist +=" OR";} courselist+=" qcorsecode='ch428'"; x++;}
		   	if(ch429.isChecked()){if(x>0){courselist +=" OR";} courselist+=" qcorsecode='ch429'"; x++;}
		   	if(ch430.isChecked()){if(x>0){courselist +=" OR";} courselist+=" qcorsecode='ch430'"; x++;}
		   	if(ch431.isChecked()){if(x>0){courselist +=" OR";} courselist+=" qcorsecode='ch431'"; x++;}
		   	if(ch432.isChecked()){if(x>0){courselist +=" OR";} courselist+=" qcorsecode='ch432'"; x++;}
		   	if(ch433.isChecked()){if(x>0){courselist +=" OR";} courselist+=" qcorsecode='ch433'"; x++;}
		   	if(ch434.isChecked()){if(x>0){courselist +=" OR";} courselist+=" qcorsecode='ch44'"; x++;}
		   	if(ch51.isChecked()){if(x>0){courselist +=" OR";} courselist+=" qcorsecode='ch51'"; x++;}
		   	if(ch52.isChecked()){if(x>0){courselist +=" OR";} courselist+=" qcorsecode='ch52'"; x++;}
		   	if(ch53.isChecked()){if(x>0){courselist +=" OR";} courselist+=" qcorsecode='ch53'"; x++;}
		   	if(ch54.isChecked()){if(x>0){courselist +=" OR";} courselist+=" qcorsecode='ch54'"; x++;}
		   	if(ch55.isChecked()){if(x>0){courselist +=" OR";} courselist+=" qcorsecode='ch55'"; x++;}
		   	if(ch56.isChecked()){if(x>0){courselist +=" OR";} courselist+=" qcorsecode='ch56'"; x++;}
		   	
		  }
	      catch(Exception e){}	
	
	      selectedCourselist = courselist;
    
    }
    
    
    public void onCheckBoxkClick(View view)
    {
    	    	
    }
    
    public void onStartPlayClick(View v)
    {
    	try{
    		
    		courslist();
    		
    	   if(selectedCourselist!="SELECT * FROM quest WHERE "){
    	        Intent startInt=new Intent(this, QuestionActivity1.class);
                startActivity(startInt);
              } 
    	   else
              {
    		   Toast.makeText(getApplicationContext(), "Select at list One Course", Toast. LENGTH_SHORT ).show();
              }
    	   
    	}catch(Exception e){}
    }
    
    
    public String getcourselist()
    {
    	
    	return selectedCourselist;
    }
}