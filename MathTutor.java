/***
 * Write a program (MathTutor.java) that lets the user enter 2 numeric values, and an arithmetic
 * operator: +, -, * and /.
 * Write a switch statement that displays the result of the calculation using the operator and two
 * numbers entered by the user.
 *
 * 10/01/2020
 */

import java.util.Scanner;

public class MathTutor {
    public static void main(String[] args) {
        int n1, n2;
        double t;
        String ao;

        Scanner scan = new Scanner(System.in);
        System.out.print("Enter number 1: ");
        n1 = scan.nextInt();

        System.out.print("Enter an arithmetic operator: ");
        ao = scan.next();

        System.out.print("Enter number 2: ");
        n2 = scan.nextInt();

        switch (ao) {
            case "+" :
                t = n1 + n2;
                System.out.println(n1 + " " + ao + " " + n2 + " = " + t);
                break;
            case "-" :
                t = n1 - n2;
                System.out.println(n1 + " " + ao + " " + n2 + " = " + t);
                break;
            case "*" :
                t = n1 * n2;
                System.out.println(n1 + " " + ao + " " + n2 + " = " + t);
                break;
            case "/" :
                t = n1 / n2;
                System.out.println(n1 + " " + ao + " " + n2 + " = " + t);
                break;
        }
    }
}
