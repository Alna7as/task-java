/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bmi.calculator;
  import java.util.Scanner;
/**
 *
 * @author youssef_alnahas
 */
public class BMICalculator {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter weight in kg: ");
        double weight = input.nextDouble();
        System.out.print("Enter height in meters: ");
        double height = input.nextDouble();
        
        double bmi = weight / (height * height);
        
        if(bmi < 18.5) {
            System.out.println("Underweight");
        } else if(bmi < 25) {
            System.out.println("Normal");
        } else if(bmi < 30) {
            System.out.println("Overweight");
        } else {
            System.out.println("Obese");
        }
    }
}
   