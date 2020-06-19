package Models;

public class BranchModule {
	public Module _module;
	public Branch _branch;

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