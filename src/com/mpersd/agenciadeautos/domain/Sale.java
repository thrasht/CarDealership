package com.mpersd.agenciadeautos.domain;

import java.io.Serializable;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;


@Entity
@Table(name = "sales")
public class Sale implements Serializable {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	
	@Column(name = "user_id")
	private int userId;
	
	@Column(name = "seller_id")
	private int sellerId;
	
	@Column
	private float total;
	
	
	User client;
	
	User seller;
	
	
	
	public Sale() { 
		
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


	public int getSellerId() {
		return sellerId;
	}


	public void setSeller_id(int sellerId) {
		this.sellerId = sellerId;
	}


	public float getTotal() {
		return total;
	}


	public void setTotal(float total) {
		this.total = total;
	}


	public User getClient() {
		return client;
	}


	public void setClient(User client) {
		this.client = client;
	}


	public User getSeller() {
		return seller;
	}


	public void setSeller(User seller) {
		this.seller = seller;
	}



	public void setSellerId(int sellerId) {
		this.sellerId = sellerId;
	}
	
	
	
	

}
