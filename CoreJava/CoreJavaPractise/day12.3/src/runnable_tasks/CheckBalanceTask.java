package runnable_tasks;

import com.app.banking.JointAccount;
import static java.lang.Thread.currentThread;

import java.util.Random;

public class CheckBalanceTask implements Runnable {
	private JointAccount jointAccount;
	private Random random;

	public CheckBalanceTask(JointAccount acct) {
		this.jointAccount = acct;
		random = new Random();// created random no generator
	}

	@Override
	public void run() {
		System.out.println(currentThread().getName() + " - strted ");
		try {
			while (true) {
				double balance = jointAccount.checkBalance();
				if(balance != 20000)
				{
					System.out.println("ERROR!!!!!!!!!!!!!");
					System.exit(-1);
				}
				Thread.sleep(random.nextInt(101) + 100);// 100-200
			}
		} catch (Exception e) {
			System.out.println(currentThread().getName() + " got exc " + e);
		}
		System.out.println(currentThread().getName() + " - over ");

	}

}
