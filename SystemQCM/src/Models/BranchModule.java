package Models;

public class BranchModule implements Comparable<BranchModule>{
	
	private Module _module;
	private Branch _branch;
    public BranchModule() {
    	     _module = null;
    	     _branch = null;
    }
	public void setModule(Module aModule) {
		this._module = aModule;
	}

	public Module getModule() {
		return this._module;
	}

	public void setBranch(Branch aBranch) {
		this._branch = aBranch;
	}

	public Branch getBranch() {
		return this._branch;
	}
	public int compareTo(BranchModule branchmodule) {
		      if (this.getBranch().compareTo(branchmodule.getBranch()) == 1 && this.getModule().compareTo(branchmodule.getModule()) == 1)
		    	    return 1;
		       return -1;
		    	  
	}
}