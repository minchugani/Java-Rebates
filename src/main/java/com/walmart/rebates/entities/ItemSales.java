package com.walmart.rebates.entities;


import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.IdClass;
import javax.persistence.JoinColumn;
import javax.persistence.JoinColumns;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table(name = "\"ItemSales\"")
@IdClass(ItemSalesKeys.class)
public class ItemSales implements Serializable {

    @Id
	@Column(name = "\"ItemNumber\"")
    private int itemNumber;
    @Id
	@Column(name = "\"VendorNumber\"")
	private int vendorNum;
    @Id
	@Column(name = "\"Period\"")
	private int period;

	@Column(name = "\"POAmount\"")
	private int poAmount;

	@Column(name = "\"POQuantity\"")
	private int poQuantity;

	public int getPeriod() {
		return period;
	}

	public void setPeriod(int period) {
		this.period = period;
	}

	public int getPoAmount() {
		return poAmount;
	}

	public void setPoAmount(int poAmount) {
		this.poAmount = poAmount;
	}

	public int getPoQuantity() {
		return poQuantity;
	}

	public void setPoQuantity(int poQuantity) {
		this.poQuantity = poQuantity;
	}

}

