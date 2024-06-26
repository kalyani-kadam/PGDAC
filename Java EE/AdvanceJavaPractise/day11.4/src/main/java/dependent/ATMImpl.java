package dependent;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

import dependency.Transport;
//singleton n eager , id=my_atm
@Component("my_atm")
public class ATMImpl implements ATM {
	@Autowired //field level annotation - byType
	//inject http bean
	@Qualifier("httpTransport")//byName
	private Transport myTransport;

	public ATMImpl() {
		
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
	}

	// custom init method
	@PostConstruct
	public void anyInit() {
		System.out.println("in init " + myTransport);
	}

	// custom destroy method
	@PreDestroy
	public void anyDestroy() {
		System.out.println("in destroy " + myTransport);
	}	

}
