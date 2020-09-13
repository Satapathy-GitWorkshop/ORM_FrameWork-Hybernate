package com.nt.entity;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Embeddable;

import org.hibernate.annotations.Type;


@Embeddable
public class Projid implements Serializable {
	
	@Type(type="int")
	@Column(name ="PID")
private Integer pid;
	@Type(type="int")
	@Column(name ="PROJID")
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
