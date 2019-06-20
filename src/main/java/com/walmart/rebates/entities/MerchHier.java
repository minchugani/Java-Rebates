package com.walmart.rebates.entities;


import java.io.Serializable;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.JoinColumns;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
//@IdClass(MerchHierKeys.class)
@Table(name = "\"MerchHier\"")
public class MerchHier implements Serializable {
	@EmbeddedId
	MerchHierKeys merchhierkeys;
	@Column(name = "\"DepartmentDesc\"")
	private String departmentDesc;

	@Column(name = "\"SubclassDesc\"")
	private String subclaaDesc;

	@Column(name = "\"FinlineDesc\"")
	private String finlinetDesc;

	@Column(name = "\"DeptCategoryDesc\"")
	private String deptCatgDesc;

	@OneToMany
	@JoinColumns({
			@JoinColumn(name = "\"Department\"", referencedColumnName = "\"Department\"", insertable = false, updatable = false),
			@JoinColumn(name = "\"Subclass\"", referencedColumnName = "\"Subclass\"", insertable = false, updatable = false),
			@JoinColumn(name = "\"Fineline\"", referencedColumnName = "\"Fineline\"", insertable = false, updatable = false),
			@JoinColumn(name = "\"DepartmentCategory\"", referencedColumnName = "\"DepartmentCategory\"", insertable = false, updatable = false) })
	private List<ItemDetail> itmdtl;

	public MerchHierKeys getMerchhierkeys() {
		return merchhierkeys;
	}

	public void setMerchhierkeys(MerchHierKeys merchhierkeys) {
		this.merchhierkeys = merchhierkeys;
	}

	public List<ItemDetail> getItmdtl() {
		return itmdtl;
	}

	public void setItmdtl(List<ItemDetail> itmdtl) {
		this.itmdtl = itmdtl;
	}

	public String getDepartmentDesc() {
		return departmentDesc;
	}

	public void setDepartmentDesc(String departmentDesc) {
		this.departmentDesc = departmentDesc;
	}

	public String getSubclaaDesc() {
		return subclaaDesc;
	}

	public void setSubclaaDesc(String subclaaDesc) {
		this.subclaaDesc = subclaaDesc;
	}

	public String getFinlinetDesc() {
		return finlinetDesc;
	}

	public void setFinlinetDesc(String finlinetDesc) {
		this.finlinetDesc = finlinetDesc;
	}

	public String getDeptCatgDesc() {
		return deptCatgDesc;
	}

	public void setDeptCatgDesc(String deptCatgDesc) {
		this.deptCatgDesc = deptCatgDesc;
	}

}