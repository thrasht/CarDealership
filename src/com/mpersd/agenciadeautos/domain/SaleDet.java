package com.mpersd.agenciadeautos.domain;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;


@Entity
@Table(name = "sales_det")
public class SaleDet implements Serializable {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	
	@Column(name = "sale_id")
	private int saleId;
	
	@Column(name = "vehicle_id")
	private int vehicleId;
	
	@Column
	private int amount;
	
	@Column(name = "sub_total")
	private float subTotal;
	
	
	
	public SaleDet() {
		
	}


	public int getId() {
		return id;
	}


	public void setId(int id) {
		this.id = id;
	}


	public int getSaleId() {
		return saleId;
	}


	public void setSaleId(int saleId) {
		this.saleId = saleId;
	}


	public int getVehicleId() {
		return vehicleId;
	}


	public void setVehicleId(int vehicleId) {
		this.vehicleId = vehicleId;
	}


	public int getAmount() {
		return amount;
	}


	public void setAmount(int amount) {
		this.amount = amount;
	}


	public float getSubTotal() {
		return subTotal;
	}


	public void setSubTotal(float subTotal) {
		this.subTotal = subTotal;
	}
	
	
	
	

}
