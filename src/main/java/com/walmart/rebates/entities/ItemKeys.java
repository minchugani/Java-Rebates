package com.walmart.rebates.entities;
import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Embeddable;
@Embeddable
public class ItemKeys implements Serializable {
	
	@Column(name = "\"ItemNumber\"" )
		private int itemNumber;
	@Column(name = "\"VendorNumber\"" )
		private String vendorNum;
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
		@Override
		public int hashCode() {
			final int prime = 31;
			int result = 1;
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
			ItemKeys other = (ItemKeys) obj;
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



