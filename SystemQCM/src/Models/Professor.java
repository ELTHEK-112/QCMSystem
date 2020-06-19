package Models;

import java.util.Vector;
import Models.teatching;

public class Professor extends User {
	private String _firstname;
	private String _lastname;
	private String _email;
	private String _cIN;
	public Vector<teatching> _teatching = new Vector<teatching>();

	public Professor() {
		throw new UnsupportedOperationException();
	}

	public String getFirstname() {
		return this._firstname;
	}

	public void setFirsname(String aFirstname) {
		throw new UnsupportedOperationException();
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
}