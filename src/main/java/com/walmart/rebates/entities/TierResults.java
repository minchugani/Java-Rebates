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

@Entity
@Table(name = "\"TierResults\"")
@IdClass(TierKeys.class)
public class TierResults implements Serializable {
//	@EmbeddedId TierKeys tierkeys ;
	@Id
	@Column(name = "\"ItemNumber\"")
	private int itemNumber;

	@Id
	@Column(name = "\"VendorNumber\"")
	private int vendorNum;


	@Id
	@Column(name = "\"TierId\"")
	private int Tierid;

	@Column(name = "\"TierRate\"")
	private int TierRate;
	
	@OneToOne
	@JoinColumn(name = "\"TierId\"", referencedColumnName = "\"TierId\"" , insertable = false ,updatable = false)
	private TierData tierdata ;
	
	public int getTierid() {
		return Tierid;
	}

	public void setTierid(int tierid) {
		Tierid = tierid;
	}
	public int getTierRate() {
		return TierRate;
	}

	public void setTierRate(int tierRate) {
		TierRate = tierRate;
	}

	public int getItemNumber() {
		return itemNumber;
	}

	public void setItemNumber(int itemNumber) {
		this.itemNumber = itemNumber;
	}

	public int getVendorNumber() {
		return vendorNum;
	}

	public void setVendorNumber(int vendorNum) {
		this.vendorNum = vendorNum;
	}

	public int getVendorNum() {
		return vendorNum;
	}

	public void setVendorNum(int vendorNum) {
		this.vendorNum = vendorNum;
	}
	
/*	public TierKeys getTierkeys() {
		return tierkeys;
	}

	public void setTierkeys(TierKeys tierkeys) {
		this.tierkeys = tierkeys;
	}*/


/*	public int getTierid() {
		return Tierid;
	}

	public void setTierid(int tierid) {
		Tierid = tierid;
	}*/
}
