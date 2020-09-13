package com.nt.entity;

import java.io.Serializable;
import java.time.LocalDate;
import java.time.LocalDateTime;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import org.hibernate.annotations.Type;


@Entity
@Table(name ="PERSONDETAILS")
public class PersonInfo implements Serializable {
	
	@Id
	@GeneratedValue(strategy = GenerationType.SEQUENCE )
	private Integer pid;
	
	@Column(length = 20)
	@Type(type = "string")     //If we are not mentioning Column name then property name will take as Col name
	private String pname;

	@Column(length = 32)
	@Type(type = "string")
    private String padd;
	
	private LocalDate dob;
	private LocalDateTime doj;   //No need of Specifying the Type Hibernate will  take Care..
	private LocalDate dom;       //If we give also it throws error
	
	
	//setter and getter method
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
	public LocalDate getDob() {
		return dob;
	}
	public void setDob(LocalDate dob) {
		this.dob = dob;
	}
	public LocalDateTime getDoj() {
		return doj;
	}
	public void setDoj(LocalDateTime doj) {
		this.doj = doj;
	}
	public LocalDate getDom() {
		return dom;
	}
	public void setDom(LocalDate dom) {
		this.dom = dom;
	}
	
	@Override
	public String toString() {
		return "PersonInfo [pid=" + pid + ", pname=" + pname + ", padd=" + padd + ", dob=" + dob + ", doj=" + doj
				+ ", dom=" + dom + "]";
	}

}
