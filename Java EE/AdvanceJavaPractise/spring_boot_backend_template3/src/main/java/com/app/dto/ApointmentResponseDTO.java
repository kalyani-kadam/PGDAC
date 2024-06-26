package com.app.dto;

import java.time.LocalDateTime;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@ToString
public class ApointmentResponseDTO {
	private String message;
	private LocalDateTime timeStamp;
	
	public ApointmentResponseDTO() {
		
	}
	
	public ApointmentResponseDTO(String message){
		super();
		this.message = message;
		this.timeStamp = LocalDateTime.now();
	}
}
