package com.nt.entity;

import java.io.Serializable;

public class PatientDeatils implements Serializable {
private int ptno;
private String ptname;
private String ptadds;
public int getPtno() {
	return ptno;
}
public void setPtno(int ptno) {
	this.ptno = ptno;
}
public String getPtname() {
	return ptname;
}
public void setPtname(String ptname) {
	this.ptname = ptname;
}
public String getPtadds() {
	return ptadds;
}
public void setPtadds(String ptadds) {
	this.ptadds = ptadds;
}
}
