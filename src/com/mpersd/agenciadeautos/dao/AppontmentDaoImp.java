package com.mpersd.agenciadeautos.dao;

import org.springframework.stereotype.Repository;

import com.mpersd.agenciadeautos.domain.Appointment;


@Repository("appointmentDao")
public class AppontmentDaoImp extends AbstractDao<Integer, Appointment> implements AppointmentDao {

}
