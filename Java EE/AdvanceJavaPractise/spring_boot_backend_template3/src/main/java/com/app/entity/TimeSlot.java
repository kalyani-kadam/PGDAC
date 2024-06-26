package com.app.entity;

import java.time.Duration;
import java.time.LocalDate;
import java.time.LocalTime;
import java.util.ArrayList;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Embeddable;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

//@Entity
//@Table(name="apptdatetime")
@Embeddable
//@Getter
//@Setter
//@NoArgsConstructor
//@AllArgsConstructor
public class TimeSlot {
//	@Id
//	@GeneratedValue(strategy = GenerationType.IDENTITY)
//	@Column(name = "timeslotno", unique = true)
//	private Long tmno;
//	@Column(name = "appointment_date_time")
	private LocalTime startTime;
	private LocalTime endTime;
//	private LocalDate date;
	
	startTime = LocalTime.of(9, 0); // 9:00 AM
    endTime = LocalTime.of(12, 0); // 5:00 PM
    Duration slotDuration = Duration.ofMinutes(30); 
	
//	private LocalDate date;
//	@Column(name="appointment_time")
//	private LocalTime time;

//	List<LocalTime> time1 = new ArrayList<>();
//	List<LocalTime> times = new ArrayList<>();
	
	// use add() method to add elements in the list
//	public boolean overlaps(TimeSlot other) {
//		return startTime.isBefore(other.endTime) && endTime.isAfter(other.startTime);
//	}

//	public TimeSlot(LocalTime time, LocalDate date) {
//		this.startTime=time;
//		this.date=date;
//	}
	
	
	public static List<String> generateTimeSlots (LocalTime startTime, LocalTime endTime, Duration slotDuration){
        List<String> timeSlots = new ArrayList<>();
        LocalTime currentTime = startTime;
        while (currentTime.isBefore(endTime)) {
            LocalTime nextTime = currentTime.plus(slotDuration);
            timeSlots.add(currentTime + " - " + nextTime);
            currentTime = nextTime;
        }
        return timeSlots;
    }

}}
