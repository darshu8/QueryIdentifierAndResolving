package pojo;

public class Feedback {
	int fbid;
	int sid;
	int fid;
	int fbRating;
	String fbDescription;
	
	public Feedback() {
		// TODO Auto-generated constructor stub
	}
	
	public Feedback(int fbid, int sid, int fid, int fbRating, String fbDescription) {
		super();
		this.fbid = fbid;
		this.sid = sid;
		this.fid = fid;
		this.fbRating = fbRating;
		this.fbDescription = fbDescription;
	}
	public int getFbid() {
		return fbid;
	}
	public void setFbid(int fbid) {
		this.fbid = fbid;
	}
	public int getSid() {
		return sid;
	}
	public void setSid(int sid) {
		this.sid = sid;
	}
	public int getFid() {
		return fid;
	}
	public void setFid(int fid) {
		this.fid = fid;
	}
	public int getFbRating() {
		return fbRating;
	}
	public void setFbRating(int fbRating) {
		this.fbRating = fbRating;
	}
	public String getFbDescription() {
		return fbDescription;
	}
	public void setFbDescription(String fbDescription) {
		this.fbDescription = fbDescription;
	}

}
