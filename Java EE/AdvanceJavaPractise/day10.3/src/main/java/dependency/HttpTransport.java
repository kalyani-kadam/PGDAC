package dependency;

public class HttpTransport implements Transport {
	public HttpTransport() {
		System.out.println("in cnstr of " +getClass().getName());
	}

	public HttpTransport(SoapTransport s) {
		System.out.println("in cnstr of " +getClass().getName());
		System.out.println();
	}
	
	@Override
	public void informBank(byte[] data) {
		System.out.println("informing bank using " + getClass().getName() + " layer");

	}

}
