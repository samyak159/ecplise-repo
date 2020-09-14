package com.model;
public class Register
{
	private int regno;
	private String fname;
	private String uname;
	private String pass;
	private float bal;
	public Register(int regno, String fname, String uname, String pass, float bal) {
		super();
		this.regno = regno;
		this.fname = fname;
		this.uname = uname;
		this.pass = pass;
		this.bal = bal;
	}
	public int getRegno() {
		return regno;
	}
	public void setRegno(int regno) {
		this.regno = regno;
	}
	public String getFname() {
		return fname;
	}
	public void setFname(String fname) {
		this.fname = fname;
	}
	public String getUname() {
		return uname;
	}
	public void setUname(String uname) {
		this.uname = uname;
	}
	public String getPass() {
		return pass;
	}
	public void setPass(String pass) {
		this.pass = pass;
	}
	public float getBal() {
		return bal;
	}
	public void setBal(float bal) {
		this.bal = bal;
	}	
}