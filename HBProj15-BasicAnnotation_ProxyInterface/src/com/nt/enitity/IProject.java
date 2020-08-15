package com.nt.enitity;

public interface IProject {
	//Setter method Declaration
	public void setProjid(Integer projid);
	public void setProjname(String projname);
	public void setProjcapacity(Integer projcapacity);
	public void setCompname(String compname);
	//Getter method Deaclaration
	public Integer getProjid();
	public String getProjname();
	public Integer getProjcapacity();
	public String getCompname();

}
