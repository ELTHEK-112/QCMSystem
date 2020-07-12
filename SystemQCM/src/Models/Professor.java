package Models;

import java.util.ArrayList;


public class Professor extends User implements Comparable<Professor>{
	private String _firstname;
	private String _lastname;
	private String _email;
	private String _cIN;
	public ArrayList<teatching> _teatching = new ArrayList<teatching>();


	public Professor(int _iD, String _username, String _password, String _firstname, String _lastname, String _email, String _cIN) {
		super(_iD, _username, _password);
		this._firstname = _firstname;
		this._lastname = _lastname;
		this._email = _email;
		this._cIN = _cIN;
		this._teatching = new ArrayList<teatching>();
	}

	public String getFirstname() {
		return this._firstname;
	}

	public void setFirsname(String aFirstname) {
	         _firstname = aFirstname;	   
	}

	public String getLastname() {
		return this._lastname;
	}

	public void setLastname(String aLastname) {
		this._lastname = aLastname;
	}

	public String getEmail() {
		return this._email;
	}

	public void setEmail(String aEmail) {
		this._email = aEmail;
	}

	public String getCIN() {
		return this._cIN;
	}

	public void setCIN(String aCIN) {
		this._cIN = aCIN;
	}

	@Override
	public int compareTo(Professor o) {
		     if (this.get_iD() == o.get_iD())
		    	 return 1;
		     return 0;
	} 
	public boolean addteatching(teatching teatching) {
		try {
            this._teatching.add(teatching);
            return true;
		} catch (Exception e) {
			return false;
			// TODO: handle exception
		}
		
	}
	       
	
	
}