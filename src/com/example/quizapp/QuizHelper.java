package com.example.quizapp;
import android.content.ContentValues;
import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;
import java.util.ArrayList;
import java.util.List;


public class QuizHelper extends SQLiteOpenHelper {
	StartActivity sa = new StartActivity();
	String selectQuery = sa.getcourselist();
	private static final int DATABASE_VERSION = 1;
	// Database Name
	private static final String DATABASE_NAME = "quizone";
	// tasks table name
	private static final String TABLE_QUEST = "quest";
	// tasks Table Columns names
	private static final String KEY_ID = "qid";
	private static final String KEY_CCODE = "qcorsecode";
	private static final String KEY_QUES = "question";
	private static final String KEY_ANSWER = "answer"; // correct option
	private static final String KEY_OPTA = "opta"; // option a
	private static final String KEY_OPTB = "optb"; // option b
	private static final String KEY_OPTC = "optc"; // option c
	private static final String KEY_OPTD = "optd"; // option c
	private static final String KEY_QBY = "qby"; // option d
	private SQLiteDatabase dbase;
	
	
	public QuizHelper(Context context)
	{
		super(context, DATABASE_NAME, null, DATABASE_VERSION);
	}
	
	@Override
	public void onCreate(SQLiteDatabase db) {
		dbase = db;
		String sql = "CREATE TABLE IF NOT EXISTS " + TABLE_QUEST + " ( " + KEY_ID + " INTEGER PRIMARY KEY AUTOINCREMENT, " + KEY_CCODE + " TEXT, " + KEY_QUES + " TEXT,"  + KEY_OPTA + " TEXT, " + KEY_OPTB + " TEXT, " + KEY_OPTC + " TEXT," + KEY_OPTD + " TEXT, " + KEY_ANSWER + " TEXT,"+ KEY_QBY + " TEXT)";
		db.execSQL(sql);
		addQuestion();
		//db.close();
	}

