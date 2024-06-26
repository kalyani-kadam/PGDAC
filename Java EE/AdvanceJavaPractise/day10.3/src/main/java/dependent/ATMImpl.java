package dependent;

import dependency.Transport;

public class ATMImpl implements ATM {
	private long cash;
	private Transport myTransport;// optional dependencies

	public ATMImpl(long cash1) {
		this.cash=cash1;
		System.out.println("in cnstr of " + getClass() + " " + cash1 + " "+myTransport);
	}

	@Override
	public void deposit(double amt) {
		System.out.println("depositing " + amt);
		byte[] data = ("depositing " + amt).getBytes();
		myTransport.informBank(data);

	}

	@Override
	public void withdraw(double amt) {
		System.out.println("withdrawing " + amt);
		byte[] data = ("withdrawing " + amt).getBytes();
		myTransport.informBank(data);
	}//
	// setter based D.I

	public void setMyTransport(Transport myTransport) {
		this.myTransport = myTransport;
		System.out.println("in setter - " + myTransport);
	} 

	//it will get called for singleton and prototype 
	// custom init method
	public void anyInit() {
		System.out.println("in init " + myTransport);
	}

	//it will get called for singleton and prototype 
	// custom destroy method
	public void anyDestroy() {
		System.out.println("in destroy " + myTransport);
	}

	public Transport getMyTransport() {
		return myTransport;
	}

	
}
