package com.bl.day1.tabhistorymanager;

class Page {
	String url;
	Page prev, next;

	Page(String url) {
		this.url = url;
	}
}
