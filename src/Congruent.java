/**
 * This program calculates the side lengths of two triangles, and the triangles'
 * congruence based on user input.
 * The program uses flow control to execute the congruence test based on
 * the Side-Side-Side (SSS) congruence theorem.
 *
 * @author Galina Bondoc
 * @version 04.02.2026
 */

import java.util.Scanner;

public class Congruent {
    public static void main(String[] args) {
        final int POWER = 2;
        final double TOLERANCE = 0.001;
        Scanner scan = new Scanner(System.in);
        System.out.println("This program calculates the side lengths of two given triangles, "
                + "and whether they are congruent.");

        /**
         Receiving input
         @ x11, y11; x12, y12; x13, y13 - vertices for triangle 1
         @ x21, y21; x22, y22; x23, y23 - vertices for triangle 2
         */

        System.out.println("Please enter the coordinates of the 3 " +
                "vertices of the first triangle:");
        System.out.println("Enter the first vertex (2 real numbers)");
        double x11 = scan.nextDouble();
        double y11 = scan.nextDouble();
        System.out.println("Enter the second vertex (2 real numbers)");
        double x12 = scan.nextDouble();
        double y12 = scan.nextDouble();
        System.out.println("Enter the third vertex (2 real numbers)");
        double x13 = scan.nextDouble();
        double y13 = scan.nextDouble();

        System.out.println("Please enter the coordinates of the 3 " +
                "vertices of the 2nd triangle:");
        System.out.println("Enter the first vertex (2 real numbers)");
        double x21 = scan.nextDouble();
        double y21 = scan.nextDouble();
        System.out.println("Enter the second vertex (2 real numbers)");
        double x22 = scan.nextDouble();
        double y22 = scan.nextDouble();
        System.out.println("Enter the third vertex (2 real numbers)");
        double x23 = scan.nextDouble();
        double y23 = scan.nextDouble();

        /** Calculating triangle sides lengths and determining triangle congruence
         @ s1_T1, s1_T2, s1_T3 - sides for triangle 1
         @ s2_T1, s2_T2, s2_T3 - sides for triangle 2
         @ POWER - for calculating the sides lengths
         @ TOLERANCE - for ensuring there are no decimal-related skewing
        */
        double s1_T1, s1_T2, s1_T3, s2_T1, s2_T2, s2_T3;

        // Triangle 10 0 3 0 0 4 3 0 3 4 0 0
        s1_T1 = Math.sqrt(Math.pow(x12 - x11, POWER) + Math.pow(y12 - y11, POWER));
        s1_T2 = Math.sqrt(Math.pow(x13 - x12, POWER) + Math.pow(y13 - y12, POWER));
        s1_T3 = Math.sqrt(Math.pow(x11 - x13, POWER) + Math.pow(y11 - y13, POWER));

        // Triangle 2
        s2_T1 = Math.sqrt(Math.pow(x22 - x21, POWER) + Math.pow(y22 - y21, POWER));
        s2_T2 = Math.sqrt(Math.pow(x23 - x22, POWER) + Math.pow(y23 - y22, POWER));
        s2_T3 = Math.sqrt(Math.pow(x21 - x23, POWER) + Math.pow(y21 - y23, POWER));

        // Printing triangle data

        System.out.println("The first triangle is (" + x11 + ", " + y11 + ") ("
                + x12 + ", " + y12 + ") (" + x13 + ", " + y13 + ").");
        System.out.println("Its lengths are " + s1_T1 + ", " + s1_T2 + ", "
                + s1_T3 + ".");
        System.out.println("The first triangle is (" + x21 + ", " + y21 + ") ("
                + x22 + ", " + y22 + ") (" + x23 + ", " + y23 + ").");
        System.out.println("Its lengths are " + s2_T1 + ", " + s2_T2 + ", "
                + s2_T3 + ".");


        // Checking congruence and printing messages accordingly

        if ((Math.abs(s1_T1 - s2_T1) < TOLERANCE) && (Math.abs(s1_T2 - s2_T2) < TOLERANCE)
                && (Math.abs(s1_T3 - s2_T3) < TOLERANCE)
                || (Math.abs(s1_T1 - s2_T2) < TOLERANCE) && (Math.abs(s1_T2 - s2_T3) < TOLERANCE)
                && (Math.abs(s1_T3 - s2_T1) < TOLERANCE)
                || (Math.abs(s1_T1 - s2_T3) < TOLERANCE) && (Math.abs(s1_T2 - s2_T1) < TOLERANCE)
                && (Math.abs(s1_T3 - s2_T2) < TOLERANCE) || (Math.abs(s1_T1 - s2_T2) < TOLERANCE) && (Math.abs(s1_T2 - s2_T1) < TOLERANCE)
                && (Math.abs(s1_T3 - s2_T3) < TOLERANCE)
                || (Math.abs(s1_T1 - s2_T1) < TOLERANCE) && (Math.abs(s1_T2 - s2_T3) < TOLERANCE)
                && (Math.abs(s1_T3 - s2_T2) < TOLERANCE)
                || (Math.abs(s1_T1 - s2_T3) < TOLERANCE) && (Math.abs(s1_T2 - s2_T2) < TOLERANCE)
                && (Math.abs(s1_T3 - s2_T1) < TOLERANCE))
            System.out.println("The triangles are congruent");
        else
            System.out.println("The triangles are not congruent");

    } // end of method main
} //end of class Congruent