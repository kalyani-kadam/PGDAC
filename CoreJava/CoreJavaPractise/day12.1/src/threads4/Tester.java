package threads4;

public class Tester {

	public static void main(String[] args) throws InterruptedException{
		// display details of the main thread(name ,prio , thrd grp).
		System.out.println(Thread.currentThread());//toString -- Thread[main,5,main]
		//create multiple child threads (implements Runnable)
		//create runnable task instance(i.e implementation class of Runnable)
		MyClass runnableTask=new MyClass();
		//Thread(Runnable instance,String name)
		Thread t1=new Thread(runnableTask,"one");
		Thread t2=new Thread(runnableTask,"two");
		Thread t3=new Thread(runnableTask,"three");
//		t3.setDaemon(false); //here t3 will complete its execution 
		t3.setDaemon(true); //here t3 will not executed once 
		Thread t4=new Thread(runnableTask,"four");
		//how many runnable thrds ? 1(main)
		t1.start();
		t2.start();
		t3.start();
		t4.start();
		//how many runnable thrds ? 1(main) + 4(child)
		System.out.println(t1.isAlive()+" "+t4.isAlive());//t t
		for (int i = 0; i < 10; i++) {
			System.out.println(Thread.currentThread().getName() + " exec count " + i);
			Thread.sleep(100); //sleeping time is less there fore main thread execute faster
		}
		System.out.println("main sending interrupt to child thread - t3");
//		t3.interrupt(); //here main sending interrupt to t3 thread ,BUT t3 is blocked on 
//		input if you press enter one only then it will get InterruptedException and t3 will over its execution
		
		System.out.println(t1.isAlive()+" "+t4.isAlive());//f f
		System.out.println("main over.....");
		
		
	}

}
