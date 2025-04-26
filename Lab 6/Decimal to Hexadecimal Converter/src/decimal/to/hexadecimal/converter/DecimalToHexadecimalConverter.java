/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package decimal.to.hexadecimal.converter;
import java.util.Scanner;

/**
 *
 * @author youssef_alnahas
 */
public class DecimalToHexadecimalConverter {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter decimal number: ");
        int decimal = input.nextInt();
        String hex = "";
        
        while(decimal != 0) {
            int remainder = decimal % 16;
            char hexDigit = (remainder <= 9) ? 
                (char)(remainder + '0') : 
                (char)(remainder - 10 + 'A');
            hex = hexDigit + hex;
            decimal /= 16;
        }
        
        System.out.println("Hexadecimal: " + hex);
    }
}
