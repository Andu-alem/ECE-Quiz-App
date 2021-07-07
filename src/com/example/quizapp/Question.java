package com.example.quizapp;
import android.app.Activity;


public class Question extends Activity {
		private int ID;
		private String CCODE;
		private String QUESTION;
		private String OPTA;
		private String OPTB;
		private String OPTC;
		private String OPTD;
		private String ANSWER;
		private String QBY;
		
		public Question() {
			ID = 0;
			CCODE = "";
			QUESTION = "";
			OPTA = "";
			OPTB = "";
			OPTC = "";
			OPTD = "";
			ANSWER = "";
			QBY = "";
		}
		public Question(String cCODE, String qUESTION, String oPTA, String oPTB,
		String oPTC,String oPTD, String aNSWER,String qBY) {
			CCODE = cCODE;
			QUESTION = qUESTION;
			OPTA = oPTA;
			OPTB = oPTB;
			OPTC = oPTC;
			OPTD = oPTD;
			ANSWER = aNSWER;
			QBY = qBY;
		}
		public int getID() {
		return ID;
		}
		public String getCCODE() {
			return CCODE;
		}
		public String getQUESTION() {
			return QUESTION;
		}
		public String getOPTA() {
			return OPTA;
		}
		public String getOPTB() {
			return OPTB;
		}
		public String getOPTC() {
			return OPTC;
		}
		public String getOPTD() {
			return OPTD;
		}
		public String getANSWER() {
			return ANSWER;
		}
		public String getQBY() {
			return QBY;
		}
		
		public void setID(int id) {
			ID = id;
		}
		public void setCCODE(String cCODE) {
			CCODE = cCODE;
		}
		public void setQUESTION(String qUESTION) {
			QUESTION = qUESTION;
		}
		public void setOPTA(String oPTA) {
			OPTA = oPTA;
		}
		public void setOPTB(String oPTB) {
			OPTB = oPTB;
		}
		public void setOPTC(String oPTC) {
			OPTC = oPTC;
		}
		public void setOPTD(String oPTD) {
			OPTD = oPTD;
		}
		public void setANSWER(String aNSWER) {
			ANSWER = aNSWER;
		}
		public void setQBY(String qBY) {
			QBY = qBY;
		}
}
