package Models;

import java.util.ArrayList;

public class Chapiter {
    private int _id;
	private Module module;
	private String nameChap;
	ArrayList<OnlineTest> lstOnlinetest;
	
	public Chapiter(int _id ,String nameChap) {
	      this.set_id(_id);
	     this.nameChap = nameChap;
	     module = new Module();
	     lstOnlinetest = new ArrayList<OnlineTest>();
	     
	     		   	}

	public Chapiter() {
		// TODO Auto-generated constructor stub
	}

	public String getNameChap() {
		return this.nameChap;
	}
	
	public Module getModule() {
		return this.module;
	}
	public void setModule(Module module) {
		this.module = module;
	}
	/**
	 * 
	 * @param nameChap
	 */
	public void setNameChap(String nameChap) {
		this.nameChap = nameChap;
	}

	public int get_id() {
		return _id;
	}

	public void set_id(int _id) {
		this._id = _id;
	}
      
}