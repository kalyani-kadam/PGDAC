package com.app.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.app.service.TimeSlotService;

@RestController
@RequestMapping("/")
public class TimeSlotController {
private TimeSlotService timeSlotService;

}
