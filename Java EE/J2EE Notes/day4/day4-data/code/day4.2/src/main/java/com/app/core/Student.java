package com.app.core;

public class Student {
	private String firstName;
	private String lastName;
	private Course selectedCourse;
	private int score;
	private boolean admissionStatus;
	public Student() {
		// TODO Auto-generated constructor stub
	}
	public Student(String firstName, String lastName, Course selectedCourse, int score) {
		super();
		this.firstName = firstName;
		this.lastName = lastName;
		this.selectedCourse = selectedCourse;
		this.score = score;
	}
	public String getFirstName() {
		return firstName;
	}
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	public String getLastName() {
		return lastName;
	}
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	public Course getSelectedCourse() {
		return selectedCourse;
	}
	public void setSelectedCourse(Course selectedCourse) {
		this.selectedCourse = selectedCourse;
	}
	public int getScore() {
		return score;
	}
	public void setScore(int score) {
		this.score = score;
	}
	public boolean isAdmissionStatus() {
		return admissionStatus;
	}
	public void setAdmissionStatus(boolean admissionStatus) {
		this.admissionStatus = admissionStatus;
	}
	@Override
	public String toString() {
		return "Student [firstName=" + firstName + ", lastName=" + lastName + ", selectedCourse=" + selectedCourse
				+ ", score=" + score + ", admissionStatus=" + admissionStatus + "]";
	}
	
	

}
