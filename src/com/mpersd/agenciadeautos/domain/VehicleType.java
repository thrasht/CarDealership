package com.mpersd.agenciadeautos.domain;

import java.io.Serializable;
import java.util.Collection;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.xml.bind.annotation.XmlTransient;

@Entity
@Table(name = "vehicle_types")
public class VehicleType implements Serializable {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	
	@Column
	private String type;
	
	/*
	@OneToMany(mappedBy="type", cascade=CascadeType.ALL, fetch=FetchType.EAGER)
	private List<Vehicle> vechicles; 
	*/
	@OneToMany(cascade = CascadeType.ALL, mappedBy = "typeId")
    private Collection<Vehicle> vehiclesCollection;

	/**
	 * Setters, getters and empty Constructor
	 */
	
	public VehicleType() {
		
	}

	
	@XmlTransient
    public Collection<Vehicle> getVehiclesCollection() {
        return vehiclesCollection;
    }

    public void setVehiclesCollection(Collection<Vehicle> vehiclesCollection) {
        this.vehiclesCollection = vehiclesCollection;
    }

	public int getId() {
		return id;
	}


	public void setId(int id) {
		this.id = id;
	}


	public String getType() {
		return type;
	}


	public void setType(String type) {
		this.type = type;
	}
	
	
	
	
	

}
