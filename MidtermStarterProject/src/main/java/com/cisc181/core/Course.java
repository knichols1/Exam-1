package com.cisc181.core;

import java.util.UUID;

public class Course {
	private UUID playerID;
	
	public UUID getPlayerID() {
		return playerID;
	}
	public void setPlayerID(UUID playerID) {
		this.playerID = playerID;
	}
	public String getCourseName() {
		return CourseName;
	}
	public void setCourseName(String courseName) {
		CourseName = courseName;
	}
	public int getGradePoints() {
		return GradePoints;
	}
	public void setGradePoints(int gradePoints) {
		GradePoints = gradePoints;
	}
	private String CourseName;
	private int GradePoints;

}
