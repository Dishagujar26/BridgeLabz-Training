package com.bl.reflection.advancedproblems.dependencyinjection;

public class Service {
	@Inject
	Helper helper;

	void run() {
		helper.help();
	}
}