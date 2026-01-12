package com.bl.day1.tabhistorymanager;

import java.util.*;

class BrowserBuddy {

	Stack<BrowserTab> closedTabs = new Stack<>();  
	BrowserTab currentTab = new BrowserTab();

	void open(String url) {
		currentTab.visit(url);
	}

	void closeTab() {
		closedTabs.push(currentTab); // this stack is storing the browserTab objects
		currentTab = new BrowserTab(); // make reference point to new object 
		System.out.println("Tab closed!");
	}

	void restoreTab(){
		if (!closedTabs.isEmpty()) {
			currentTab = closedTabs.pop(); // assigning reference 
			System.out.println("Tab restored!");
		} else {
			System.out.println("No closed tabs to restore!");
		}
	}

	void back() {
		currentTab.back();
	}

	void forward() {
		currentTab.forward();
	}

	void show() {
		System.out.println("Current Page: " + currentTab.getCurrentPage());
	}
}
