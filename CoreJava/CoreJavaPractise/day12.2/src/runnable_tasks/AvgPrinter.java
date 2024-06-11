package runnable_tasks;

import static java.lang.Thread.currentThread;

import java.util.stream.IntStream;

public class AvgPrinter implements Runnable {
	// state
	private int begin, end;

	public AvgPrinter(int begin, int end) {
		super();
		this.begin = begin;
		this.end = end;
		System.out.println("ctor of " + getClass() + " called by " + currentThread().getName());// main
	}

	@Override
	public void run() {
		System.out.println(currentThread().getName() + " strted");
		double avg = IntStream.rangeClosed(begin, end) // int stream : ints
				.average().orElseThrow();
		System.out.println("Avg printed by " + currentThread().getName() + " " + avg);

		System.out.println(currentThread().getName() + " over");

	}

}
