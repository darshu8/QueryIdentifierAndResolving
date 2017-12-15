package com.pojo;

public class Query {
	int qid;
	int sid;
	int fid;
	String qstatus;

	public Query() {
		// TODO Auto-generated constructor stub
	}
	
	public Query(int qid, int sid, int fid, String qstatus) {
		super();
		this.qid = qid;
		this.sid = sid;
		this.fid = fid;
		this.qstatus = qstatus;
	}

	public int getQid() {
		return qid;
	}

	public void setQid(int qid) {
		this.qid = qid;
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

	public String getQstatus() {
		return qstatus;
	}

	public void setQstatus(String qstatus) {
		this.qstatus = qstatus;
	}

}
