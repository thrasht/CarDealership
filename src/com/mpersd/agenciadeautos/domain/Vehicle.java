package com.mpersd.agenciadeautos.domain;

import java.io.Serializable;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.ForeignKey;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;


@Entity
@Table(name = "vehicles")
public class Vehicle implements Serializable {
	
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	
	/*
	@Column(name = "type_id")
	private int typeId;
	*/
	@Column
	private String brand;
	
	@Column
	private String model;
	
	@Column
	private String color;
	
	@Column
	private float value;
	
	@Column
	private String image;
	
	/*
	@JoinColumn(name = "id", referencedColumnName = "vehicle_type")
	@ManyToOne
	private VehicleType type;
	*/
	@JoinColumn(name = "type_id", referencedColumnName = "id")
    @ManyToOne(optional = false)
	private VehicleType typeId;
    
	/**
	 * Methods
	 */
	
	public Vehicle(){
		
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}
/*
	public int getTypeId() {
		return typeId;
	}

	public void setTypeId(int typeId) {
		this.typeId = typeId;
	}
*/
	public VehicleType getTypeId() {
        return typeId;
    }

    public void setTypeId(VehicleType typeId) {
        this.typeId = typeId;
    }
	    
	public String getBrand() {
		return brand;
	}

	public void setBrand(String brand) {
		this.brand = brand;
	}

	public String getModel() {
		return model;
	}

	public void setModel(String model) {
		this.model = model;
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	public float getValue() {
		return value;
	}

	public void setValue(float value) {
		this.value = value;
	}

	public String getImage() {
		return image;
	}

	public void setImage(String image) {
		this.image = image;
	}

	/*
	public VehicleType getType() {
		return type;
	}

	public void setType(VehicleType type) {
		this.type = type;
	}
    
    */

}
