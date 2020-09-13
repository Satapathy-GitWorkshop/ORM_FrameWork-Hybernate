package com.nt.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.Version;

import org.hibernate.annotations.Type;

@Entity
@Table(name = "ACCOUNT_STATUS")
public class BankAccount {

	@Id
	@GeneratedValue(strategy = GenerationType.SEQUENCE)
private Long accno;
	
	@Column( name =" HOLDERNAME",length = 23)
	@Type(type = "string")
private String holdername;
	
	@Column( name =" TYPE",length = 23)
	@Type(type = "string")
private String type;
	
	@Column( name ="BALANCE")
	@Type(type = "float")
private Float balance;
	
	@Version
	@Column( name = "COUNT")
	@Type(type = "int")
private Integer version_count; //any name u can take but type must be(int,short,byte,long)
	
	//Setter and Getter method
	public Long getAccno() {
		return accno;
	}
	public void setAccno(Long accno) {
		this.accno = accno;
	}
	public String getHoldername() {
		return holdername;
	}
	public void setHoldername(String holdername) {
		this.holdername = holdername;
	}
	public String getType() {
		return type;
	}
	public void setType(String type) {
		this.type = type;
	}
	public Float getBalance() {
		return balance;
	}
	public void setBalance(Float balance) {
		this.balance = balance;
	}
	public Integer getVersion_count() {
		return version_count;
	}
	public void setVersion_count(Integer version_count) {
		this.version_count = version_count;
	}
	@Override
	public String toString() {
		return "BankAccount [accno=" + accno + ", holdername=" + holdername + ", type=" + type + ", balance=" + balance
				+ ", version_count=" + version_count + "]";
	}

	
	

}
