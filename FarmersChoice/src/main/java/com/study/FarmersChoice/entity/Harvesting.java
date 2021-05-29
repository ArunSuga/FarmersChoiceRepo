package com.study.FarmersChoice.entity;

import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component
@Scope("prototype")
public class Harvesting {
	
	//@Id
	//@GeneratedValue(strategy = GenerationType.AUTO)
	private long ID;
		
	private String harvestFrom;
	
	private String harvestMonths;
	
	private String daysInterval;
	
	private String expectedYield;
	
	public long getID() {
		return ID;
	}

	public void setID(long iD) {
		ID = iD;
	}

	public String getHarvestFrom() {
		return harvestFrom;
	}

	public void setHarvestFrom(String harvestFrom) {
		this.harvestFrom = harvestFrom;
	}

	public String getHarvestMonths() {
		return harvestMonths;
	}

	public void setHarvestMonths(String harvestMonths) {
		this.harvestMonths = harvestMonths;
	}

	public String getDaysInterval() {
		return daysInterval;
	}

	public void setDaysInterval(String daysInterval) {
		this.daysInterval = daysInterval;
	}

	public String getExpectedYield() {
		return expectedYield;
	}

	public void setExpectedYield(String expectedYield) {
		this.expectedYield = expectedYield;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + (int) (ID ^ (ID >>> 32));
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Harvesting other = (Harvesting) obj;
		if (ID != other.ID)
			return false;
		return true;
	}

}
