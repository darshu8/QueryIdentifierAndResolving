package pojo;

public class Faculty {
	int fid;
	String fname;
	String fpassword;
	String flab;
	String gender;
	String Phone_number;
	String email;

	public Faculty() {

	}
	
	public Faculty(int fid, String fname, String fpassword, String flab, String gender, String phone_number,
			String email) {
		super();
		this.fid = fid;
		this.fname = fname;
		this.fpassword = fpassword;
		this.flab = flab;
		this.gender = gender;
		Phone_number = phone_number;
		this.email = email;
	}

	public int getFid() {
		return fid;
	}

	public void setFid(int fid) {
		this.fid = fid;
	}

	public String getFname() {
		return fname;
	}

	public void setFname(String fname) {
		this.fname = fname;
	}

	public String getFpassword() {
		return fpassword;
	}

	public void setFpassword(String fpassword) {
		this.fpassword = fpassword;
	}

	public String getFlab() {
		return flab;
	}

	public void setFlab(String flab) {
		this.flab = flab;
	}

	public String getGender() {
		return gender;
	}

	public void setGender(String gender) {
		this.gender = gender;
	}

	public String getPhone_number() {
		return Phone_number;
	}

	public void setPhone_number(String phone_number) {
		Phone_number = phone_number;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

}
