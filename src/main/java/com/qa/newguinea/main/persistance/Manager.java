package com.qa.newguinea.main.persistance;

public class Manager {
	private int managerid;
	private String managername;
	public Manager(int managerid, String managername) {
		super();
		this.managerid = managerid;
		this.managername = managername;
	}
	public int getManagerid() {
		return managerid;
	}
	public void setManagerid(int managerid) {
		this.managerid = managerid;
	}
	public String getManagername() {
		return managername;
	}
	public void setManagername(String managername) {
		this.managername = managername;
	}
	
}
