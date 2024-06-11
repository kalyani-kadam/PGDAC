package com.app.validations;

import java.time.LocalDate;
import java.util.List;

import com.app.CustomException.TaskException;
import com.app.entity.Status;
import com.app.entity.Task;

public class Validations {
	public static Task validateInputs(String taskName, String description, String date, Status status,
			boolean active, List<Task> task) {
		LocalDate taskaddeddate = LocalDate.parse(date);
//		Status statuss = statuss.valueOf(status.toUpperCase());
//		Status stat = parseAndValidateStatus(status);
//		Status status;
//		Status statuss = status.PENDING;
//		boolean active=true;
		return new Task(taskName, description, taskaddeddate, status, active);
	}

	private static Status parseAndValidateStatus(String status) {
		return Status.valueOf(status.toUpperCase()).PENDING;
	}

	public static void deleteTask(int id, List<Task> task) throws TaskException {
		Task t = new Task(id);
		System.out.println(t);
		int index = task.indexOf(t);
		System.out.println("indexof t"+index);
		if(index == -1) {
			throw new TaskException("Invalid id!!");
		}
		
		System.out.println("Removed details with id = "+task.get(index).getTaskId());
		task.remove(index);
	}

	public static void updateStatus(List<Task> tasks) {
		Task t = new Task();
		for (Task t1 : tasks) {
			t1.setStatus(Status.COMPLETED);
		}
	}
	
	public static void pendingTasks(List<Task>tasks) {
//		Task t = new Task();
		for (Task t1 : tasks) {
			if(t1.getStatus()== Status.PENDING) {
				System.out.println(t1);
			}else {
//				throw new TaskException("Task not found");
				System.out.println("pending Tasks not found");
			}
		}
	}
	
	public static void pendingTasksForToday(List<Task>tasks) {
//		Task t = new Task();
		for (Task t1 : tasks) {
			if(t1.getStatus()== Status.PENDING && t1.getTaskdate().equals(LocalDate.now())) {
				System.out.println(t1);
			}else {
//				throw new TaskException("Task not found");
				System.out.println("pending Tasks not found");
			}
		}
	}
	
//	public static void sortedByDateTasks(List<Task>tasks) throws TaskException{
//		for(Task t:tasks) {
//		}
//	}
}
