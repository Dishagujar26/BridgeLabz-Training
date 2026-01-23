package com.bl.day9.musicapp;

public class MusicTree {

	MusicNode root; // root of the BST

	MusicNode insert(MusicNode node, int trackId, String trackName) {

		if (node == null)
			return new MusicNode(trackId, trackName); // base case

		int cmp = trackName.compareTo(node.trackName);

		if (cmp < 0) {
			node.left = insert(node.left, trackId, trackName); // alphabetically smaller
		} else if (cmp > 0) {
			node.right = insert(node.right, trackId, trackName); // alphabetically larger
		} else {
			System.out.println("Track already exists!");
		}

		return node;
	}

	MusicNode search(MusicNode node, int trackId) {
		if (node == null || node.trackId == trackId)
			return node; // found or not found

		if (trackId < node.trackId)
			return search(node.left, trackId); // go left
		else
			return search(node.right, trackId); // go right
	}

	void inorder(MusicNode node) {
		if (node != null) {
			inorder(node.left);
			System.out.println(node.trackId + " " + node.trackName);
			inorder(node.right);
		}
	}

}