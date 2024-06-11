package threads1;

public class MyClass extends Thread{
	
	public MyClass(String nm) {
		super(nm);
	}
//mandatory to override run()
	/*
	 * Rule - method overring n exception handling 
	 * Overring form of method(sub class version) CAN NOT throw
	 * any NEW or BROADER CHECKED exception
	 */
	
	
	@Override
		public void run()/* throws InterruptedException */{ 
		//Exception InterruptedException is not compatible with throws clause in Thread.run()
		
		System.out.println(getName()+" started"); //first it wiil check in MyClass if not found it will check in Thread
		try {
		//B.L --for loop(10)
		for(int i=0;i<10;i++) {
			System.out.println(getName()+" exec count "+i);
			Thread.sleep(500);
		}
		}catch(Exception e) {
			System.out.println(getName()+" got exc "+e);
		}
		System.out.println(getName()+" over");
	}
}
