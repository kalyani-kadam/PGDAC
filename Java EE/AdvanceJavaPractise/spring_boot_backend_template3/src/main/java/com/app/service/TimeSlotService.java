package com.app.service;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;

import com.app.entity.TimeSlot;

public interface TimeSlotService {
TimeSlot addNewTimeSlot(LocalTime localTime, LocalDate localDate);
}
