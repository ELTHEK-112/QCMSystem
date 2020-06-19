package Models;

public class teatching {
	private int _iD;
	public ClassRoom _classRoom;
	public Professor _professor;

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
}