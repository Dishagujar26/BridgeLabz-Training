package com.bl.annotations.deprecated;

public class LegacyAPI {

	@Deprecated
	void oldFeature() {
		System.out.println("Old feature");
	}

	void newFeature() {
		System.out.println("New feature");
	}
}