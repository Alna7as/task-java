/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package palindrome.checker;
 import java.util.Scanner;
/**
 *
 * @author youssef_alnahas
 */
public class PalindromeChecker {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
  Scanner input = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int num = input.nextInt();
        
        int original = num;
        int reverse = 0;
        
        while(num > 0) {
            int digit = num % 10;
            reverse = reverse * 10 + digit;
            num /= 10;
        }
        
        if(original == reverse) {
            System.out.println(original + " is palindrome.");
        } else {
            System.out.println(original + " is not palindrome.");
        }
    }
}