	private void addQuestion() {
		//Fundamentals of Electrical Engineering Questions
		Question q1 = new Question("ch11" ,"What is the name of a pasive device that reduce flow of current", "Capacitor", "Inductor", "Resistor", "Transistor", "Resistor","(by Andualem)");
		this.addQuestion(q1);
		
		// Microprocessor and interfacing Questions
		Question q411 = new Question("ch41" ,"A microprocessor is a _________ chip integrating all the functions of a CPU of a computer.", "Multiple", "Single", "Double", "Triple", "Single" , "(by Ins. Ravi)");
		this.addQuestion(q411);
		Question q412 = new Question("ch41" ," Microprocessor is a/an _______ circuit that functions as the CPU of the compute ", "Electronic", "Mechanic", "Integrating", "Processing", "Electronic","(by Ins. Ravi)");
		this.addQuestion(q412);
		Question q413 = new Question("ch41" ," Microprocessor is the ______ of the computer and it perform all the computational tasks", "Main", "Heart", "Important", "Simple", "Heart" , "(by Ins. Ravi)");
		this.addQuestion(q413);
		Question q414 = new Question("ch41" ," The purpose of the microprocessor is to control ______ ", "Memory", "Switches", "Processing", "Tasks", "Memory" ,"(by Ins. Ravi)");
		this.addQuestion(q414);
		Question q415 = new Question("ch41" ,"The first digital electronic computer was built in the year________", "1950", "1960", "1940", "1930", "1940","(by Ins. Ravi)");
		this.addQuestion(q415);
		Question q416 = new Question("ch41" ," The intel 8086 microprocessor is a _______ processor", "8 bit", "16 bit", "4 bit", "4 bit", "16 bit", "(by Ins. Ravi)");
		this.addQuestion(q416);
		Question q417 = new Question("ch41" ," The CF is known as ________", "Condition flag", "Carry flag", "Common flag", "Single flag", "Carry flag", "(by Ins. Ravi)");
		this.addQuestion(q417);
		Question q418= new Question("ch41" ," The OF is called as _______ ", "Overflow flag", "Overdue flag", " One flag", "Over flag", "Overflow flag", "(by Ins. Ravi)");
		this.addQuestion(q418);
		Question q419= new Question("ch41" ," The register AX is formed by grouping ________", "AH & AL", "BH & BL", "CH & CL", "DH & DL", "AH & AL" , "(by Ins. Ravi)");
		this.addQuestion(q419);
		Question q4110= new Question("ch41" ," The SS is called as ________", "Single stack", "Stack segment" , "Sequence stack", "Random stack", "Stack segment", "by Ins. Ravi");
		this.addQuestion(q4110);
		Question q4111= new Question("ch41" ," The push source copies a word from source to ______", "Stack", "Memory", "Register", "Destination", "Stack", "(by Ins. Ravi)");
		this.addQuestion(q4111);
		Question q4112= new Question("ch41" ," The _______ is used to connect more microprocessor", "Peripheral device", "Cascade" , "I/O devices", "Control unit", "Cascade", "(by Ins. Ravi)");
		this.addQuestion(q4112);
		Question q4114= new Question("ch41" ," ALE stands for ___________", "Address latch enable", "Address level enable", "Address leak enable", "Address leak extension", "Address latch enable" , "(by Ins. Ravi)");
		this.addQuestion(q4114);
		Question q4115= new Question("ch41" ," In 8086 microprocessor the following has the highest priority among all type interrupts?", "NMI", "DIV 0", "TYPE 255", "OVER FLOW", "NMI", "(by Ins. Ravi)");
		this.addQuestion(q4115);
		Question q4116= new Question("ch41" ," The ___ bus controller device decodes the signals to produce the control bus signal", "Internal", "Data", "Address", "External", "External", "(by Ins. Ravi)");
		this.addQuestion(q4116);
		Question q4117= new Question("ch41" ," A _____ Instruction at the end of interrupt service program takes the execution back to the", "Forward", "Return", "Address", "Line", "Line", "(by Ins. Ravi)");
		this.addQuestion(q4117);
		Question q4118= new Question("ch41" ," The main concerns of the ___________ are to define a flexible set of commands", "Memory interface", "Peripheral interface", "Both (A) and (B)", "Control interface", "Memory interface", "(by Ins. Ravi)");
		this.addQuestion(q4118);
		Question q4119= new Question("ch41" ," Primary function of memory interfacing is that the _________ should be able to read from and write into register", "Multiprocessor", "Microprocessor", "Dual Processor", "Coprocessor", "Microprocessor", "(by Ins. Ravi)");
		this.addQuestion(q4119);
		Question q4120 = new Question("ch41" ," To interface memory with the microprocessor, connect register the lines of the address bus must be added to address lines of the _______ chip.", "Single", "Memory", "Multiple", "Triple", "Memory", "(by Ins. Ravi)");
		this.addQuestion(q4120);
		Question q4121= new Question("ch41" ," __________ generate interrupt signal to microprocessor and receive acknowledge", "Priority resolver", "Control logic", "Interrupt request register", "Interrupt register", "Control logic", "(by Ins. Ravi)");
		this.addQuestion(q4121);
		
	
	
	}


//Adding new question
	public void addQuestion(Question quest) {
		//SQLiteDatabase db = this.getWritableDatabase();
		ContentValues values = new ContentValues();
		values.put(KEY_CCODE, quest.getCCODE());
		values.put(KEY_QUES, quest.getQUESTION());
		values.put(KEY_OPTA, quest.getOPTA());
		values.put(KEY_OPTB, quest.getOPTB());
		values.put(KEY_OPTC, quest.getOPTC());
		values.put(KEY_OPTD, quest.getOPTD());
		values.put(KEY_ANSWER, quest.getANSWER());
		values.put(KEY_QBY, quest.getQBY());
		//Inserting Row
		dbase.insert(TABLE_QUEST, null, values);
	}



	@Override
	public void onUpgrade(SQLiteDatabase db, int oldV, int newV) {
		// Drop older table if existed
		db.execSQL("DROP TABLE IF EXISTS " + TABLE_QUEST);
		// Create tables again
		onCreate(db);
	}


	public List<Question> getAllQuestions() {
		List<Question> quesList = new ArrayList<Question>();
		// Select All Query
		dbase = this.getReadableDatabase();
		Cursor cursor = dbase.rawQuery(selectQuery, null);
		
		// looping through all rows and adding to list
		if (cursor.moveToFirst()) {
			do {
				Question quest = new Question();
				quest.setID(cursor.getInt(0));
				quest.setCCODE(cursor.getString(1));
				quest.setQUESTION(cursor.getString(2));
				quest.setOPTA(cursor.getString(3));
				quest.setOPTB(cursor.getString(4));
				quest.setOPTC(cursor.getString(5));
				quest.setOPTD(cursor.getString(6));
				quest.setANSWER(cursor.getString(7));
				quest.setQBY(cursor.getString(8));
				quesList.add(quest);
			}
			while(cursor.moveToNext());
		}
		// return quest list
		return quesList;
	}


	public int rowcount()
	{
		int row=0;
		SQLiteDatabase db = this.getWritableDatabase();
		Cursor cursor = db.rawQuery(selectQuery, null);
		row=cursor.getCount();
		return row;
	}

}
