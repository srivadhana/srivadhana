package com.model;

public class CollegeSDO_1 {
	private int noOfDept;
	private String place;
	private int Position;

	public CollegeSDO_1(int noOfDept1, String place1, int Position1) {
		noOfDept1 = 5;
		place1 = "chennai";
		Position1 = 7;
		this.noOfDept = noOfDept1;
		this.place = place1;
		this.Position=Position1;
		System.out.println("noOfDept=" + noOfDept + "\t" + "place=" + place + "\t" + "Position=" + Position);

	}

	public int getNoOfDept() {
		return noOfDept;
	}

	public void setNoOfDept(int noOfDept) {
		this.noOfDept = noOfDept;
	}

	public String getPlace() {
		return place;
	}

	public void setPlace(String place) {
		this.place = place;
	}

	public int getPosition() {
		return Position;
	}

	public void setPosition(int position) {
		Position = position;
	}

}
