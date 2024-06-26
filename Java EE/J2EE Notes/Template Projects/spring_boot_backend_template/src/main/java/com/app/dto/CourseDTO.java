package com.app.dto;
//course title(unique) , start date , end date , fees , min score

import java.time.LocalDate;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@ToString
public class CourseDTO extends BaseDTO{
	private String title;
	private LocalDate startdate;
	private LocalDate enddate;
	private Long fees;
	private Long minScore;
	
}
