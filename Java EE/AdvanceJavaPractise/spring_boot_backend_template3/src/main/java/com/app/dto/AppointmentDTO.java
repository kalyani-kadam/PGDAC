package com.app.dto;

import java.time.LocalDate;
import java.time.LocalTime;

import com.app.entity.Patient;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonProperty.Access;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@ToString
public class AppointmentDTO extends BaseDTO {
	private LocalDate date;
	private LocalTime time;
	@JsonProperty(access = Access.WRITE_ONLY) // de ser only
	private Long patientid;
	@JsonProperty(access = Access.WRITE_ONLY) // de ser only
	private Long doctorId;
	
//	private String docName;
//	private String 
}
