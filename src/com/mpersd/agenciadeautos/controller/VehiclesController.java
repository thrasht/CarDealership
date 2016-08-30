package com.mpersd.agenciadeautos.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.mpersd.agenciadeautos.domain.Vehicle;
import com.mpersd.agenciadeautos.service.VehicleService;

@Controller
@RequestMapping("/vehicles")
public class VehiclesController {
	
	@Autowired
	VehicleService vs;
	
	@RequestMapping(method = RequestMethod.GET)
	public String showVehicles(ModelMap model)
	{
		List<Vehicle> lv = vs.findAllVehicles();
		
		model.addAttribute("vehicleList",lv);
		
		
		return "vehicles";
	}

}
