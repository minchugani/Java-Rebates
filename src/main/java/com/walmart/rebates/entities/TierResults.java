package com.walmart.rebates.entities;

import java.beans.Transient;
import java.io.IOException;
import java.io.Serializable;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.List;
import java.util.Map;

import javax.annotation.PostConstruct;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Id;
import javax.persistence.IdClass;
import javax.persistence.JoinColumn;
import javax.persistence.JoinColumns;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.persistence.Persistence;
import javax.persistence.PersistenceContext;
import javax.persistence.PostLoad;
import javax.persistence.PostPersist;
import javax.persistence.PostUpdate;
import javax.persistence.PrePersist;
import javax.persistence.PreUpdate;
import javax.persistence.Query;
import javax.persistence.Table;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.ws.rs.POST;

import org.apache.olingo.odata2.api.ODataServiceFactory;
import org.apache.olingo.odata2.core.servlet.ODataServlet;
import org.apache.olingo.odata2.core.servlet.RestUtil;
import org.hibernate.annotations.Formula;
import org.hibernate.mapping.Set;
import org.hibernate.sql.Update;
import org.hibernate.validator.internal.util.privilegedactions.GetDeclaredFields;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.cloudfoundry.com.fasterxml.jackson.databind.annotation.JsonSerialize;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.Bean;
import org.springframework.transaction.annotation.Transactional;

import com.fasterxml.jackson.annotation.JsonGetter;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
//import com.fasterxml.jackson.databind.annotation.JsonSerialize;
import com.fasterxml.jackson.datatype.hibernate5.Hibernate5Module;
import com.walmart.rebates.utils.SpringEnabledOdataServlet;
//import com.walmart.rebates.repository.ProductRepository;


@Entity
@Table(name = "\"TierResults\"")
@IdClass(TierKeys.class)

public class TierResults  extends ODataServlet implements Serializable{


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



private float calval ;
private int quan ;			
@PostLoad
public void calculate() {
int from_value ;
 int to_value ;
from_value = getFromvalue() ;
to_value = getTovalue() ;
String str = SpringEnabledOdataServlet.Str;
if (str != null) {
int result = Integer.parseInt(str);	 
if (result > from_value && result < to_value ) { 
this.calval = result*(getTierRate()) ;
}
}

//EntityManagerFactory emf = Persistence.createEntityManagerFactory("sah"); 
//EntityManager em = emf.createEntityManager();
//this.quan = 10 ;
//em.persist(this);
}



public void setQuan(int quan) {
	this.quan = quan;
}

public int getQuan() {
	return quan;
}
public void setCalval(float calval) {
	this.calval = calval;
}
public float getCalval() {
	return calval;
}






	
/*@Formula("(select sum(tier_results.tier_rate) from tier_results where quan > tier_results.from_value "
		+ "and quan < tier_results.to_value and tier_results.item_number = item_number )*10")
//@Formula("(select tier_results.tier_rate from tier_results where tier_results.to_value = quan)")
private float cal ;
public float getCal() {
	return cal;
}

public void setCal(float cal) {
	this.cal = cal;
}*/









//}
	




//@javax.persistence.Transient
//@JsonSerialize
//@JsonDeserialize
/*	
	@Transient
    @JsonGetter(value = "transientProperty")
    public String getType() {
        return type;
    }

//@JsonProperty("Test")

/*public int getAmount() {
	System.out.println("I am in1") ;
	return amount;
}

public void setAmount(int amount) {
	this.amount = amount;
}*/


/*@PostConstruct
public void getdtl() {
	System.out.println("I am in ") ;

	}*/

//	@PostConstruct
//	@javax.persistence.Transient
/*	private float rebateamount ;

	public float getRebateamount() {
		System.out.println("I am out ");
	return rebateamount;
}

	public void setRebateamount(float rebateamount) {
		this.rebateamount = rebateamount;
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
