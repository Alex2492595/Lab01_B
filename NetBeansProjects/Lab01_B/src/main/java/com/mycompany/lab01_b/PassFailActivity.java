//https://github.com/Alex2492595/Lab01B

package com.mycompany.lab01_b;

/**
 * 
 * @author Alexander Nikopoulos
 * Lab 01B
 * 29/08/2025
 */
public class PassFailActivity extends GradedActivity {
    private double minPassingScore;
    
    public PassFailActivity(double mps) {
        this.minPassingScore = mps;
    }
    
    /**
     * Calculates if score is a pass or fail.
     * @return the letter grade.
     */
    @Override
    public char getGrade() {
        char letterGrade;
        
        if (getScore() >= minPassingScore) {
            letterGrade = 'P';
        } else {
            letterGrade = 'F';
        }
        
        return letterGrade;
    }
}
