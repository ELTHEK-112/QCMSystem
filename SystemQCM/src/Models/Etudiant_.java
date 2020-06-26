package Models;

public class Etudiant_ extends User  implements Comparable<Etudiant_>{
	private String _firstname;
	private String _lastname;
	private String _email;
	private String _cNE;
	private ClassRoom _classRoom;
	

	public Etudiant_(String _firstname ,String _lastname , String _email , String _cNE ,int Id , String password ,String username) {
		super(Id, username, password);
		       this._cNE = _cNE;
		       this._firstname = _firstname;
		       this._lastname = _lastname;
		       this._email = _email;
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

	public String get_email() {
		return _email;
	}

	public void set_email(String _email) {
		this._email = _email;
	}

	public String get_cNE() {
		return _cNE;
	}

	public void set_cNE(String _cNE) {
		this._cNE = _cNE;
	}

	public ClassRoom get_classRoom() {
		return _classRoom;
	}

	public void set_classRoom(ClassRoom _classRoom) {
		this._classRoom = _classRoom;
	}
	public int compareTo(Etudiant_ etudiant) {
		   if(this.get_iD() == etudiant.get_iD()) 
			   return 1;
		   return -1;
	}
}