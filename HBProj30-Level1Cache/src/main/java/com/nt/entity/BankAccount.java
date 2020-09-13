package com.nt.entity;

import java.io.Serializable;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.Date;

public class BankAccount  implements  Serializable{
	private Long accno;
	private String name;
	private Float balance;
	private String type;
	private LocalDateTime opn_date; // for hold creation date and time (it always remain same)
	private Date lastupdate;   //for timeStamp ( its vary time to time depend upaon u modified)
	public Long getAccno() {
		return accno;
	}
	public void setAccno(Long accno) {
		this.accno = accno;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public Float getBalance() {
		return balance;
	}
	public void setBalance(Float balance) {
		this.balance = balance;
	}
	public String getType() {
		return type;
	}
	public void setType(String type) {
		this.type = type;
	}
	public LocalDateTime getOpn_date() {
		return opn_date;
	}
	public void setOpn_date(LocalDateTime opn_date) {
		this.opn_date = opn_date;
	}
	public Date getLastupdate() {
		return lastupdate;
	}
	public void setLastupdate(Date lastupdate) {
		this.lastupdate = lastupdate;
	}
	@Override
	public String toString() {
		return "BankAccount [accno=" + accno + ", name=" + name + ", balance=" + balance + ", type=" + type
				+ ", opn_date=" + opn_date + ", lastupdate=" + lastupdate + "]";
	}
	
	

}
