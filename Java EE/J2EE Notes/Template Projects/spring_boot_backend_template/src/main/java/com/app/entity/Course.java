package com.app.entity;

import java.time.LocalDate;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Table(name="course")
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor

//course title(unique) , start date , end date , fees , min score

public class Course {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer cid;
	@Column(length = 50,unique = true)
	private String title;
//	@Column()
	private LocalDate startDate;
	private LocalDate endDate;
	private Integer fees;
	private Integer minScore;
	
//	create table course(
//		    -> cid int primary key auto_increment,
//		    -> title varchar(30) unique,
//		    -> start_date date,
//		    -> end_date date,
//		    -> fees int,
//		    -> min_score int);
	
//	 insert into course values(default,'Comp','2012-01-23','2014-01-21',120000,60);
}
