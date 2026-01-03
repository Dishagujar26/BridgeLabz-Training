package com.bl.linkedlist.singlelinkedlist.socialmediafriendconnections;

public class SocialMediaMain {
	public static void main(String[] args) {
		SocialMedia sm = new SocialMedia();

		sm.addUser(1, "Amit", 22);
		sm.addUser(2, "Neha", 21);
		sm.addUser(3, "Rahul", 23);

		sm.addFriend(1, 2);
		sm.addFriend(1, 3);
		sm.addFriend(2, 3);

		sm.displayFriends(1);
		sm.mutualFriends(1, 2);

		sm.searchByName("Rahul");
		sm.countFriends();

		sm.removeFriend(1, 2);
		sm.displayFriends(1);
	}

}
