package Models;

import java.util.ArrayList;


public class OnlineTest implements Comparable<OnlineTest>{
	private int _iD;
	private String _name;
	private String _description;
	private int _timeTest;
	private Chapiter _chapiter;
	private ArrayList<QuestionQCM> _questionqcm = new ArrayList<QuestionQCM>();
	 

	public OnlineTest(int _iD, String _name, String _description, int _timeTest) {
		this._iD = _iD;
		this._name = _name;
		this._description = _description;
		this._timeTest = _timeTest;
		 _chapiter = new Chapiter();
		_questionqcm = new ArrayList<QuestionQCM>(); 
		
	}
	public OnlineTest() {
		// TODO Auto-generated constructor stub
	}
	public String getName() {
		return this._name;
	}
 void setName(String aName) {
		this._name = aName;
	}

	public String getDescription() {
		return this._description;
	}

	public void setDescription(String aDescription) {
		this._description = aDescription;
	}

	public int getTimeTest() {
		return this._timeTest;
	}

	public void setTimeTest(int aTimeTest) {
		this._timeTest = aTimeTest;
	}

	
	public int compareTo(OnlineTest onlinetest) {
		      if (this._iD == onlinetest._iD)
		    	  return 1;
		      return -1;
	}
	boolean AddQuestion(QuestionQCM _question) {
		try {
			   _questionqcm.add(_question);
			   return true;
		} catch (Exception e) {
			// TODO: handle exception
			   return false;
		}
	}
	public Chapiter get_chapiter() {
		return _chapiter;
	}
	public void set_chapiter(Chapiter _chapiter) {
		this._chapiter = _chapiter;
	}
}