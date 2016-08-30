package com.mpersd.agenciadeautos.dao;

import java.util.List;

import org.hibernate.Criteria;
import org.springframework.stereotype.Repository;

import com.mpersd.agenciadeautos.domain.Vehicle;


@Repository("vehicleDao")
public class VehicleDaoImp extends AbstractDao<Integer, Vehicle> implements VehicleDao{

	@Override
	public List<Vehicle> findAllVehicles() {
		Criteria criteria = createEntityCriteria();
        return (List<Vehicle>) criteria.list();
	}
	

}
