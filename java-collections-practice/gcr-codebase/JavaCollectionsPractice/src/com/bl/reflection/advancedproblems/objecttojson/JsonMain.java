package com.bl.reflection.advancedproblems.objecttojson;

public class JsonMain {
	public static void main(String[] args) throws Exception {

		Person p = new Person();
		p.name = "Disha";
		p.age = 23;

		System.out.println(JsonUtil.toJson(p));
	}
}