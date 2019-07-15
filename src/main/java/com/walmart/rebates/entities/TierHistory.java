package com.walmart.rebates.entities;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.IdClass;
import javax.persistence.Table;

@Entity
@Table(name = "\"Tierhistory\"")
@IdClass(TierHistKeys.class)
public class TierHistory {

	@Id
	@Column(name = "\"ItemNumber\"")
	private int itemNumber;

	@Id
	@Column(name = "\"VendorNumber\"")
	private String vendorNum;

	@Id
	@Column(name = "\"AgreementNumber\"")
	private String agreementnum;

	@Id
	@Column(name = "\"FromValue\"")
	private int fromvalue;
    
	@Column(name = "\"ToValue\"")
	private int tovalue;
	
	@Column(name = "\"TierRate\"")
	private float TierRate;

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

	public String getAgreementnum() {
		return agreementnum;
	}

	public void setAgreementnum(String agreementnum) {
		this.agreementnum = agreementnum;
	}

	public int getFromvalue() {
		return fromvalue;
	}

	public void setFromvalue(int fromvalue) {
		this.fromvalue = fromvalue;
	}

	public int getTovalue() {
		return tovalue;
	}

	public void setTovalue(int tovalue) {
		this.tovalue = tovalue;
	}

	public float getTierRate() {
		return TierRate;
	}

	public void setTierRate(float tierRate) {
		TierRate = tierRate;
	}
}