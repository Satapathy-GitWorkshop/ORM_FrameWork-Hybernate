package com.nt.entity;

import java.io.Serializable;

public class Mobile implements Serializable{
private Long no;
private String brand;
private String owner;
public Long getNo() {
	return no;
}
public void setNo(Long no) {
	this.no = no;
}
public String getBrand() {
	return brand;
}
public void setBrand(String brand) {
	this.brand = brand;
}
public String getOwner() {
	return owner;
}
public void setOwner(String owner) {
	this.owner = owner;
}

}
