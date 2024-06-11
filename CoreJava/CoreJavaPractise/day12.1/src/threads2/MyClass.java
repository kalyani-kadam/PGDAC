package threads2;

public class MyClass implements Runnable {
	

	// mandatory to implement run()
	/*
	 * Rule - method overriding n exception handling Overriding form of the
	 * method(sub class version) CAN NOT throw any NEW or BROADER CHECKED exception
	 */
	@Override
	public void run() /* throws InterruptedException */ {
		System.out.println(Thread.currentThread().getName() + " strted");
		try {
			// B.L -- for loop (10)
			for (int i = 0; i < 10; i++) {
				System.out.println(Thread.currentThread().getName() + " exec count " + i);
				Thread.sleep(500);
			}
		} catch (Exception e) {
			System.out.println(Thread.currentThread().getName() + " got exc " + e);
		}
		System.out.println(Thread.currentThread().getName() + " over");
	}
}
