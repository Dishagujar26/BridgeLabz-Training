package com.bl.day2.undoredofunctionality;

public class Action {

	String type; // insert or delete 
	String text;
	int position;

	Action(String type, String text, int position) {
		this.type = type;
		this.text = text;
		this.position = position;
	}

}
