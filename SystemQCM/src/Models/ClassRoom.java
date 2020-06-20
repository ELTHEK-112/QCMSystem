package Models;

import java.util.*;
import Models.Etudiant_;
import Models.teatching;

public class ClassRoom {
	private int _iD;
	private String _name;
	private Branch _branch;
	private Date _schoolYear;
	public ArrayList<Etudiant_> _etudiant_ ;
	public ArrayList<teatching> _teatching ;
	

	public ClassRoom(int _iD,String _name, Date _schoolYear) {
		
		this._iD = _iD;
		this._name = _name;
		this._branch = new Branch();
		this._schoolYear = _schoolYear;
		_etudiant_ = new ArrayList<Etudiant_>();
		_teatching = new ArrayList<teatching>();
	    
	}
	 public ClassRoom() {
		 this._iD = 0;
			this._name = null;
			this._branch = null;
			this._schoolYear = null;
			_etudiant_ = null;
			_teatching = null;
		 
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

	public ArrayList<Etudiant_> getEtudiants() {
		 return _etudiant_;   
	}

	public void setEtudiants(ArrayList<Etudiant_> aEtudiants) {
		   Collections.copy(_etudiant_,aEtudiants);
		 
	}

	public int get_iD() {
		return _iD;
	}

	public void set_iD(int _iD) {
		this._iD = _iD;
	}
}