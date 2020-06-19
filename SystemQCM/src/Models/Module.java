package Models;

import java.util.Vector;
import Models.BranchModule;
import Models.OnlineTest;

public class Module {
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
}