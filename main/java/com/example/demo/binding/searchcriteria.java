package com.example.demo.binding;

public class searchcriteria {
	
	private String coursename;
	private String enqstatus;
	private String coursemode;
	public searchcriteria(String coursename, String enqstatus, String coursemode) {
		super();
		this.coursename = coursename;
		this.enqstatus = enqstatus;
		this.coursemode = coursemode;
	}
	public String getCoursename() {
		return coursename;
	}
	public void setCoursename(String coursename) {
		this.coursename = coursename;
	}
	public String getEnqstatus() {
		return enqstatus;
	}
	public void setEnqstatus(String enqstatus) {
		this.enqstatus = enqstatus;
	}
	public String getCoursemode() {
		return coursemode;
	}
	public void setCoursemode(String coursemode) {
		this.coursemode = coursemode;
	}
	@Override
	public String toString() {
		return "searchcriteria [coursename=" + coursename + ", enqstatus=" + enqstatus + ", coursemode=" + coursemode
				+ "]";
	}
	
	

}
