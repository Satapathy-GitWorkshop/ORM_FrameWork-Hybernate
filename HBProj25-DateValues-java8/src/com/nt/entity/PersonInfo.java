package com.nt.entity;

import java.io.Serializable;
import java.time.LocalDate;
import java.time.LocalDateTime;



public class PersonInfo implements Serializable {
	private Integer pid;
	private String pname;
	private String padd;
	private LocalDate dob;
	private LocalDateTime doj;
	//private LocalTime dom;  in oracle time type is not suppoorted
	private LocalDate dom;
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
