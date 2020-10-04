import java.util.Scanner;

public class AverageAge {
    public static void main(String[] args) {
        int val1, val2, val3;
        double average;
        Scanner scan = new Scanner(System.in);

        // get three ages from the user
        System.out.println("Enter three ages and I will compute their average.");

        // input value One
        System.out.print("Enter the first age: ");
        val1 = scan.nextInt();
        // System.out.println(val1);

        // input value Two
        System.out.print("Enter the second age: ");
        val2 = scan.nextInt();
        //System.out.println(val2);

        // input value Three
        System.out.print("Enter the third age: ");
        val3 = scan.nextInt();
        // System.out.println(val3);

        //compute the average
        average = (val1 + val2 + val3);
        average = average / 3;

        //print the average (note decimals in the display)
        System.out.println("The average is " + average + ".");
    }
}
