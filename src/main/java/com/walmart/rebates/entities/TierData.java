package com.walmart.rebates.entities;



import java.io.Serializable;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.IdClass;
import javax.persistence.JoinColumn;
import javax.persistence.JoinColumns;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table(name = "\"TierData\"")
//@IdClass(Tierdatkeys.class)

public class TierData implements Serializable  {
	@Id
	@Column(name = "\"TierId\"")
	private int TierId;
	
	//@Id
	@Column(name = "\"FromValue\"")
	private int fromValue;
	
	//@Id
	@Column(name = "\"ToValue\"")
	private int toValue;

	public int getTierId() {
		return TierId;
	}

	public void setTierId(int tierId) {
		TierId = tierId;
	}

	public int getFromValue() {
		return fromValue;
	}

	public void setFromValue(int fromValue) {
		this.fromValue = fromValue;
	}

	public int getToValue() {
		return toValue;
	}

	public void setToValue(int toValue) {
		this.toValue = toValue;
	}

}