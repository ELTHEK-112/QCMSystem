package Models;


public class Chapiter {

	private Module module;
	private OnlineTest onlinetest;
	private String nameChap;
	
	
	public Chapiter(String nameChap) {
	    
	     this.nameChap = nameChap;
	     
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
	public OnlineTest getOnlineTest() {
		return this.onlinetest;
	}
	public void setOnlineTest(OnlineTest onlineTest) {
		this.onlinetest = onlineTest;
	}
	/**
	 * 
	 * @param nameChap
	 */
	public void setNameChap(String nameChap) {
		this.nameChap = nameChap;
	}
      
}