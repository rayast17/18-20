package domrab2;

public class CheckingAccount extends Account {
	private double overDraftLimit;
	
	public CheckingAccount(int id, double balance, double overDraftLimit){
		super(id, balance);
		setOverDraftLimit(overDraftLimit);
		
	}

	public double getOverDraftLimit() {
		return overDraftLimit;
	}

	public void setOverDraftLimit(double overDraftLimit) {
		this.overDraftLimit = overDraftLimit;
	}
	
	public void withdraw(double draw) {
		if(balance + overDraftLimit >= draw) {
		balance -= draw;
	}
	}
		public String toString() {
			return super.toString() + "Checking account: ";
			}

	
}
