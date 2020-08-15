package com.nt.entity;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.Transient;

import org.hibernate.annotations.Type;

@Entity
@Table(name = "PROJECT")
public class Project implements Serializable{
	private  Long projectid;
	private String projectname;
	private Integer projectcapacity;
	private String companyname;
	
	public void setProjectid(Long projectid) {
		this.projectid = projectid;
	}
	
	public void setProjectname(String projectname) {
		this.projectname = projectname;
	}
	
	public void setProjectcapacity(Integer projectcapacity) {
		this.projectcapacity = projectcapacity;
	}
	
	public void setCompanyname(String companyname) {
		this.companyname = companyname;
	}
	
//Working with annotation
	
	@Id
	@Column(name = "projectid", length=10 )
	public Long getProjectid() {
		return projectid;
	}
	
	@Column(name = "projectname",length = 12,unique = true,nullable = false)
	@Type(type = "string")
	@Transient
	public String getProjectname() {
		return projectname;
	}
	
	@Column(name = "projectcapacity",length = 10,unique = true,nullable =false)
	@Type(type = "int")
	public Integer getProjectcapacity() {
		return projectcapacity;
	}
	@Column(name = "companyname",length = 15,unique = false,nullable = false)
	@Type(type = "string")
	public String getCompanyname() {
		return companyname;
	}
 
}
