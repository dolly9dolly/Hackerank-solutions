import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    public static void main(String[] args) {
        int i = 4;
        double d = 4.0;
        String s = "HackerRank ";

        Scanner scan = new Scanner(System.in);

        /* Declare second integer, double, and String variables. */
        /* Read and save an integer, double, and String to your variables.*/
        // Note: If you have trouble reading the entire String, please go back and review the Tutorial closely.

        /* Print the sum of both integer variables on a new line. */

        /* Print the sum of the double variables on a new line. */

        /* Concatenate and print the String variables on a new line;
        	the 's' variable above should be printed first. */
        System.out.println("Enter integer");
        int a = scan.nextInt();
        scan.nextLine();
        System.out.println("Enter double");
        double b = scan.nextDouble();
        scan.nextLine();
        System.out.println("Enter string");
        String c = scan.nextLine();
        System.out.println(i+a);
        double sum = d+b;
        BigDecimal bd = new BigDecimal(sum).setScale(1 ,RoundingMode.HALF_UP);
        System.out.println(bd);
        System.out.println(s+c);

        scan.close();
    }
}