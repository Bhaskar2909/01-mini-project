package com.example.demo.entity;

import java.time.LocalDate;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table
public class Studentenq {
	
	
	private Integer cid;
	@Id
    @GeneratedValue(strategy = GenerationType.IDENTITY) 
	private Integer enqId;
	private String name;
	private long phno;
	private String classmode;
	private String coursename;
	private String enqstattus;
	private LocalDate createdate;

	
	public Studentenq() {
		super();
	
		this.name = name;
		this.phno = phno;
		this.classmode = classmode;
		this.coursename = coursename;
		this.enqstattus = enqstattus;
		this.createdate = createdate;
		this.cid = cid;
	}
	public Integer getEnqId() {
		return enqId;
	}
	public void setEnqId(Integer enqId) {
		this.enqId = enqId;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public long getPhno() {
		return phno;
	}
	public void setPhno(long phno) {
		this.phno = phno;
	}
	public String getClassmode() {
		return classmode;
	}
	public void setClassmode(String classmode) {
		this.classmode = classmode;
	}
	public String getCoursename() {
		return coursename;
	}
	public void setCoursename(String coursename) {
		this.coursename = coursename;
	}
	public String getEnqstattus() {
		return enqstattus;
	}
	public void setEnqstattus(String enqstattus) {
		this.enqstattus = enqstattus;
	}
	public LocalDate getCreatedate() {
		return createdate;
	}
	public void setCreatedate(LocalDate createdate) {
		this.createdate = createdate;
	}
	public Integer getCid() {
		return cid;
	}
	public void setCid(Integer cid) {
		this.cid = cid;
	}
	@Override
	public String toString() {
		return "stusenetenq [enqId=" + enqId + ", name=" + name + ", phno=" + phno + ", classmode=" + classmode
				+ ", coursename=" + coursename + ", enqstattus=" + enqstattus + ", createdate=" + createdate + ", cid="
				+ cid + "]";
	}
	
	
	

}
