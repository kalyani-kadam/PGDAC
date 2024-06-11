package threads2;

public class Tester {

	public static void main(String[] args) throws InterruptedException {
		// display details of the main thread(name,prio,thrd grp)
		System.out.println(Thread.currentThread()); //toString will call implicitly --Thread[main,5,main]
		
//		create multiple child thread(using implements Runnable scenerio)
//		create runnable task instance (i.e. implemantation class of runnable
		MyClass runnableTask = new MyClass();
//		Thread(Runnable instance,String name)
		Thread t1 = new Thread(runnableTask,"one"); 
		//t1.start --> thread willl be created and immitiately die
		Thread t2 = new Thread(runnableTask,"two");
		Thread t3 = new Thread(runnableTask,"three");
		Thread t4 = new Thread(runnableTask,"four");
		Thread t5 = new Thread(runnableTask,"five");
		
		//how many runnable threads? 1 Main 
		t1.start();
		t2.start();
		t3.start();
		t4.start();
		t5.start();
		
//		how many runnable threads? 1(main) + 4(child) =5 threads
		System.out.println("====================");
		System.out.println(t1.isAlive()+" "+t4.isAlive()); //tt
		for(int i=0;i<5;i++) {
//			System.out.println(t1.getName()+" exec count "+i);
			System.out.println(Thread.currentThread().getName()+" execution count "+i);
			System.out.println("====================");
			Thread.sleep(4000);
		}
		System.out.println("====================");
		System.out.println(t1.isAlive()+" "+t4.isAlive()); //tt
		System.out.println("====================");
		System.out.println("main over......");
	}

}
