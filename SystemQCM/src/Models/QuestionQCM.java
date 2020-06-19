package Models;

import java.util.Vector;
import Models.ResponseQCM;

public class QuestionQCM {
	private int _iD;
	private int _points;
	public OnlineTest _onlinetest;
	public Vector<ResponseQCM> _responseqcm = new Vector<ResponseQCM>();

	public int getPoints() {
		return this._points;
	}

	public void setPoints(int aPoints) {
		this._points = aPoints;
	}

	public String getQuestioncontent() {
		throw new UnsupportedOperationException();
	}

	public void setQuestioncontent(String aQuestioncontent) {
		throw new UnsupportedOperationException();
	}

	public OnlineTest getOnlinetest() {
		return this._onlinetest;
	}

	public void setOnlinetest(OnlineTest aOnlinetest) {
		this._onlinetest = aOnlinetest;
	}

	public ArrayList<ResponsesQCM> getResponses() {
		throw new UnsupportedOperationException();
	}

	public void setResponses(ArrayList<ResponsesQCM> aResponses) {
		throw new UnsupportedOperationException();
	}
}