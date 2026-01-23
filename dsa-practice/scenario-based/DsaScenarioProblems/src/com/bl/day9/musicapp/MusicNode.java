package com.bl.day9.musicapp;

class MusicNode {
	int trackId;
	String trackName;
	MusicNode left, right;

	public MusicNode(int trackId, String trackName) {
		super();
		this.trackId = trackId;
		this.trackName = trackName;
		left = right = null; // initially no children

	}

}
