package com.bl.reflection.advancedproblems.methodexecutiontiming;

public class Worker {
	public void work() {
		for (int i = 0; i < 1_000_000; i++)
			;
	}
}