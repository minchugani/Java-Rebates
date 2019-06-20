package com.walmart.rebates.entities;

import java.io.Serializable;

import javax.persistence.Embeddable;
import javax.persistence.Column;
@Embeddable
public class MerchHierKeys implements Serializable{
	@Column(name = "\"Department\"")
	public int department;
	@Column(name = "\"Subclass\"")
	public int subclass;
	@Column(name = "\"Fineline\"")
	public int fineline;
	@Column(name ="\"DepartmentCategory\"")
	public int departmentCatg;
	public int getDepartment() {
		return department;
	}	public void setDepartment(int department) {
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
	public int getDepartmentCatg() {
		return departmentCatg;
	}
	public void setDepartmentCatg(int departmentCatg) {
		this.departmentCatg = departmentCatg;
	}
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + department;
		result = prime * result + departmentCatg;
		result = prime * result + fineline;
		result = prime * result + subclass;
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
		MerchHierKeys other = (MerchHierKeys) obj;
		if (department != other.department)
			return false;
		if (departmentCatg != other.departmentCatg)
			return false;
		if (fineline != other.fineline)
			return false;
		if (subclass != other.subclass)
			return false;
		return true;
	}
	

}
