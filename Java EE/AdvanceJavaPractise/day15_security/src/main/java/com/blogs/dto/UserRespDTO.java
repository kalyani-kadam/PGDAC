package com.blogs.dto;

import java.time.LocalDate;

import javax.persistence.Column;

import lombok.Getter;
import lombok.Setter;

//firstname , last name,phone no , dob
@Getter
@Setter
public class UserRespDTO extends BaseDTO{
		private String firstName;
		private String lastName;
		private LocalDate dob;
		private String phoneNo;
}
