package com.bl.optionalclass.scenario1;

import java.util.Optional;

public class Student{
	String name;
	String nickname;
	String email;
	String phone;
	String address;

	Student(String name, String nickname, String email, String phone, String address) {
		this.name = name;
		this.nickname = nickname;
		this.email = email;
		this.phone = phone;
		this.address = address;
	}

	Optional<String> getEmail() {
		return Optional.ofNullable(email);
	}

	Optional<String> getPhone() {
		return Optional.ofNullable(phone);
	}

	Optional<String> getAddress() {
		return Optional.ofNullable(address);
	}

	Optional<String> getNickname() {
		return Optional.ofNullable(nickname);
	}
}