package com.walmart.rebates.entities;

import java.io.Serializable;


public class TierHistKeys implements Serializable {
	private int itemNumber;
	private String vendorNum;
	private String agreementnum ;
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
	public String getAgreement() {
		return agreementnum;
	}
	public void setAgreement(String agreement) {
		this.agreementnum = agreement;
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
		result = prime * result + ((agreementnum == null) ? 0 : agreementnum.hashCode());
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
		TierHistKeys other = (TierHistKeys) obj;
		if (agreementnum == null) {
			if (other.agreementnum != null)
				return false;
		} else if (!agreementnum.equals(other.agreementnum))
			return false;
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
	