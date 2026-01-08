package com.bl.stringbuffer;

public class PerformanceComparison {
	public static void main(String[] args) {
		int iterations = 1_000_000;

		StringBuffer stringBuffer = new StringBuffer();
		long startBuffer = System.nanoTime();

		for (int i = 0; i < iterations; i++) {
			stringBuffer.append("hello");
		}

		long endBuffer = System.nanoTime();
		long bufferTime = endBuffer - startBuffer;

		StringBuilder stringBuilder = new StringBuilder();
		long startBuilder = System.nanoTime();

		for (int i = 0; i < iterations; i++) {
			stringBuilder.append("hello");
		}

		long endBuilder = System.nanoTime();
		long builderTime = endBuilder - startBuilder;

		System.out.println("StringBuffer Time (ns): " + bufferTime);
		System.out.println("StringBuilder Time (ns): " + builderTime);
	}
}
