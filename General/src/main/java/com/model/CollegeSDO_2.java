package com.model;

public class CollegeSDO_2 extends CollegeSDO_1 {
	public CollegeSDO_2(int noOfDept1, String place1, int Position1) {
		super(noOfDept1, place1, Position1);	
	}

	private String totalStuds;
	private String faculties;
	private String noOfTransport;

	public String getTotalStuds() {
		return totalStuds;
	}

	public void setTotalStuds(String totalStuds) {
		this.totalStuds = totalStuds;
	}

	public String getFaculties() {
		return faculties;
	}

	public void setFaculties(String faculties) {
		this.faculties = faculties;
	}

	public String getNoOfTransport() {
		return noOfTransport;
	}

	public void setNoOfTransport(String noOfTransport) {
		this.noOfTransport = noOfTransport;
	}

}
