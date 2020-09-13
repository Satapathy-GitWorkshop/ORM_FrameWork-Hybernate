package com.nt.entity;

import java.io.Serializable;
import java.util.Date;

public class PersonInfo implements Serializable {
	private Integer pid;
	private String pname;
	private String padd;
	private Date dob;
	private Date doj;
	private Date dom;
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
