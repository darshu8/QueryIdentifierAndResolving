package pojo;

public class Admin {
	int aid;
	String username;
	String password;

	public Admin() {
		// TODO Auto-generated constructor stub
	}

	public Admin(int aid, String username, String password) {
		super();
		this.aid = aid;
		this.username = username;
		this.password = password;
	}

	public int getAid() {
		return aid;
	}

	public void setAid(int aid) {
		this.aid = aid;
	}

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

}
