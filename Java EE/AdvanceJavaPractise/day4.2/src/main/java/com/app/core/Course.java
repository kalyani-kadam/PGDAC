package com.app.core;

public enum Course {
	JAVA(79), REACT(80), MERN(88), DBT(70);

	private int minScore;

	private Course(int minScore) {
		this.minScore = minScore;
	}

	public int getMinScore() {
		return minScore;
	}
	
	
}
