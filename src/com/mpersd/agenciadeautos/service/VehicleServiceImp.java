package com.mpersd.agenciadeautos.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.mpersd.agenciadeautos.dao.VehicleDao;
import com.mpersd.agenciadeautos.domain.Vehicle;

@Service("vehicleService")
@Transactional
public class VehicleServiceImp implements VehicleService {

	@Autowired
	private VehicleDao vdao;

	@Override
	public List<Vehicle> findAllVehicles() {
		return vdao.findAllVehicles();
	}
	
	
	
	
}
