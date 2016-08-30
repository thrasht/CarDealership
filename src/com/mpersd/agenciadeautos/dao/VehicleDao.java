package com.mpersd.agenciadeautos.dao;

import java.util.List;

import com.mpersd.agenciadeautos.domain.Vehicle;

public interface VehicleDao {
	
	public List<Vehicle> findAllVehicles();

}
