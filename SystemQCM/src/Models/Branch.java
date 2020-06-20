package Models;

import java.util.*;
import Models.ClassRoom;

public class Branch {

	private int _Id;
	private String _name;
	private ArrayList<ClassRoom> _classroom = new ArrayList<ClassRoom>();
	private ArrayList<BranchModule> _branchmodule = new ArrayList<BranchModule>();

	public Branch(int _iD, String _name) {
		this.set_Id(_iD);
		this._name = _name;
		_classroom = new ArrayList<ClassRoom>();
		_branchmodule = new ArrayList<BranchModule>();
	}

	public Branch() {
		_name = null;
		_classroom = null;
		_branchmodule = null;

	}

	public String getName() {
		return this._name;
	}

	public void setName(String aName) {
		this._name = aName;
	}

	public ArrayList<ClassRoom> getClasses() {
		return _classroom;

	}

	public void setClasses(ArrayList<ClassRoom> aClasses) {
		Collections.copy(_classroom, aClasses);
	}

	public void setBranchModule(ArrayList<BranchModule> aBranchModule) {
		Collections.copy(_branchmodule, aBranchModule);

	}

	public ArrayList<BranchModule> getBranchModule() {
		return _branchmodule;
	}

	public int get_Id() {
		return _Id;
	}

	public void set_Id(int _Id) {
		this._Id = _Id;
	}

	public Boolean addClass(ClassRoom aclass) {
		try {
			_classroom.add(aclass);
			return true;
		} catch (Exception e) {
			return false;

		}
	}

	public boolean DellClass(int index) {
		try {
			_classroom.remove(index);
			return true;
		} catch (Exception e) {
			// TODO: handle exception
			return false;
		}
	}

	public ClassRoom serchclass(String _name) {
		if (_name != null) {
			ClassRoom test;
			int i = 0;
			do {
				test = _classroom.get(i);
				if (test.getName().equalsIgnoreCase(_name)) {
					return test;
				}
				i++;
			} while (test != null);
			return null;
		}
		return null;
	}

	public Boolean addBranchModule(BranchModule branchModule) {
		try {
			_branchmodule.add(branchModule);
			return true;
		} catch (Exception e) {
			return false;

		}
	}

	public boolean DellBranchModule(int index) {
		try {
			_branchmodule.remove(index);
			return true;
		} catch (Exception e) {
			// TODO: handle exception
			return false;
		}
	}
	public ClassRoom serchBranchModule(String _name) {
		if (_name != null) {
			ClassRoom test;
			int i = 0;
			do {
				test = _classroom.get(i);
				if (test.getName().equalsIgnoreCase(_name)) {
					return test;
				}
				i++;
			} while (test != null);
			return null;
		}
		return null;
	}

}