package com.app.pojos;

import java.time.LocalDate;
import java.util.HashSet;
import java.util.Set;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.Table;

@Entity
@Table(name = "projects")
public class Project extends BaseEntity {
	@Column(length = 100, unique = true)
	private String title;
	@Column(name = "start_date")
	private LocalDate startDate;
	@Column(name = "end_date")
	private LocalDate endDate;
	// additional mapping property : Set
	// parent , many , owning side(can be changed to inverse side also!)
	// Project *---->* Employee
	@ManyToMany // mandatory
	// optional BUT reco
	@JoinTable(name = "project_emps", joinColumns = @JoinColumn(name = "project_id", nullable = false), inverseJoinColumns = @JoinColumn(name = "emp_id", nullable = false))
	private Set<Employee> employees = new HashSet<>();

	public Project() {
		// TODO Auto-generated constructor stub
	}

	public Project(String title, LocalDate startDate, LocalDate endDate) {
		super();
		this.title = title;
		this.startDate = startDate;
		this.endDate = endDate;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public LocalDate getStartDate() {
		return startDate;
	}

	public void setStartDate(LocalDate startDate) {
		this.startDate = startDate;
	}

	public LocalDate getEndDate() {
		return endDate;
	}

	public void setEndDate(LocalDate endDate) {
		this.endDate = endDate;
	}

	public Set<Employee> getEmployees() {
		return employees;
	}

	public void setEmployees(Set<Employee> employees) {
		this.employees = employees;
	}

	@Override
	public String toString() {
		return "Project ID " + getId() + " [title=" + title + ", startDate=" + startDate + ", endDate=" + endDate + "]";
	}
	// as per contract : Equal objs MUST produce SAME hashcode n un equal objs
	// SHOULD produce distinct hascodes

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((title == null) ? 0 : title.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (!(obj instanceof Project))
			return false;
		Project other = (Project) obj;
		if (title == null) {
			if (other.title != null)
				return false;
		} else if (!title.equals(other.title))
			return false;
		return true;
	}

	// helper method to add / remove emp from the project
	public void addEmployee(Employee emp) {
		employees.add(emp);
		emp.getProjects().add(this);
	}

	public void removeEmployee(Employee emp) {
		employees.remove(emp);
		emp.getProjects().remove(this);
	}

}
