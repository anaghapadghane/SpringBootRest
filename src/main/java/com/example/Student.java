package com.example;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.IdClass;
import javax.persistence.Table;

@Entity
public class Student {
	
	@Id
	private int sid;
	private String sname;
	private String semail;
	private int smarks;

	
	
	public Student() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Student(String sname, String semail, int smarks) {
		super();
		this.sname = sname;
		this.semail = semail;
		this.smarks = smarks;
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

	public String getSemail() {
		return semail;
	}

	public void setSemail(String semail) {
		this.semail = semail;
	}

	public int getSmarks() {
		return smarks;
	}

	public void setSmarks(int smarks) {
		this.smarks = smarks;
	}

	@Override
	public String toString() {
		return "Student [sid=" + sid + ", sname=" + sname + ", semail="
				+ semail + ", smarks=" + smarks + "]";
	}
	
}
