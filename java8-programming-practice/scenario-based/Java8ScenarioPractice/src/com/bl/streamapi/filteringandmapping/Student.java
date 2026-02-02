package com.bl.streamapi.filteringandmapping;

public class Student {
	private String name;
	private int rank;
	private int age;
	private String branch;
	private String city;

	public Student(String name, int rank, int age, String branch, String city) {
		this.name = name;
		this.rank = rank;
		this.age = age;
		this.branch = branch;
		this.city = city;
	}

	public String getName() {
		return name;
	}

	public int getRank() {
		return rank;
	}

	public int getAge() {
		return age;
	}

	public String getBranch() {
		return branch;
	}

	public String getCity() {
		return city;
	}

	@Override
	public String toString() {
		return name + " | Rank:" + rank + " | Age:" + age + " | " + branch + " | " + city;
	}
}
