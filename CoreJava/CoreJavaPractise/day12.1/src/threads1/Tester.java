package threads1;

public class Tester {

	public static void main(String[] args) throws InterruptedException{
		// display details of the main thread(name ,prio , thrd grp).
		System.out.println(Thread.currentThread());//toString -- Thread[main,5,main]
		//create multiple child threads (extends Thread)
		MyClass t1=new MyClass("one");
		MyClass t2=new MyClass("two");
		MyClass t3=new MyClass("three");
		MyClass t4=new MyClass("four");
		//how many runnable thrds ? 1(main)
		t1.start();
		t2.start();
		t3.start();
		t4.start();
		//how many runnable thrds ? 1(main) + 4(child)
		System.out.println(t1.isAlive()+" "+t4.isAlive());//t t
		for (int i = 0; i < 10; i++) {
			System.out.println(Thread.currentThread().getName() + " exec count " + i);
			Thread.sleep(1000);
		}
		System.out.println(t1.isAlive()+" "+t4.isAlive());//f f
		System.out.println("main over.....");
		
		
	}

}
