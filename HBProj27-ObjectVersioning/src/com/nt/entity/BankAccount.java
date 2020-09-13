package com.nt.entity;

public class BankAccount {
private Long accno;
private String holdername;
private String type;
private Float balance;
private Integer version_count; //any name u can take but type must be(int,short,byte,long)

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
