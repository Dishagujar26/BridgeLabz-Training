package com.bl.linkedlist.singlelinkedlist.socialmediafriendconnections;

public class SocialMedia {

	private UserNode head;

	// Add new user
	public void addUser(int id, String name, int age) {
		UserNode user = new UserNode(id, name, age);
		user.next = head;
		head = user;
	}

	// Find user by ID
	private UserNode findUser(int id) {
		UserNode temp = head;
		while (temp != null) {
			if (temp.userId == id)
				return temp;
			temp = temp.next;
		}
		return null;
	}

	// Add friend connection (bidirectional)
	public void addFriend(int id1, int id2) {
		UserNode u1 = findUser(id1);
		UserNode u2 = findUser(id2);

		if (u1 == null || u2 == null) {
			System.out.println("User not found");
			return;
		}

		u1.friends = addFriendNode(u1.friends, id2);
		u2.friends = addFriendNode(u2.friends, id1);
	}

	private FriendNode addFriendNode(FriendNode head, int id) {
		FriendNode node = new FriendNode(id);
		node.next = head;
		return node;
	}

	// Remove friend connection
	public void removeFriend(int id1, int id2) {
		UserNode u1 = findUser(id1);
		UserNode u2 = findUser(id2);

		if (u1 == null || u2 == null)
			return;

		u1.friends = removeFriendNode(u1.friends, id2);
		u2.friends = removeFriendNode(u2.friends, id1);
	}

	private FriendNode removeFriendNode(FriendNode head, int id) {
		if (head == null)
			return null;
		if (head.friendId == id)
			return head.next;

		FriendNode temp = head;
		while (temp.next != null && temp.next.friendId != id)
			temp = temp.next;

		if (temp.next != null)
			temp.next = temp.next.next;

		return head;
	}

	// Display friends of a user
	public void displayFriends(int userId) {
		UserNode user = findUser(userId);
		if (user == null)
			return;

		FriendNode temp = user.friends;
		System.out.print("Friends of " + user.name + ": ");
		while (temp != null) {
			System.out.print(temp.friendId + " ");
			temp = temp.next;
		}
		System.out.println();
	}

	// Mutual friends
	public void mutualFriends(int id1, int id2) {
		UserNode u1 = findUser(id1);
		UserNode u2 = findUser(id2);

		if (u1 == null || u2 == null)
			return;

		System.out.print("Mutual Friends: ");
		FriendNode f1 = u1.friends;

		while (f1 != null) {
			if (exists(u2.friends, f1.friendId))
				System.out.print(f1.friendId + " ");
			f1 = f1.next;
		}
		System.out.println();
	}

	private boolean exists(FriendNode head, int id) {
		while (head != null) {
			if (head.friendId == id)
				return true;
			head = head.next;
		}
		return false;
	}

	// Search user by ID
	public void searchById(int id) {
		UserNode user = findUser(id);
		if (user != null)
			System.out.println(user.userId + " | " + user.name + " | Age: " + user.age);
		else
			System.out.println("User not found");
	}

	// Search user by Name
	public void searchByName(String name) {
		UserNode temp = head;
		while (temp != null) {
			if (temp.name.equalsIgnoreCase(name)) {
				System.out.println(temp.userId + " | " + temp.name + " | Age: " + temp.age);
				return;
			}
			temp = temp.next;
		}
		System.out.println("User not found");
	}

	// Count friends for each user
	public void countFriends() {
		UserNode temp = head;
		while (temp != null) {
			int count = 0;
			FriendNode f = temp.friends;
			while (f != null) {
				count++;
				f = f.next;
			}
			System.out.println(temp.name + " has " + count + " friends");
			temp = temp.next;
		}
	}

}
