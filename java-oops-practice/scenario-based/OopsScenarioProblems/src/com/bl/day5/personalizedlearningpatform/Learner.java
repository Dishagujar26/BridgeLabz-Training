package com.bl.day5.personalizedlearningpatform;

public class Learner extends User implements ICertifiable {

    private double quizPercentage;

    public Learner(String name, String email, int userId) {
        super(name, email, userId);
    }

    public void setQuizPercentage(double quizPercentage) {
        this.quizPercentage = quizPercentage;
    }
    public double getQuizPercentage() {
    	return quizPercentage;
    }

    @Override
    public void generateCertificate(String courseType) {

        if (courseType.equalsIgnoreCase("short")) {
            System.out.println("Short Course Certificate generated for " + getName());
        } 
        else if (courseType.equalsIgnoreCase("full-time")) {
            System.out.println("Full-Time Certificate generated for " + getName());
            System.out.println("Final Score: " + quizPercentage + "%");
        }
    }
}
