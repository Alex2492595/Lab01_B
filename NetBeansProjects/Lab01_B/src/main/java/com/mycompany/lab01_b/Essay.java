//https://github.com/Alex2492595/Lab01B

package com.mycompany.lab01_b;

/**
 * 
 * @author Alexander Nikopoulos
 * Lab 01B
 * 29/08/2025
 */
public class Essay extends GradedActivity {
    private double grammar;
    private double spelling;
    private double correctLength;
    private double content;
    
    public void setScore(double gr, double sp, double len, double cnt) {
        this.grammar = gr;
        this.spelling = sp;
        this.correctLength = len;
        this.content = cnt;
        
        super.setScore(gr + sp + len + cnt);
    }

    public double getGrammar() {
        return grammar;
    }

    public void setGrammar(double grammar) {
        this.grammar = grammar;
    }

    public double getSpelling() {
        return spelling;
    }

    public void setSpelling(double spelling) {
        this.spelling = spelling;
    }

    public double getCorrectLength() {
        return correctLength;
    }

    public void setCorrectLength(double correctLength) {
        this.correctLength = correctLength;
    }

    public double getContent() {
        return content;
    }

    public void setContent(double content) {
        this.content = content;
    }

    @Override
    public String toString() {
        return "Total points: " + getScore() + "\n" +
               "Grade: " + getGrade();
    }
}
