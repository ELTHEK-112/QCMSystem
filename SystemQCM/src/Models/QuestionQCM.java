package Models;

import java.util.ArrayList;

public class QuestionQCM implements Comparable<QuestionQCM>{
	private int _iD;
	private int _points;
	private String Question;
 	
	public OnlineTest _onlinetest;
	public ArrayList<ResponseQCM> _responseqcm = new ArrayList<ResponseQCM>();
	
	

	public QuestionQCM(int _iD, int _points , String Question) {
		
		this.set_iD(_iD);
		this._points = _points;
		this.setQuestion(Question);
		this._onlinetest = new  OnlineTest();
		this._responseqcm = new ArrayList<ResponseQCM>();
		
	}

	public QuestionQCM() {
		// TODO Auto-generated constructor stub
	}

	public int getPoints() {
		return this._points;
	}

	public void setPoints(int aPoints) {
		this._points = aPoints;
	}

	public OnlineTest getOnlinetest() {
		return this._onlinetest;
	}

	public void setOnlinetest(OnlineTest aOnlinetest) {
		this._onlinetest = aOnlinetest;
	}
	public int get_iD() {
		return _iD;
	}

	public void set_iD(int _iD) {
		this._iD = _iD;
	}

	@Override
	public int compareTo(QuestionQCM o) {
	 if(this._iD == o._iD)
		  return 1;
		return 0;
	}

	public String getQuestion() {
		return Question;
	}

	public void setQuestion(String question) {
		Question = question;
	}
	
}