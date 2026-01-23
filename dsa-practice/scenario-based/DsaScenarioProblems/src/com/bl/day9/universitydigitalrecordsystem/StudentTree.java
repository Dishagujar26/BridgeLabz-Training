package com.bl.day9.universitydigitalrecordsystem;

public class StudentTree {

	StudentNode root; // root of the BST

	StudentNode insert(StudentNode node, int roll, String name) {
		if (node == null)
			return new StudentNode(roll, name); // base case

		if (roll < node.rollNumber)
			node.left = insert(node.left, roll, name); // go left
		else if (roll > node.rollNumber)
			node.right = insert(node.right, roll, name); // go right
		else
			System.out.println("Roll number already exists");

		return node;
	}

	StudentNode search(StudentNode node, int roll) {
		if (node == null || node.rollNumber == roll)
			return node; // found or not found

		if (roll < node.rollNumber)
			return search(node.left, roll); // go left
		else
			return search(node.right, roll); // go right
	}

	void inorder(StudentNode node) {
		if (node != null) {
			inorder(node.left);
			System.out.println(node.rollNumber + " " + node.name);
			inorder(node.right);
		}
	}

	StudentNode delete(StudentNode node, int roll) {
		if (node == null)
			return null;

		if (roll < node.rollNumber)
			node.left = delete(node.left, roll);
		else if (roll > node.rollNumber)
			node.right = delete(node.right, roll);
		else { // found the node
			if (node.left == null)
				return node.right; // 0 or 1 child
			else if (node.right == null)
				return node.left;
			// 2 children
			StudentNode successor = minValueNode(node.right);
			node.rollNumber = successor.rollNumber;
			node.name = successor.name;
			node.right = delete(node.right, successor.rollNumber);
		}
		return node;
	}
	

	StudentNode minValueNode(StudentNode node) {
		while (node.left != null)
			node = node.left;
		return node;
	}

}