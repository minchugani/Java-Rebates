package com.walmart.rebates.entities;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Embeddable;

import com.couchbase.client.java.repository.annotation.Id;


@Embeddable
public class TierKeys implements Serializable {
	private int itemNumber;
	private String vendorNum;
	private int fromvalue;

	public int getItemNumber() {
		return itemNumber;
	}

	public void setItemNumber(int itemNumber) {
		this.itemNumber = itemNumber;
	}

	public String getVendorNum() {
		return vendorNum;
	}

	public void setVendorNum(String vendorNum) {
		this.vendorNum = vendorNum;
	}

	public int getFromvalue() {
		return fromvalue;
	}

	public void setFromvalue(int fromvalue) {
		this.fromvalue = fromvalue;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + fromvalue;
		result = prime * result + itemNumber;
		result = prime * result + ((vendorNum == null) ? 0 : vendorNum.hashCode());
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
		if (fromvalue != other.fromvalue)
			return false;
		if (itemNumber != other.itemNumber)
			return false;
		if (vendorNum == null) {
			if (other.vendorNum != null)
				return false;
		} else if (!vendorNum.equals(other.vendorNum))
			return false;
		return true;
	}
}
