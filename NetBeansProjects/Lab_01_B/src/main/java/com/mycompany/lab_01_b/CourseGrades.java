//https://github.com/Alex2492595/Lab01_B

package com.mycompany.lab_01_b;

/**
 * 
 * @author Alexander Nikopoulos
 * Lab 01B
 * 29/08/2025
 */
public class CourseGrades implements Analyzable {
    private GradedActivity[] grades;
    private final int NUM_GRADES = 4;
    
    public CourseGrades() {
        grades = new GradedActivity[NUM_GRADES];
    }
    
    public void setLab(GradedActivity aLab) {
        grades[0] = aLab;
    }
    
    public void setPassFailExam(PassFailExam aPassFailExam) {
        grades[1] = aPassFailExam;
    }
    
    public void setEssay(Essay anEssay) {
        grades[2] = anEssay;
    }
    
    public void setFinalExam(FinalExam aFinalExam) {
        grades[3] = aFinalExam;
    }
    
    @Override
    public double getAverage() {
        double sum = 0;
        int count = 0;
        
        for (GradedActivity g : grades) {
            sum += g.getScore();
            count++;
        }
        
        return sum / count;
    }

    @Override
    public GradedActivity getHighest() {
        GradedActivity highest = null;
        
        for (GradedActivity g : grades) {
            if (highest == null || (g.getScore() > highest.getScore())) {
                highest = g;
            }
        }
        
        return highest;
    }

    @Override
    public GradedActivity getLowest() {
        GradedActivity lowest = null;
        
        for (GradedActivity g : grades) {
            if (lowest == null || (g.getScore() < lowest.getScore())) {
                lowest = g;
            }
        }
        
        return lowest;
    }

    @Override
    public String toString() {
        return "Lab Score: " + grades[0].getScore() + " Grade: " + grades[0].getGrade() + "\n" +
               "Pass/Fail Exam Score: " + grades[1].getScore() + " Grade: " + grades[1].getGrade() + "\n" +
               "Essay Score: " + grades[2].getScore() + " Grade: " + grades[2].getGrade() + "\n" +
               "Final Exam Score: " + grades[3].getScore() + " Grade: " + grades[3].getGrade();
    }
}
