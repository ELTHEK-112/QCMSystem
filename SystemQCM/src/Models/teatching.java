package Models;

public class teatching  implements Comparable<teatching>{
	private int _iD;
	private  ClassRoom _classRoom;
	private  Professor _professor;
	public teatching(int _iD) {
		this.set_iD(_iD);
	}
	
	public void setClassRoom(ClassRoom aClassRoom) {
		this._classRoom = aClassRoom;
	}

	public ClassRoom getClassRoom() {
		return this._classRoom;
	}

	public void setProfessor(Professor aProfessor) {
		this._professor = aProfessor;
	}

	public Professor getProfessor() {
		return this._professor;
	}

	public int get_iD() {
		return _iD;
	}

	public void set_iD(int _iD) {
		this._iD = _iD;
	}
	public int compareTo(teatching _teatching) {
		if (this._iD == _teatching._iD)
			return 1;
		return -1;
	}
}