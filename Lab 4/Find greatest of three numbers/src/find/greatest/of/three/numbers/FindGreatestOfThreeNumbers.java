/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package find.greatest.of.three.numbers;

/**
 *
 * @author youssef_alnahas
 */
public class FindGreatestOfThreeNumbers {

    public static void main(String[] args) {
      
        double n1 = -4.5, n2 = 3.9, n3 = 5.5;
        if(n1 >= n2 && n1 >= n3)
            System.out.println(n1 + " is largest.");
        else if(n2 >= n1 && n2 >= n3)
            System.out.println(n2 + " is largest.");
        else
            System.out.println(n3 + " is largest.");
    }
}
   
