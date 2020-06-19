package Models;

import java.util.*;
import Models.Etudiant_;
import Models.teatching;

public class ClassRoom {
	private int _iD;
	private String _name;
	private Branch _branch;
	private Date _schoolYear;
	public List<Etudiant_> _etudiant_ ;
	public List<teatching> _teatching ;
	

	public ClassRoom(int _iD,String _name, Date _schoolYear) {
		
		this._iD = _iD;
		this._name = _name;
		this._branch = new Branch();
		this._schoolYear = _schoolYear;
		_etudiant_ = new ArrayList<Etudiant_>();
		_teatching = new ArrayList<teatching>();
	    
	}
	 public ClassRoom() {
		 
		 
	 }

	public String getName() {
		return this._name;
	}

	public void setName(String aName) {
		this._name = aName;
	}

	public Branch getBranch() {
		return this._branch;
	}

	public void setBranch(Branch aBranch) {
		this._branch = aBranch;
	}

	public Date getSchoolYear() {
		return this._schoolYear;
	}

	public void setSchoolYear(Date aSchoolYear) {
		this._schoolYear = aSchoolYear;
	}

	public ArrayList<Etudiant> getEtudiants() {
		throw new UnsupportedOperationException();
	}

	public void setEtudiants(ArrayList<Etudiant> aEtudiants) {
		throw new UnsupportedOperationException();
	}

	public int get_iD() {
		return _iD;
	}

	public void set_iD(int _iD) {
		this._iD = _iD;
	}
}