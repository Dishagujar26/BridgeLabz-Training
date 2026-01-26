package com.bl.day2.bulkmarksprocessing;

public class Exam<T> {
	private T examType;

	public Exam(T examType) {
		this.examType = examType;
	}

	public T getExamType() {
		return examType;
	}
}
