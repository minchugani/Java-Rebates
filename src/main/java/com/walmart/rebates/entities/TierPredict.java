package com.walmart.rebates.entities;


import java.io.Serializable;
import java.util.List;

import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.IdClass;
import javax.persistence.JoinColumn;
import javax.persistence.JoinColumns;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.persistence.Table;
import javax.persistence.Transient;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import com.fasterxml.jackson.databind.annotation.JsonSerialize;


@Entity
@Table(name = "\"TierResults\"")
@IdClass(TierKeys.class)

public class TierPredict implements Serializable {
//	@EmbeddedId TierKeys tierkeys ;
	
	@Id
	@Column(name = "\"ItemNumber\"")
	private int itemNumber;

	@Id
	@Column(name = "\"VendorNumber\"")
	private String vendorNum;


	@Id
	@Column(name = "\"FromValue\"")
	private int fromvalue;
    
	@Column(name = "\"ToValue\"")
	private int tovalue;
	
	@Column(name = "\"TierRate\"")
	private float TierRate;
	
	
//	 @javax.persistence.Transient
	
	
//	@ManyToOne
//	@JoinColumn(name = "\"TierId\"", referencedColumnName = "\"TierId\"" , insertable = false ,updatable = false)
//	private TierData tierdata ;
	
	
	public float getTierRate() {
		return TierRate;
	}

	public void setTierRate(float tierRate) {
		TierRate = tierRate;
	}

	public int getItemNumber() {
		return itemNumber;
	}

	public void setItemNumber(int itemNumber) {
		this.itemNumber = itemNumber;
	}

	public String getVendorNumber() {
		return vendorNum;
	}

	public void setVendorNumber(String vendorNum) {
		this.vendorNum = vendorNum;
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

	public int getTovalue() {
		return tovalue;
		
	}

	public void setTovalue(int tovalue) {
		this.tovalue = tovalue;
	}
}