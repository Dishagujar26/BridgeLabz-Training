package com.bl.annotations.importantmethod;

public class Service {
	@ImportantMethod
	void save() {
	}

	@ImportantMethod(level = "LOW")
	void log() {
	}
}
