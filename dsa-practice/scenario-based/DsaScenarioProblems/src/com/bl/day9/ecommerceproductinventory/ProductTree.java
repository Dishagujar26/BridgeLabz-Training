package com.bl.day9.ecommerceproductinventory;
/*
 /*
 Story: E-Commerce Product Inventory
An online store categorizes products by SKU numbers.
Scenarios:
● 🔹 Scenario 1: Lookup — Customers search for a product using SKU.
● 🔹 Scenario 2: Price Update — Admin updates products using SKU key.
● 🔹 Scenario 3: Sorted List — Display all products in sorted SKU order.
 */

public class ProductTree {

	MusicNode root; // root of the BST

	MusicNode insert(MusicNode node, int SKU, String productName, double productPrice) {
		if (node == null)
			return new MusicNode(SKU, productName, productPrice); // base case

		if (SKU < node.SKU)
			node.left = insert(node.left,SKU, productName, productPrice); // go left
		else if (SKU > node.SKU)
			node.right = insert(node.right,SKU, productName, productPrice); // go right
		else
			System.out.println("Product already exist!");

		return node;
	}

	MusicNode search(MusicNode node, int SKU) {
		if (node == null || node.SKU == SKU)
			return node; // found or not found

		if (SKU < node.SKU)
			return search(node.left, SKU); // go left
		else
			return search(node.right, SKU); // go right
	}

	MusicNode update(MusicNode node, int SKU, double poductPrice) {
		
		if (node == null || node.SKU == SKU) {
		       node.productPrice = poductPrice;
		       return node;
		}
		else {
			return null;
		}
	   	
	}
	MusicNode delete(MusicNode node, int SKU) {
		if (node == null)
			return null;

		if (SKU < node.SKU)
			node.left = delete(node.left, SKU);
		else if (SKU > node.SKU)
			node.right = delete(node.right, SKU);
		else { // found the node
			if (node.left == null)
				return node.right; // 0 or 1 child
			else if (node.right == null)
				return node.left;
			// 2 children
			MusicNode successor = minValueNode(node.right);
			node.SKU = successor.SKU;
			node.productName = successor.productName;
			node.productPrice = successor.productPrice;
			node.right = delete(node.right, successor.SKU);
		}
		return node;
	}
	MusicNode minValueNode(MusicNode node) {
		while (node.left != null)
			node = node.left;
		return node;
	}
	void inorder(MusicNode node) {
		if (node != null) {
			inorder(node.left);
			System.out.println(node.SKU + " " + node.productName+ " "+ node.productPrice);
			inorder(node.right);
		}
	}


}