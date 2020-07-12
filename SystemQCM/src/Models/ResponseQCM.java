package Models;

public class ResponseQCM {
	private int _iD;
	private String Response;
	private QuestionQCM _questionqcm;

	public ResponseQCM(int _iD, String Response ) {
		this.Response = Response;
		this._iD = _iD;
		this._questionqcm = new QuestionQCM();
	}

	public QuestionQCM getQuestionqcm() {
		 return _questionqcm;
	}

	public void setQuestionqcm(QuestionQCM aQuestionqcm) {
                  this._questionqcm = aQuestionqcm;
	}

	public int get_iD() {
		return _iD;
	}
	
	public void set_iD(int _iD) {
		this._iD = _iD;
	}

	public String getResponse() {
		return Response;
	}

	public void setResponse(String Response) {
		this.Response = Response;
	}
}