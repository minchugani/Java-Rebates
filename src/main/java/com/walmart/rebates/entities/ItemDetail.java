package com.walmart.rebates.entities;

import java.io.Serializable;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinColumns;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.persistence.Table;

//import com.walmart.rebates.dao.MerchHier;

@Entity
@Table(name = "\"ItemDetail\"")

public class ItemDetail implements Serializable {
	@EmbeddedId
	ItemKeys itemkeys;

	@Column(name = "\"Department\"")
	private int department;

	@Column(name = "\"Subclass\"")
	private int subclass;

	@Column(name = "\"Fineline\"")
	private int fineline;

	@Column(name = "\"SalesQuantity\"")
	private int salesQuantity;

	@Column(name = "\"UOM\"")
	private char uOM;

	@Column(name = "\"SalesAmount\"")
	private int salesAmt;

	@Column(name = "\"Currency\"")
	private String curr;

	@Column(name = "\"ItemDescrption\"")
	private String itemDes;

	@OneToMany
	@JoinColumns({
			@JoinColumn(name = "\"ItemNumber\"", referencedColumnName = "\"ItemNumber\"", insertable = false, updatable = false),
			@JoinColumn(name = "\"VendorNumber\"", referencedColumnName = "\"VendorNumber\"", insertable = false, updatable = false) })
	private List<TierResults> tierresults;

	@OneToMany
	@JoinColumns({
			@JoinColumn(name = "\"ItemNumber\"", referencedColumnName = "\"ItemNumber\"", insertable = false, updatable = false),
			@JoinColumn(name = "\"VendorNumber\"", referencedColumnName = "\"VendorNumber\"", insertable = false, updatable = false) })
	private List<ItemSales> itemsales ;
	public String getItemDes() {
		return itemDes;
	}

	public ItemKeys getItemkeys() {
		return itemkeys;
	}

	public void setItemkeys(ItemKeys itemkeys) {
		this.itemkeys = itemkeys;
	}

	public int getDepartment() {
		return department;
	}

	public void setDepartment(int department) {
		this.department = department;
	}

	public int getSubclass() {
		return subclass;
	}

	public void setSubclass(int subclass) {
		this.subclass = subclass;
	}

	public int getFineline() {
		return fineline;
	}

	public void setFineline(int fineline) {
		this.fineline = fineline;
	}

	public char getuOM() {
		return uOM;
	}

	public void setuOM(char uOM) {
		this.uOM = uOM;
	}

	public void setItemDes(String itemDes) {
		itemDes = itemDes;
	}

	public String getCurr() {
		return curr;
	}

	public void setCurr(String curr) {
		curr = curr;
	}

	public int getSalesAmt() {
		return salesAmt;
	}

	public void setSalesAmt(int salesAmt) {
		salesAmt = salesAmt;
	}

	public char getUOM() {
		return uOM;
	}

	public void setUOM(char uOM) {
		uOM = uOM;
	}

	public int getSalesQuantity() {
		return salesQuantity;
	}

	public void setSalesQuantity(int salesQuantity) {
		salesQuantity = salesQuantity;
	}

}