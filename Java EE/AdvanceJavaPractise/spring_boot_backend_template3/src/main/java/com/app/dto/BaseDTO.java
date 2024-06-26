package com.app.dto;

import java.time.LocalDate;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonProperty.Access;

public class BaseDTO {
	@JsonProperty(access = Access.READ_ONLY)
	private Long id;
	@JsonProperty(access = Access.READ_ONLY)
	private LocalDate creationDate;
	@JsonProperty(access = Access.READ_ONLY)
	private LocalDate updatedOn;
}
