package threads1;

public class Tester {

	public static void main(String[] args) throws InterruptedException {
		// display details of the main thread(name,prio,thrd grp)
		System.out.println(Thread.currentThread()); //toString will call implicitly --Thread[main,5,main]
		
//		create multiple child thread(using extends thread scenerio)
		MyClass t1 = new MyClass("one");  //parameterized conctr
		MyClass t2 = new MyClass("two");
		MyClass t3 = new MyClass("three");
		MyClass t4 = new MyClass("four");
		
		//how many runnable threads? 1 Main 
		t1.start();
		t2.start();
		t3.start();
		t4.start();
		
//		how many runnable threads? 1(main) + 4(child) =5 threads
		System.out.println(t1.isAlive()+" "+t4.isAlive()); //tt
		for(int i=0;i<10;i++) {
//			System.out.println(t1.getName()+" exec count "+i);
			System.out.println(Thread.currentThread().getName()+" execution count "+i);
			Thread.sleep(1000);
		}
		System.out.println(t1.isAlive()+" "+t4.isAlive()); //tt
		System.out.println("main over......");
	}

}
