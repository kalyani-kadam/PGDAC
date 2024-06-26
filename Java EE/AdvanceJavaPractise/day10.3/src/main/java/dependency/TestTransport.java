package dependency;

public class TestTransport implements Transport {
	
	public TestTransport() {
		System.out.println("in cnstr of " +getClass().getName());
	}

	public TestTransport(TestTransport s) {
		System.out.println("in cnstr of " +getClass().getName());
		System.out.println();
	}
	 
	@Override
	public void informBank(byte[] data) {
		System.out.println("informing bank using " 
	+ getClass().getName() + " layer");

	}

}
