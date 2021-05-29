package com.study.FarmersChoice.entity;

import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

//@Entity
@Component
@Scope("prototype")
public class CropMaintence {
	
	//@Id
	//@GeneratedValue(strategy = GenerationType.AUTO)
	private long ID;
	
    private String weedControl;
	
	private List<CropProtection> cropProtection;
	
	private List<Irrigation> irrrigation;
	
	public List<Irrigation> getIrrrigation() {
		return irrrigation;
	}

	public long getID() {
		return ID;
	}

	public void setID(long iD) {
		ID = iD;
	}

	public void setIrrrigation(List<Irrigation> irrrigation) {
		this.irrrigation = irrrigation;
	}

	public String getWeedControl() {
		return weedControl;
	}

	public void setWeedControl(String weedControl) {
		this.weedControl = weedControl;
	}

	public List<CropProtection> getCropProtection() {
		return cropProtection;
	}

	public void setCropProtection(List<CropProtection> cropProtection) {
		this.cropProtection = cropProtection;
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
		CropMaintence other = (CropMaintence) obj;
		if (ID != other.ID)
			return false;
		return true;
	}
		
}
