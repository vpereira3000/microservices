package com.gm.vp.gettinglocation.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity 
public class Location {
  @Id
  @GeneratedValue(strategy=GenerationType.AUTO)
  private Integer id;

  private String idtruck;

  private String lat;
  
  private String lng;
  
  public Integer getId() {
	return id;
  }

	public void setId(Integer id) {
		this.id = id;
	}
	
	public String getIdtruck() {
		return idtruck;
	}
	
	public void setIdtruck(String idtruck) {
		this.idtruck = idtruck;
	}
	
	public String getLat() {
		return lat;
	}
	
	public void setLat(String lat) {
		this.lat = lat;
	}
	
	public String getLng() {
		return lng;
	}
	
	public void setLng(String lng) {
		this.lng = lng;
	}

}
