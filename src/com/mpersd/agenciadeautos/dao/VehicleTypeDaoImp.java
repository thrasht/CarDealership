package com.mpersd.agenciadeautos.dao;

import org.springframework.stereotype.Repository;

import com.mpersd.agenciadeautos.domain.VehicleType;

@Repository("vehicleTypeDao")
public class VehicleTypeDaoImp extends AbstractDao<Integer, VehicleType> implements VehicleTypeDao {

}
