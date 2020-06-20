 package Models;

public class User {
	private int _iD;
	private String _username;
	private String _password;

	public String getusername() {
		throw new UnsupportedOperationException();
	}

	public String getpassword() {
		throw new UnsupportedOperationException();
	}

	private User() {
		throw new UnsupportedOperationException();
	}

	public void setPasswodr(String aPassword) {
		throw new UnsupportedOperationException();
	}

	public void setUsername(String aUsername) {
		this._username = aUsername;
	}
}