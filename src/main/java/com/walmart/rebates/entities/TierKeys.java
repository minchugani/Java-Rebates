package com.walmart.rebates.entities;


import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Embeddable;

import com.couchbase.client.java.repository.annotation.Id;

@Embeddable
public class TierKeys implements Serializable {
	private int itemNumber;
	private int vendorNum;
	private int Tierid;

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + Tierid;
		result = prime * result + itemNumber;
		result = prime * result + vendorNum;
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
		TierKeys other = (TierKeys) obj;
		if (Tierid != other.Tierid)
			return false;
		if (itemNumber != other.itemNumber)
			return false;
		if (vendorNum != other.vendorNum)
			return false;
		return true;
	}

}
