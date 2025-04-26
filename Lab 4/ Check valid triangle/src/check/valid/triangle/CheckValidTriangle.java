/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package check.valid.triangle;

/**
 *
 * @author youssef_alnahas
 */
public class CheckValidTriangle {

    /**
     * @param args the command line arguments
     */

    public static void main(String[] args) {
        double side1 = 4, side2 = 6, side3 = 3;
        if((side1 + side2 > side3) && 
           (side2 + side3 > side1) && 
           (side1 + side3 > side2)) {
            System.out.println("Valid Triangle");
        } else {
            System.out.println("Invalid Triangle");
        }
    }
}