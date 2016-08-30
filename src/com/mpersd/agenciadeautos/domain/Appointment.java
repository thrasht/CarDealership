package com.mpersd.agenciadeautos.domain;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import org.joda.time.DateTime;


@Entity
@Table(name = "appointments")
public class Appointment implements Serializable {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	
	@Column(name = "user_id")
	private int userId;
	
	@Column(name = "vehicle_id")
	private int vehicleId;
	
	@Column(name = "created_at")
	private DateTime createdAt;
	
	@Column(name = "appointment_date")
	private DateTime appointmentDate;
	
	User client;
	
	Vehicle vehicle;
	
	
	public Appointment() {
		
	}


	public int getId() {
		return id;
	}


	public void setId(int id) {
		this.id = id;
	}


	public int getUserId() {
		return userId;
	}


	public void setUserId(int userId) {
		this.userId = userId;
	}


	public int getVehicleId() {
		return vehicleId;
	}


	public void setVehicleId(int vehicleId) {
		this.vehicleId = vehicleId;
	}


	public DateTime getCreatedAt() {
		return createdAt;
	}


	public void setCreatedAt(DateTime createdAt) {
		this.createdAt = createdAt;
	}


	public DateTime getAppointmentDate() {
		return appointmentDate;
	}


	public void setAppointmentDate(DateTime appointmentDate) {
		this.appointmentDate = appointmentDate;
	}


	public User getClient() {
		return client;
	}


	public void setClient(User client) {
		this.client = client;
	}
	
	
	
	
	
	
}
