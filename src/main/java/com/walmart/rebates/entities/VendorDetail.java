package com.walmart.rebates.entities;


import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
import javax.persistence.Table;


@Entity
@Table(name = "\"VendorMaster\"")
public class VendorDetail {
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Id
	@Column(name = "\"VendorNumber\"")
	private int VendorNum;

	@Column(name = "\"VendorName\"")
	private String VendorName;

	@Column(name = "\"VendorAddrress\"")
	private String VendorAddr;
	@OneToMany
	@JoinColumn(name = "\"VendorNumber\"", referencedColumnName = "\"VendorNumber\"")
	private List<ItemDetail> itmdtl;

	public int getVendorNum() {
		return VendorNum;
	}

	public void setVendorNum(int vendorNum) {
		VendorNum = vendorNum;
	}

	public String getVendorName() {
		return VendorName;
	}

	public void setVendorName(String vendorName) {
		VendorName = vendorName;
	}

	public String getVendorAddr() {
		return VendorAddr;
	}

	public void setVendorAddr(String vendorAddr) {
		VendorAddr = vendorAddr;
	}

}
