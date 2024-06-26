package dependency;

import org.springframework.stereotype.Component;

/*
 * configure a spring bean - singleton n eager
 * bean id=test
 */
@Component("test") //stereotype annotations
public class TestTransport implements Transport {
	public TestTransport() {
		System.out.println("in cnstr of " +getClass().getName());
	}

	@Override
	public void informBank(byte[] data) {
		System.out.println("informing bank using " 
	+ getClass().getName() + " layer");

	}

}
