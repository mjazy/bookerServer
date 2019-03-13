package com.mobileprogramming.domain;

import javax.persistence.Entity;
import javax.persistence.GenerationType;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 * Data model for entries.
 * @author MJazy
 *
 */
@Entity
@Table(name="entry")
public class Entry {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	private String servicesSelected;
	private String daysSelected;

	public Entry() {		
	}
	
	public Entry(String servicesSelected, String daysSelected) {
		this.servicesSelected = servicesSelected;
		this.daysSelected = daysSelected;
	}
	
	public int getId() {
		return id;
	}
	
	public void setId(int id) {
		this.id = id;
	}
	
	public String getServicesSelected() {
		return servicesSelected;
	}

	public void setServicesSelected(String servicesSelected) {
		this.servicesSelected = servicesSelected;
	}

	public String getDaysBought() {
		return daysSelected;
	}

	public void setDaysBought(String daysBought) {
		this.daysSelected = daysBought;
	}
	
}
