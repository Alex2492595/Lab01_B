//https://github.com/Alex2492595/Lab01B

package com.mycompany.lab01_b;

/**
 * 
 * @author Alexander Nikopoulos
 * Lab 01B
 * 29/08/2025
 */
public class CourseGrades {
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
    public String toString() {
        return "Lab Score: " + grades[0].getScore() + " Grade: " + grades[0].getGrade() + "\n" +
               "Pass/Fail Exam Score: " + grades[1].getScore() + " Grade: " + grades[1].getGrade() + "\n" +
               "Essay Score: " + grades[2].getScore() + " Grade: " + grades[2].getGrade() + "\n" +
               "Final Exam Score: " + grades[3].getScore() + " Grade: " + grades[3].getGrade();
    }
}
