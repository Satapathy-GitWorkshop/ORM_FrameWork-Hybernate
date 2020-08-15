package com.nt.enitity;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import org.hibernate.annotations.Proxy;
import org.hibernate.annotations.Type;

@Entity
@Proxy(lazy = true,proxyClass = IProject.class)
@ Table( name = "project")
public final class Project implements IProject,Serializable {
private Integer projid;
private String   projname;
private Integer projcapacity;
private String  compname;

@Id
@Column(name = "projid",unique = true,nullable =false)
@Type(type ="int") 
public Integer getProjid() {
	return projid;
}
@Column(name = "projname", length = 25, unique = true)
@Type(type = "string")
public String getProjname() {
	return projname;
}
@Column(name = "projcapacity",length = 25,unique = true,nullable = true)
@Type(type = "int")
public Integer getProjcapacity() {
	return projcapacity;
}
@Column(name = "compname",length = 25,nullable = true,unique = true)
@Type( type = "string")
public String getCompname() {
	return compname;
}

public void setProjid(Integer projid) {
	this.projid = projid;
}
public void setProjname(String projname) {
	this.projname = projname;
}
public void setProjcapacity(Integer projcapacity) {
	this.projcapacity = projcapacity;
}
public void setCompname(String compname) {
	this.compname = compname;
}
@Override
public String toString() {
	return "Project [projid=" + projid + ", projname=" + projname + ", projcapacity=" + projcapacity + ", compname="
			+ compname + "]";
}



}
