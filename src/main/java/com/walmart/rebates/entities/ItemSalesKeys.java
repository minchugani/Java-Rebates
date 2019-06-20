package com.walmart.rebates.entities;


import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Embeddable;

@Embeddable
public class ItemSalesKeys implements Serializable {

	private int itemNumber;
	private int vendorNum;
	private int period;

	public int getItemNumber() {
		return itemNumber;
	}

	public void setItemNumber(int itemNumber) {
		this.itemNumber = itemNumber;
	}

	public int getVendorNum() {
		return vendorNum;
	}

	public void setVendorNum(int vendorNum) {
		this.vendorNum = vendorNum;
	}

	public int getPeriod() {
		return period;
	}

	public void setPeriod(int period) {
		this.period = period;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + itemNumber;
		result = prime * result + period;
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
		ItemSalesKeys other = (ItemSalesKeys) obj;
		if (itemNumber != other.itemNumber)
			return false;
		if (period != other.period)
			return false;
		if (vendorNum != other.vendorNum)
			return false;
		return true;
	}

}
