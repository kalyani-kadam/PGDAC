package tester;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import dependent.ATM;
import dependent.ATMImpl;

public class TestSpring {

	public static void main(String[] args) {
		try (ClassPathXmlApplicationContext ctx =
				new ClassPathXmlApplicationContext("bean-config.xml")) {
			System.out.println("SC up n running !");
			//get ready to use spring bean from SC
			ATM ref1=ctx.getBean("my_atm", ATMImpl.class);
			//B.L
			ref1.deposit(1000);
			ATM ref2=ctx.getBean("my_atm", ATMImpl.class);
			ref2.withdraw(500);
			System.out.println(ref1==ref2);//f
			
		} // ctx.close => SC shutdown => invokes destroy style method for all singletons
		catch (Exception e) {
			e.printStackTrace();
		}
	}

}
