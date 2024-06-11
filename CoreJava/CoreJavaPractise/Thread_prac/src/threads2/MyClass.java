package threads2;

public class MyClass implements Runnable{
	
	
//mandatory to override run()
	/*
	 * Rule - method overring n exception handling 
	 * Overring form of method(sub class version) CAN NOT throw
	 * any NEW or BROADER CHECKED exception
	 */
	
	
	@Override
		public void run()/* throws InterruptedException */{ 
		//Exception InterruptedException is not compatible with throws clause in Thread.run()
		
		System.out.println(Thread.currentThread().getName()+" started"); //first it wiil check in MyClass if not found it will check in Thread
		try {
		//B.L --for loop(10)
		for(int i=0;i<10;i++) {
			System.out.println(Thread.currentThread().getName()+" exec count "+i);
			Thread.sleep(500);
		}
		}catch(Exception e) {
			System.out.println(Thread.currentThread().getName()+" got exc "+e);
		}
		System.out.println(Thread.currentThread().getName()+" over");
	}
}
