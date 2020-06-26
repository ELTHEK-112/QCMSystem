package Models;

import java.util.Vector;
import Models.QuestionQCM;

public class OnlineTest implements Comparable<OnlineTest>{
	private int _iD;
	private String _name;
	private String _description;
	private int _timeTest;
	public Module _module;
	public Vector<QuestionQCM> _questionqcm = new Vector<QuestionQCM>();

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

	public Module getModule() {
		return this._module;
	}

	public void setModule(Module aModule) {
		this._module = aModule;
	}
	
	public int compareTo(OnlineTest onlinetest) {
		      if (this._iD == onlinetest._iD)
		    	  return 1;
		      return -1;
	}
}