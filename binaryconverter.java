package binaryconverter;

//Zaiah Nance

import java.util.Scanner;

public class binaryconverter {
 
 // Converts binary to decimal using method getDecimal
 public static int getDecimal(String binary) {
     int decimal = 0;
     int length = binary.length();
     
     // Loops through each character
     for (int i = 0; i < length; i++) {
         char bit = binary.charAt(length - 1 - i);
         if (bit == '1') {
             decimal += Math.pow(2, i);
         }
     }
     
     return decimal;
 }

 public static void main(String[] args) {
     // Using a different variable name for the Scanner instance
     Scanner input = new Scanner(System.in);
     
     // Takes binary numbers as input
     System.out.println("Enter a 4-bit binary number:");
     String str1 = input.nextLine();
     System.out.println("Enter another 4-bit binary number:");
     String str2 = input.nextLine();
     
     // Validate that inputs are 4-bit binary numbers
     if (!str1.matches("[01]{4}") || !str2.matches("[01]{4}")) {
         System.out.println("Please enter valid 4-bit binary numbers.");
         input.close();
         return;
     }

     int dec1 = getDecimal(str1);
     int dec2 = getDecimal(str2);
     
     // Printing out the decimal digits and their sum
     System.out.println("The first number is " + dec1);
     System.out.println("The second number is " + dec2);
     System.out.println("Added together is " + (dec1 + dec2));
     
     input.close();
 }
}