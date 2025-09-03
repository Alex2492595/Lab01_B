//https://github.com/Alex2492595/Lab01B

package com.mycompany.lab01_b;

/**
 * 
 * @author Alexander Nikopoulos
 * Lab 01B
 * 29/08/2025
 */
public class FinalExam extends GradedActivity {
    private int numQuestions;
    private double pointsEach;
    private int numMissed;
    
    public FinalExam(int questions, int missed) {
        this.numQuestions = questions;
        this.numMissed = missed;
        this.pointsEach = 100.0 / questions;
        
        double numericScore = 100.0 - (missed * pointsEach);
        setScore(numericScore);
    }
    
    public double getPointsEach() {
        return pointsEach;
    }
    
    public int getNumMissed() {
        return numMissed;
    }

    @Override
    public String toString() {
        return "Each question counts " + pointsEach + " points.\n" +
               "The exam score is " + numMissed + "\n" +
               "The exam grade is " + getGrade();
    }
}
