 package Models;

public class User {
	private int _iD;
	private String _username;
	private String _password;

	public String getusername() {
		return this._username;
	}

	public String getpassword() {
		return this._password;
	}

	public User( int _iD , String _username , String _password  ) {
		this.set_iD(_iD);
		this._password = _password;
		this._username = _username;
		      
	}

	public void setPasswodr(String aPassword) {
		this._password = aPassword;
	}

	public void setUsername(String aUsername) {
		this._username = aUsername;
	}

	public int get_iD() {
		return _iD;
	}

	public void set_iD(int _iD) {
		this._iD = _iD;
	}
}