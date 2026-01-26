package com.bl.annotations.deprecated;

public class Test {
	public static void main(String[] args) {
		LegacyAPI api = new LegacyAPI();
		api.oldFeature(); // warning
		api.newFeature();
	}
}