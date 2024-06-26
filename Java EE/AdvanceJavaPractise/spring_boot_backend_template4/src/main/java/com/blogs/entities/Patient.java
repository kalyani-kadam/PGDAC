package com.blogs.entities;

import java.sql.Date;

import javax.persistence.Entity;
import javax.persistence.Table;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@Entity
@Table(name="patients")
@Getter
@Setter
@ToString
@NoArgsConstructor
public class Patient {

	private int patId;
	private String firstName;
	private String lastName;
	private String email;
	private String password;
	private Date dob; 
}
