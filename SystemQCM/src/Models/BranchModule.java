package Models;

public class BranchModule {
	
	private Module _module;
	private Branch _branch;
    public BranchModule() {
    	     _module = null;
    	     _branch = null;
    }
    public BranchModule(Branch branch, Module module) {
    	_module = module;
    	_branch = branch;
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
	
}