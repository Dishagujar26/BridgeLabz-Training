package com.bl.day3.onlineexamreview;

import java.util.*;

public class ExamSystem {
	private Stack<Integer> navigation;
	private HashMap<Integer, String> answers;
	private HashMap<Integer, String> correct;

	public ExamSystem() {
		navigation = new Stack<>();
		answers = new HashMap<>();
		correct = new HashMap<>();

		correct.put(1, "A");
		correct.put(2, "B");
		correct.put(3, "C");
	}

	public void visitQuestion(int q) {
		navigation.push(q);
		System.out.println("Visited Question " + q);
	}

	public void answerQuestion(int q, String ans) {
		answers.put(q, ans);
	}

	public void submit() {
		int score = 0;
		for (int q : correct.keySet()) {
			if (correct.get(q).equals(answers.get(q))) {
				score++;
			}
		}
		System.out.println("Final Score: " + score + "/" + correct.size());
	}
}
