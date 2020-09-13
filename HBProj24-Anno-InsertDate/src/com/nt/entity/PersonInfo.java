package com.nt.entity;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

import org.hibernate.annotations.Type;


@Entity
@Table(name = "PERSONINFO")
public class PersonInfo implements Serializable {
	@Id
	@Column(name = "PID")
	@Type(type = "int")
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Integer pid;
	
	@Column( name ="PNAME",length = 20 )
	@Type(type = "string")
	private String pname;
	
	@Column(name = "PADD",length = 25)
	@Type(type = "string")
	private String padd;
	
	@Column(name = "DOB")
	@Temporal(TemporalType.DATE )
	private Date dob;
	
	@Column(name = "DOJ")
	@Temporal(TemporalType.TIMESTAMP)
	private Date doj;
	@Column(name = "DOM")
	
	@Temporal(TemporalType.DATE)
	private Date dom;
	
//Setter and Getter method	
	public Date getDob() {
		return dob;
	}
	public void setDob(Date dob) {
		this.dob = dob;
	}
	
	//pair of Setter and getter method
	public Integer getPid() {
		return pid;
	}
	public void setPid(Integer pid) {
		this.pid = pid;
	}
	public String getPname() {
		return pname;
	}
	public void setPname(String pname) {
		this.pname = pname;
	}
	public String getPadd() {
		return padd;
	}
	public void setPadd(String padd) {
		this.padd = padd;
	}
	public Date getDoj() {
		return doj;
	}
	public void setDoj(Date doj) {
		this.doj = doj;
	}
	public Date getDom() {
		return dom;
	}
	public void setDom(Date dom) {
		this.dom = dom;
	}
	@Override
	public String toString() {
		return "PersonInfo [pid=" + pid + ", pname=" + pname + ", padd=" + padd + ", dob=" + dob + ", doj=" + doj
				+ ", dom=" + dom + "]";
	}
	

}
