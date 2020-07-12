package Models;

import java.util.*;


public class Module implements Comparable<Module> {
	private int _iD;
	private String _name;
	private int _coefficient;
	public ArrayList<BranchModule> _branchmodule = new ArrayList<BranchModule>();
	public ArrayList<Chapiter> _onlinetest = new ArrayList<Chapiter>();

	public Module(int _iD, int _coefficient, String _name) {
		this._iD = _iD;
		this._coefficient = _coefficient;
		this._name = _name;
	}

	public Module() {
		// TODO Auto-generated constructor stub
	}

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