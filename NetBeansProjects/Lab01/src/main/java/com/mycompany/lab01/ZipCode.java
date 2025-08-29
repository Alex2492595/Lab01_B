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
        }
        
        if (barCode.charAt(0) != '1' || barCode.charAt(26) != '1') {
            System.out.print("Bar code missing 1 at start/end.");
        }
        
        for (char c : barCode.toCharArray()) {
            if (c != '0' && c != '1') {
                System.out.print("Bar code contains bad digit.");
            }
        }
    }

    /**
     * Constructs the zip code into a string of binary digits.
     * @return the full bar code.
     */
    public String GetBarCode() {
        String barCode = "1";
        String zipCode = String.format("%05d", Zip);
        
        for (int i = 0; i < 5; i++) {
            switch (zipCode.charAt(i)) {
                case 0 -> barCode += "11000";
                case 1 -> barCode += "00011";
                case 2 -> barCode += "00101";
                case 3 -> barCode += "00110";
                case 4 -> barCode += "01001";
                case 5 -> barCode += "01010";
                case 6 -> barCode += "01100";
                case 7 -> barCode += "10001";
                case 8 -> barCode += "10010";
                case 9 -> barCode += "10100";
            }
        }
        
        barCode += "1";
        return barCode;
    }
    
    /**
     * Decodes the binary string into a zip code.
     * @return the zip code as an integer.
     */
    private int parseBarCode() {
        return Zip;
    }
}
