package tester;

import java.util.Scanner;

import runnable_tasks.AvgPrinter;
import runnable_tasks.EvenNoPrinter;
import runnable_tasks.OddNoPrinter;

public class TestThreads {

	public static void main(String[] args) {
		try(Scanner sc=new Scanner(System.in)) {
			System.out.println("Enter begin n end values");
			int start = sc.nextInt();
			int end = sc.nextInt();
			//create thrds by attaching runnable tasks
			//Thread(Runnable instance,String nm)
			Thread t1=new Thread(new EvenNoPrinter(start, end), "even");
			Thread t2=new Thread(new OddNoPrinter(start, end), "odd");
			Thread t3=new Thread(new AvgPrinter(start, end), "avger");
			//runnable : 1
			t1.start();
			t2.start();
			t3.start();
		//	t1.start();
			System.out.println("main waiting for child thrds to complete exec");
			t1.join(10);//main : blocked on join
			System.out.println("main interrupting t1");
			t1.interrupt(); // main--> interrupt --> t1 (interrupt is rendered useless -- since t1 : doesn't use any method -- sleep / join
			t2.join();
			t3.join();
			System.out.println(t1.isAlive()+" "+t2.isAlive()+" "+t3.isAlive());
		} catch (Exception e) {
			e.printStackTrace();
		}
		System.out.println("main over...");

	}

}
