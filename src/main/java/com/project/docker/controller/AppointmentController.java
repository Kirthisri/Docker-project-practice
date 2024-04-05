package com.project.docker.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class AppointmentController {

	@GetMapping("/getAppointment/id/{id}")
	public String getAppointmentDate(@PathVariable String id) {
		String appointmentDate = "23/04/2024";
		
		return appointmentDate;
		
	}
}
