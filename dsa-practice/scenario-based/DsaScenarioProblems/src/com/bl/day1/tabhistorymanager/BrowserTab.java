package com.bl.day1.tabhistorymanager;

class BrowserTab {
	Page current;

	void visit(String url) {
		Page newPage = new Page(url);

		if (current != null) {
			current.next = newPage; 
			newPage.prev = current;
		}
		current = newPage;
	}

	void back() {
		if (current != null && current.prev != null)
			current = current.prev;
		else
			System.out.println("Sorry, no back history!");
	}

	void forward() {
		if (current != null && current.next != null)
			current = current.next;
		else
			System.out.println("Sorry, no forward history!");
	}

	String getCurrentPage() {
		return current != null ? current.url : "Empty Tab";
	}
}
