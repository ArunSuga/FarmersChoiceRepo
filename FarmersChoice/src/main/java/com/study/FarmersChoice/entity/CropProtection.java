package com.study.FarmersChoice.entity;

import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component
@Scope("prototype")
public class CropProtection {
	
	//@Id
	//@GeneratedValue(strategy = GenerationType.AUTO)
	private long ID;
	
	private String pest;
	
	private String disease;
	
	private String pestProtection;
	
	private String diseaseProtection;
	
	public long getID() {
		return ID;
	}

	public void setID(long iD) {
		ID = iD;
	}


	public String getPest() {
		return pest;
	}

	public void setPest(String pest) {
		this.pest = pest;
	}

	public String getDisease() {
		return disease;
	}

	public void setDisease(String disease) {
		this.disease = disease;
	}

	public String getPestProtection() {
		return pestProtection;
	}

	public void setPestProtection(String pestProtection) {
		this.pestProtection = pestProtection;
	}

	public String getDiseaseProtection() {
		return diseaseProtection;
	}

	public void setDiseaseProtection(String diseaseProtection) {
		this.diseaseProtection = diseaseProtection;
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
		CropProtection other = (CropProtection) obj;
		if (ID != other.ID)
			return false;
		return true;
	}
	

}
