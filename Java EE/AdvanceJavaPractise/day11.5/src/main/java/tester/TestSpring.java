package tester;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import config.SpringAppConfiguration;
import dependent.ATM;
import dependent.ATMImpl;

public class TestSpring {

	public static void main(String[] args) {
		try (AnnotationConfigApplicationContext ctx = new AnnotationConfigApplicationContext(
				SpringAppConfiguration.class)) {
			System.out.println("SC up n running !");
			// get ready to use spring bean from SC
			ATM ref1 = ctx.getBean("my_atm", ATMImpl.class);
			// B.L
			ref1.deposit(1000);
			ATM ref2 = ctx.getBean("my_atm", ATMImpl.class);
			ref2.withdraw(500);
			System.out.println(ref1 == ref2);// t

		} // ctx.close => SC shutdown => invokes destroy style method for all singletons
		catch (

		Exception e) {
			e.printStackTrace();
		}
	}

}
