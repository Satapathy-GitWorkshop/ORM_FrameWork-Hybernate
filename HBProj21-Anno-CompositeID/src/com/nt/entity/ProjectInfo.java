package com.nt.entity;

import javax.persistence.Column;
import javax.persistence.Embedded;
import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.Table;

import org.hibernate.annotations.Type;
@Entity
@Table(name = "PROJECT_INFO")
public class ProjectInfo {
	
	@EmbeddedId
private Projid id;	
	
	@Column(name = "PROJNAME", length=15)
	 @Type(type = "string")
private String projectname;
	
	@Column(name = "DEPTNO")
	@Type(type = "int")
private Integer deptno;

//Pair of Setter and Getter
public Projid getId() {
	return id;
}
public void setId(Projid id) {
	this.id = id;
}
public String getProjectname() {
	return projectname;
}
public void setProjectname(String projactname) {
	this.projectname = projactname;
}
public Integer getDeptno() {
	return deptno;
}
public void setDeptno(Integer deptno) {
	this.deptno = deptno;
}
@Override
public String toString() {
	return "ProjectInfo [id=" + id + ", projactname=" + projectname + ", deptno=" + deptno + "]";
}


}
