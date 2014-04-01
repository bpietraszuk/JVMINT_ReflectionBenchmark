package com.ug.domain;

import java.util.Date;

public class BenchmarkUnit {
	private String typeOfTestName;
	private String typeOfTest;
	private long duration;

	public String getTypeOfTestName() {
		return typeOfTestName;
	}

	public void setTypeOfTestName(String typeOfTestName) {
		this.typeOfTestName = typeOfTestName;
	}

	public String getTypeOfTest() {
		return typeOfTest;
	}

	public void setTypeOfTest(String typeOfTest) {
		this.typeOfTest = typeOfTest;
	}

	public long getDuration() {
		return duration;
	}

	public void setDuration(long duration) {
		this.duration = duration;
	}

	public Date getDate() {
		return new Date(duration);
	}

	@Override
	public String toString() {
		return "BenchmarkUnit [typeOfTest=" + typeOfTest + ", duration="
				+ duration + "]";
	}

}
