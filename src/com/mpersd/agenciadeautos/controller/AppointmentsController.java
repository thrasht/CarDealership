package com.mpersd.agenciadeautos.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
@RequestMapping("/appointments")
public class AppointmentsController {
	
	
	@RequestMapping(method = RequestMethod.GET)
	public String showAppoitnmentsPage()
	{
		return "appointments";
	}

}
