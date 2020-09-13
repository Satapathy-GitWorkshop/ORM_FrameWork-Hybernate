package com.nt.entity;

public class ProjectInfo {
private Projid id;	
private String projectname;
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
