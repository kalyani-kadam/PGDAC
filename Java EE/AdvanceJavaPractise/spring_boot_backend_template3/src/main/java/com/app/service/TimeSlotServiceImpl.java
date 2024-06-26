package com.app.service;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Service;

import com.app.entity.TimeSlot;

import lombok.Getter;

@Getter
@Service
public class TimeSlotServiceImpl implements TimeSlotService{
	private List<TimeSlot> timeSlots = new ArrayList<>();

//	timeSlots.add()
	@Override
	public TimeSlot addNewTimeSlot(LocalTime time, LocalDate date) {
		
		TimeSlot newSlot = new TimeSlot(time, date);

        for (TimeSlot existingSlot : timeSlots) {
            if (newSlot.overlaps(existingSlot)) {
                return existingSlot;
            }
        }
        timeSlots.add(newSlot);
//        timeSlots.add(30);
        return newSlot;
	}
	
}
