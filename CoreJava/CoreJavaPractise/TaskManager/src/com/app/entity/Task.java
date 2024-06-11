package com.app.entity;

import java.time.LocalDate;
import java.util.Objects;

/*You can create a class Task with fields like taskId, taskName, description, taskDate, status, active. 
taskId should be unique and generated automatically.
status should be either PENDING, IN PROGRESS or COMPLETED.
active should be either true or false. Deleted task will have active=false 
Newly added task should have default status as PENDING and active=true*/

public class Task {
	private static int taskCnt;
	private int taskId;
	private String taskName;
	private String description;
	private LocalDate taskdate;
	private Status status;
	private boolean active;

	
	public Task(String taskName, String description, LocalDate date, Status pending, boolean active) {
		super();
		++taskCnt;
		this.taskId = taskCnt;
		this.taskName = taskName;
		this.description = description;
//		this.taskdate = taskdate.now();
		this.taskdate = date;
		this.status =status.PENDING;
		this.active = true;
	}

	public Task(String taskName, String description) {
		super();
		++taskCnt;
		this.taskId = taskCnt;
		this.taskName = taskName;
		this.description = description;
		this.taskdate = taskdate.now();
		this.status =status.PENDING;
		this.active = true;
	}

	
	public Task(int id) {
		this.taskId=id;
	}

	public Task() {
		// TODO Auto-generated constructor stub
	}

	public int getTaskId() {
		return taskId;
	}

	public void setTaskId(int taskId) {
		this.taskId = taskId;
	}

	public String getTaskName() {
		return taskName;
	}

	public void setTaskName(String taskName) {
		this.taskName = taskName;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public LocalDate getTaskdate() {
		return taskdate;
	}

	public void setTaskdate(LocalDate taskdate) {
		this.taskdate = taskdate;
	}

	public Status getStatus() {
		return status;
	}
	public void setStatus(Status status) {
		this.status = status;
	}
	public boolean isActive() {
		return active;
	}
	public void setActive(boolean active) {
		this.active = active;
	}

	@Override
	public String toString() {
		return "Task [taskId=" + taskId + ", taskName=" + taskName + ", description=" + description + ", taskdate="
				+ taskdate + ", status=" + status + ", active=" + active + "]";
	}

	@Override
	public int hashCode() {
		return Objects.hash(taskId);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Task other = (Task) obj;
		return taskId == other.taskId;
	}
	
//	@Override
//	public boolean equals(Object o) {
//		if(o instanceof Task) {
//			return this.taskId == ((Task)o).taskId;
//		}
//		return false;
//	}
	
	
}
