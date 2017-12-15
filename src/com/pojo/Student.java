package com.pojo;

public class Student {
	int sid;
	String sname;
	String password;
	String gender;
	String lab;
	String phone_number;
	String email;

	public Student() {
		// TODO Auto-generated constructor stub
	}

	public Student(int sid, String sname, String password, String gender, String lab, String phone_number,
			String email) {
		super();
		this.sid = sid;
		this.sname = sname;
		this.password = password;
		this.gender = gender;
		this.lab = lab;
		this.phone_number = phone_number;
		this.email = email;
	}

	public int getSid() {
		return sid;
	}

	public void setSid(int sid) {
		this.sid = sid;
	}

	public String getSname() {
		return sname;
	}

	public void setSname(String sname) {
		this.sname = sname;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getGender() {
		return gender;
	}

	public void setGender(String gender) {
		this.gender = gender;
	}

	public String getLab() {
		return lab;
	}

	public void setLab(String lab) {
		this.lab = lab;
	}

	public String getPhone_number() {
		return phone_number;
	}

	public void setPhone_number(String phone_number) {
		this.phone_number = phone_number;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

}
