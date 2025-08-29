//https://github.com/Alex2492595/Lab01.git

package com.mycompany.lab01;

/**
 *
 * @author Alexander Nikopoulos
 * Lab 01
 * 27/08/2025
 */
public class ZipCode {
    public int Zip;

    /**
     * Formats the zip code as 5 digits.
     * @param Zip the input integer code.
     */
    public ZipCode(int Zip) {
        if (Zip < 99999 && Zip > 0) {
            String.format("%05d", Zip);
            this.Zip = Zip;
        } else {
            System.out.print("Zip code is more than 5 digits.");
        }
    }

    /**
     * Checks and reports errors in the bar code.
     * @param barCode the input string code.
     */
    public ZipCode(String barCode) {
        if (barCode.length() != 27) {
            System.out.print("Bar code has incorrect length.");
        } else if (barCode.charAt(0) != '1') {
            System.out.print("Bar code missing 1 at beggining.");
        } else if (barCode.charAt(26) != '1') {
            System.out.print("Bar code missing 1 at end.");
        }
    }

    /**
     * Constructs the zip code into a string of binary digits.
     * @return the full bar code.
     */
    public String GetBarCode() {
        return "";
    }
    
    /**
     * Decodes the binary string into a zip code.
     * @return the zip code as an integer.
     */
    private int parseBarCode() {
        return Zip;
    }
}
