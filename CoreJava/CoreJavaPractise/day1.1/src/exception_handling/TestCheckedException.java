package exception_handling;

public class TestCheckedException {

	public static void main(String[] args) {
		System.out.println("Before");
		try {
			Thread.sleep(5000);
		} catch (InterruptedException e) {
			System.out.println("error!!!!");
		}
		System.out.println("After");

	}

}
