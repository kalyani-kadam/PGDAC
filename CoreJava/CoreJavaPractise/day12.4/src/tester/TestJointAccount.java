package tester;

import com.app.banking.JointAccount;

import runnable_tasks.CheckBalanceTask;
import runnable_tasks.UpdateBalanceTask;

public class TestJointAccount {

	public static void main(String[] args) throws InterruptedException {

		// create a joint account(single)
		JointAccount acct = new JointAccount(20000);
		// create runnable tasks --attach thrds n start the same
		// Thread(Runnable instance,String name)
		Thread t1 = new Thread(new UpdateBalanceTask(acct), "c1");
		Thread t2 = new Thread(new CheckBalanceTask(acct), "c2");
		// start
		t1.start();
		t2.start();
		System.out.println("main waiting for child thrds to complete exec");
		t1.join();
		t2.join();
		System.out.println("main over....");

	}

}
