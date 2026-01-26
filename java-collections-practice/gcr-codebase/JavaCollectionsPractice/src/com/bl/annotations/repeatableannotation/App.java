package com.bl.annotations.repeatableannotation;

public class App {
	@BugReport(description = "Null issue")
	@BugReport(description = "Performance issue")
	void run() {
	}
}
