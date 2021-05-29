package com.study.FarmersChoice.entity;

import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component
@Scope("prototype")
public class Variety {
	
	//@Id
	//@GeneratedValue(strategy = GenerationType.AUTO)
	private long ID;
	
	private String natural;
	
	private String improved;
	
	private String hybrid;
	
	public long getID() {
		return ID;
	}

	public void setID(long iD) {
		ID = iD;
	}

	public String getNatural() {
		return natural;
	}

	public void setNatural(String natural) {
		this.natural = natural;
	}

	public String getImproved() {
		return improved;
	}

	public void setImproved(String improved) {
		this.improved = improved;
	}

	public String getHybrid() {
		return hybrid;
	}

	public void setHybrid(String hybrid) {
		this.hybrid = hybrid;
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
		Variety other = (Variety) obj;
		if (ID != other.ID)
			return false;
		return true;
	}
	
}
