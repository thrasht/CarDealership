package com.mpersd.agenciadeautos.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.mpersd.agenciadeautos.dao.VehicleTypeDao;

@Service("vehicleTypeService")
@Transactional
public class VehicleTypeServiceImp implements VehicleTypeService {

	@Autowired
	private VehicleTypeDao vtdao;
	
	
}
