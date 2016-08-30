package com.mpersd.agenciadeautos.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.mpersd.agenciadeautos.dao.AppointmentDao;

@Service("appointmentService")
@Transactional
public class AppointmentServiceImp implements AppointmentService {

	@Autowired
	private AppointmentDao udao;
	
	
}
