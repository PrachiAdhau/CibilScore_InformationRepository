package com.app.model;

import java.util.Date;

public class Cibil {
	private String cibilId;
	private int cibilScore;
	private String status;
	private Date cibilScoreDateandTime;

	private String remark;
	
	public String getCibilId() {
		return cibilId;
	}
	public void setCibilId(String cibilId) {
		this.cibilId = cibilId;
	}
	public int getCibilScore() {
		return cibilScore;
	}
	public void setCibilScore(int dd) {
		this.cibilScore = dd;
	}
	public String getStatus() {
		return status;
	}
	public void setStatus(String status) {
		this.status = status;
	}
	
	public Date getCibilScoreDateandTime() {
		return cibilScoreDateandTime;
	}
	public void setCibilScoreDateandTime(Date cibilScoreDateandTime) {
		this.cibilScoreDateandTime = cibilScoreDateandTime;
	}

	
	public String getRemark() {
		return remark;
	}
	public void setRemark(String remark) {
		this.remark = remark;
	}
	

}
