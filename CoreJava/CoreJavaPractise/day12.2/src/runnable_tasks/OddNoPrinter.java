package runnable_tasks;

import static java.lang.Thread.currentThread;

import java.util.stream.IntStream;

public class OddNoPrinter implements Runnable {
	// state
	private int begin, end;

	public OddNoPrinter(int begin, int end) {
		super();
		this.begin = begin;
		this.end = end;
		System.out.println("ctor of " + getClass() + " called by " + currentThread().getName());// main
	}

	@Override
	public void run() {
		System.out.println(currentThread().getName() + " strted");
		IntStream.rangeClosed(begin, end) // int stream : ints
				.filter(i -> i % 2 != 0)
				.forEach(i -> System.out.println(currentThread().getName() + " " + i));
		System.out.println(currentThread().getName() + " over");

	}

}
