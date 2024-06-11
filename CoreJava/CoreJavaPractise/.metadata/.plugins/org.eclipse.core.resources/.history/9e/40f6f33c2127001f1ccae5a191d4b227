package com.app.tester;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.Scanner;

import com.app.entity.Status;
import com.app.entity.Task;

import static com.app.validations.Validations.*;
public class Tester {
	public static void main(String[] args) {
		try (Scanner sc = new Scanner(System.in)) {
			List<Task> tasks = new ArrayList<>();
			boolean exit = false;
			while (!exit) {
				System.out.println("\na. Add New Task\r\n" + "b. Delete a task\r\n" + "c. Update task status\r\n"
						+ "d. Display all pending tasks\r\n" + "e. Display all pending tasks for today\r\n"
						+ "f. Display all tasks sorted by taskDate\ng. Display all task\nh. Exit\n");
				try {
					System.out.println("Enter choice");
					switch (sc.next()) {
					case "a":
						System.out.println("taskName, description");
//						LocalDate date=null;
						Task t = validateInputs(sc.next(),sc.next(),sc.next(),Status.PENDING,true,tasks);
//						Task task=addNewTask(sc.next(),sc.next(),sc.next(),task.getStatus(),task.isActive()); 
						tasks.add(t);
						System.out.println("Task added with id="+t.getTaskId());
						break;
						
					case "b":
						System.out.println("Enter id for deleting task");
						deleteTask(sc.nextInt(),tasks);
						break;
						
					case "c":
						updateStatus(tasks);
						break;
						
					case "d":
						pendingTasks(tasks);
						break;
						
					case "e":
						pendingTasksForToday(tasks);
						break;
					case "f":
//						sortedByDateTasks(tasks);
//						Collections.sort(tasks);
						Collections.sort(tasks,new Comparator<Task>() {
							public int compare(Task t1,Task t2) {
								System.out.println("int anonymous class");
								return t1.getTaskdate().compareTo( t2.getTaskdate());
							}});
						for(Task tsk :tasks) {
							System.out.println(tsk);
						}
						break;
					case "g":
						for(Task tsk :tasks) {
							System.out.println(tsk);
						}
						break;
					case "h":
						System.out.println("Thank you!!");
						exit=true;
						break;
						
						default:
							System.out.println("Invalid choice");
							break;
					}
				} catch (Exception e) {
					e.printStackTrace();
					sc.nextLine();
				}

			}
		}
	}

}
