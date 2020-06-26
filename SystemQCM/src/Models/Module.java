package Models;

import java.util.Vector;
import Models.BranchModule;
import Models.OnlineTest;

public class Module implements Comparable<Module> {
	private int _iD;
	private String _name;
	private int _coefficient;
	public Vector<BranchModule> _branchmodule = new Vector<BranchModule>();
	public Vector<OnlineTest> _onlinetest = new Vector<OnlineTest>();

	public String getName() {
		return this._name;
	}

	public void setName(String aName) {
		this._name = aName;
	}
	

	public int getCoefficient() {
		return this._coefficient;
	}

	public void setCoefficient(int aCoefficient) {
		this._coefficient = aCoefficient;
	}

	public int get_iD() {
		return _iD;
	}

	public void set_iD(int _iD) {
		this._iD = _iD;
	}
	public int compareTo(Module module) {
		      if (module._iD == this._iD)  
		    	  return 1;
		      return -1;
	}
	
}