package com.nt.entity;

import java.io.Serializable;

public class Projid implements Serializable {
private Integer pid;
private Integer projid;
//pair of Setter and Getter
public Integer getPid() {
	return pid;
}
public void setPid(Integer pid) {
	this.pid = pid;
}
public Integer getProjid() {
	return projid;
}
public void setProjid(Integer projid) {
	this.projid = projid;
}
@Override
public String toString() {
	return "Projid [pid=" + pid + ", projid=" + projid + "]";
}

}
