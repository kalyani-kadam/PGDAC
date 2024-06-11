package runnable_tasks;

import com.app.banking.JointAccount;
import static java.lang.Thread.currentThread;

import java.util.Random;

public class UpdateBalanceTask implements Runnable {
	private JointAccount jointAccount;
	private Random random;

	public UpdateBalanceTask(JointAccount acct) {
		this.jointAccount = acct;
		random = new Random();// created random no generator
	}

	@Override
	public void run() {
		System.out.println(currentThread().getName() + " - strted ");
		try {
			while (true) {
				synchronized (jointAccount) {					
					jointAccount.updateBalance(5000);
				}
				
				Thread.sleep(random.nextInt(101) + 100);// 100-200
			}
		} catch (Exception e) {
			System.out.println(currentThread().getName() + " got exc " + e);
		}
		System.out.println(currentThread().getName() + " - over ");

	}

}
