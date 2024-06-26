package dependent;

import dependency.Transport;

public class ATMImpl implements ATM {
	private Transport myTransport;// = new SoapTransport();

//	private ATMImpl(Transport t12) {
	public ATMImpl() {
//		this.myTransport=t12;
		System.out.println("in cnstr of " + getClass() + " " + myTransport);
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
	}//\
	// setter based D.I

//	public void setMyTransport(Transport myTransport) {
//		this.myTransport = myTransport;
//		System.out.println("in setter - " + myTransport);
//	}

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

	//add facory method for dependency injection least recommended
	
	public static ATMImpl myFacoryMethod(Transport t12) {
//	public static ATMImpl myFacoryMethod() { //BeanCreationException as factory method is parameterized method
		System.out.println("in factory method ");
//		AtmImpl.=t12;
		return new ATMImpl(); //partial IoC
//		return new ATMImpl(t12);
	}
}
