package com.bl.collections;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.TreeMap;

import com.bl.collections.VotingSystem;

public class VotingSystem {


	HashMap<String, Integer> votes = new HashMap<>();
	LinkedHashMap<String, Integer> voteOrder = new LinkedHashMap<>();

	public void castVote(String candidate) {
		votes.put(candidate, votes.getOrDefault(candidate, 0) + 1);
		voteOrder.putIfAbsent(candidate, votes.get(candidate)); // preserve first order
	}

	public void displaySortedVotes() {
		TreeMap<String, Integer> sortedVotes = new TreeMap<>(votes);
		System.out.println("Votes (sorted by candidate): " + sortedVotes);
	}

	// Display votes in order cast
	public void displayVotesByOrder() {
		System.out.println("Votes (by order cast): " + voteOrder);
	}
	
	public static void main(String[] args) {
		VotingSystem voting = new VotingSystem();
		voting.castVote("Alice");
		voting.castVote("Bob");
		voting.castVote("Alice");

		voting.displayVotesByOrder();    // LinkedHashMap order
		voting.displaySortedVotes(); 
	}
}

