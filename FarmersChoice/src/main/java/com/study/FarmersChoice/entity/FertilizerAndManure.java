package com.study.FarmersChoice.entity;

import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component
@Scope("prototype")
public class FertilizerAndManure {
	
	//@Id
	//@GeneratedValue(strategy = GenerationType.AUTO)
	private long ID;
		
	private String fertilizerType;
	
	private String manureType;
	
	private String fertilizerNumber;
	
	private String manureNumber;
	
	public long getID() {
		return ID;
	}

	public void setID(long iD) {
		ID = iD;
	}

	public String getFertilizerType() {
		return fertilizerType;
	}

	public void setFertilizerType(String fertilizerType) {
		this.fertilizerType = fertilizerType;
	}

	public String getManureType() {
		return manureType;
	}

	public void setManureType(String manureType) {
		this.manureType = manureType;
	}

	public String getFertilizerNumber() {
		return fertilizerNumber;
	}

	public void setFertilizerNumber(String fertilizerNumber) {
		this.fertilizerNumber = fertilizerNumber;
	}

	public String getManureNumber() {
		return manureNumber;
	}

	public void setManureNumber(String manureNumber) {
		this.manureNumber = manureNumber;
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
		FertilizerAndManure other = (FertilizerAndManure) obj;
		if (ID != other.ID)
			return false;
		return true;
	}
	

}
