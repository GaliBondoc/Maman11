/**
 * This program calculates the area and the perimeter of a given triangle
 * based on user input.
 * The program uses flow control to determine whether the given side lengths
 * correspond to a triangle.
 *
 * @author Galina Bondoc
 * @version 04.02.2026
 */

import java.util.Scanner;

public class Triangle {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("This program calculates the area "
                + "and the perimeter of a given triangle. ");
        System.out.println("Please enter the three lengths"
                + " of the triangle's sides");
        int a = scan.nextInt();
        int b = scan.nextInt();
        int c = scan.nextInt();

        // Printing the input
        System.out.println("The lengths of the triangle sides are: "
                + a + ", " + b + ", " + c);

        /** Calculating the area and perimeter
         @ trianglePerimeter - adds the three lengths
         @ triangleArea - uses Heron's formula for calculating the area of a triangle
         @ s - the semiperimeter for Heron's formula
         */

       // int trianglePerimeter = a + b + c;
        double trianglePerimeter = a + b + c;
       // final int s = trianglePerimeter / 2;
        final double s = trianglePerimeter / 2;
        final double triangleArea = Math.sqrt(s*(s-a)*(s-b)*(s-c));

        // Checking for legal input and printing required output
        if (a > 0 && b > 0 && c > 0 && a + b > c && a + c > b && b + c >a) {
            System.out.println("The perimeter of the triangle is: " + trianglePerimeter);
            System.out.println("The area of the triangle is: " + triangleArea);
        }
        else
            System.out.println("The given three sides don't represent a triangle");

    } // end of method main
 //end of class Triangle

/**
 * This is a test to see if it updates in github
 */
System.out.println("Hi");}
