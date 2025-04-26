/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package armstrong.number.checker;

/**
 *
 * @author youssef_alnahas
 */
public class ArmstrongNumberChecker {

    public static void main(String[] args) {
        int number = 371;
        int original = number;
        int result = 0;
        
        while(original != 0) {
            int digit = original % 10;
            result += Math.pow(digit, 3);
            original /= 10;
        }
        
        if(result == number) {
            System.out.println(number + " is Armstrong.");
        } else {
            System.out.println(number + " is not Armstrong.");
        }
    }
}