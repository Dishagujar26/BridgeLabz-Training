package com.bl.day8.highscorerankingsystem;

public class Player {
	public String playerName;
	public int playerScore;

	public Player(String playerName, int playerScore) {
		super();
		this.playerName = playerName;
		this.playerScore = playerScore;
	}

	@Override
	public String toString() {
		return "Player [playerName=" + playerName + ", playerScore=" + playerScore + "]";
	}

}
