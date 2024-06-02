class BankAccount {
//tight encapsulation
	private int acctNo;
	private String firstName;
	private String lastName;	
	private double balance;
	BankAccount(int acctNo, String firstName, String lastName, double balance) {
		super();
		this.acctNo = acctNo;
		this.firstName = firstName;
		this.lastName = lastName;
		this.balance = balance;
	}
	@Override
	public String toString() {
		return "BankAccount [acctNo=" + acctNo + ", firstName=" + firstName + ", lastName=" + lastName + ", balance="
				+ balance + "]";
	}
	
	

	}
