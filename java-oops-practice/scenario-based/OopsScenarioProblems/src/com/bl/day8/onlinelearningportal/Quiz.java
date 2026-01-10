package com.bl.day8.onlinelearningportal;

public class Quiz {

	// internal question bank must remain private
	private final String[] questions;
	private final String[] answers;
	private final String difficulty;

	private int score;
	private int totalQuestions;

	// constructor with variable difficulty
	Quiz(String[] questions, String[] answers, String difficulty) {
		this.questions = questions;
		this.answers = answers; // set once
		this.difficulty = difficulty;
		this.totalQuestions = questions.length;
	}

	public String getDifficulty() {
		return difficulty;
	}

	public int getScore() {
		return score;
	}

	// use operators to calculate score
	void evaluateQuiz(String[] userAnswers) {
		 int weight;
	        if (difficulty.equalsIgnoreCase("easy")) {
	            weight = 1;
	        } else if (difficulty.equalsIgnoreCase("medium")) {
	            weight = 2;
	        } else {
	            weight = 3;
	        }

	        for (int i = 0; i < answers.length && i < userAnswers.length; i++) {
	            if (answers[i].equalsIgnoreCase(userAnswers[i])) {
	                score += weight;
	            }
	        }
	}

	// generate percentage using operators
	double calculatePercentage() {
		int maxScorePerQuestion =
                difficulty.equalsIgnoreCase("easy") ? 1 :
                difficulty.equalsIgnoreCase("medium") ? 2 : 3;

        int maxScore = questions.length * maxScorePerQuestion;
        return (score * 100.0) / maxScore;
	}
}
