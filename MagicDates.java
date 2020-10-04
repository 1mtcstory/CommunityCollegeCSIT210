/**
 * The date June 10, 1960, is special because when you write it in the following format, the month
 * times the day equals the year. 6/10/60
 *
 * Write a program (MagicDates.java) that asks the user for the month as a numeric, a day, and a
 * two-digit year. The program should then determine whether the month times the day is equal to
 * the year. If so, display a message saying the date is magic; otherwise, display a message saying
 * the date is not magic.
 *
 * 9/30/2020
 */

import java.util.Scanner;

public class MagicDates {
    public static void main(String[] args) {
        int m, d, y, t;
        int isTwoDigits = 0;

        while (isTwoDigits != 3) {
            isTwoDigits = 0;
            Scanner scan = new Scanner(System.in);
            System.out.print("Birthday month (2): ");
            m = scan.nextInt();

            if (m > 0 && m < 13) {
                isTwoDigits = isTwoDigits + 1;
            } else {
                System.out.println("Incorrect input\nExample of correct input is 9 or 12");
                System.out.print("Birthday month (2): ");
                m = scan.nextInt();
                isTwoDigits = isTwoDigits + 1;
            }

            System.out.print("Birthday day (17): ");
            d = scan.nextInt();

            if (d > 0 && d < 32) {
                isTwoDigits = isTwoDigits + 1;
            } else {
                System.out.println("Incorrect input\nExample of correct input is 9 or 12");
                System.out.print("Birthday day (27): ");
                d = scan.nextInt();
                isTwoDigits--;
            }

            System.out.print("Birthday year (95): ");
            y = scan.nextInt();

            if (y > 9 && y < 99) {
                isTwoDigits = isTwoDigits + 1;
            } else {
                System.out.println("Incorrect input\nExample of correct input is 10 or 99");
                System.out.print("Birthday year (97): ");
                y = scan.nextInt();
                isTwoDigits--;
            }

            t = d * m;

            if (t == d * m) {
                System.out.println("This date is magic");
            } else {
                System.out.println("This date is not magic");
            }
        }
    }
}
