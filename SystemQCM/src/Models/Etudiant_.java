package Models;

public class Etudiant_ extends User {
	private String _firstname;
	private String _lastname;
	private String _email;
	private String _cNE;
	public ClassRoom _classRoom;

	public Etudiant_() {
		throw new UnsupportedOperationException();
	}

	public String getFirstname() {
		return this._firstname;
	}

	public void setFirstname(String aFirstname) {
		this._firstname = aFirstname;
	}

	public String getLastname() {
		return this._lastname;
	}

	public void setLastname(String aLastname) {
		this._lastname = aLastname;
	}

	public void getEmail() {
		throw new UnsupportedOperationException();
	}

	public void setEmail(String aEmail) {
		this._email = aEmail;
	}

	public String getCNE() {
		throw new UnsupportedOperationException();
	}

	public void setCNE(Object aCNE) {
		throw new UnsupportedOperationException();
	}

	public ClassRoom getClass() {
		throw new UnsupportedOperationException();
	}

	public void setClass(ClassRoom aClass_20) {
		throw new UnsupportedOperationException();
	}
}