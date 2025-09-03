//https://github.com/Alex2492595/Lab01_B

package com.mycompany.lab_01_b;

/**
 * 
 * @author Alexander Nikopoulos
 * Lab 01B
 * 29/08/2025
 */
public interface Analyzable {
    /**
     * Calculates the average of the numeric scores stored in the grades array
     * @return the average
     */
    double getAverage();
    
    /**
     * References the element in the grades array with the highest numeric score
     * @return the element with the highest score
     */
    GradedActivity getHighest();
    
    /**
     * References the element in the grades array with the lowest numeric score
     * @return the element with the lowest score
     */
    GradedActivity getLowest();
}
