import java.util.Scanner;
import java.util.Random;

public class Dice {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        Random generator = new Random();

        System.out.print("How many sides does die 1 have? ");
        int side1 = scan.nextInt();

        System.out.print("How many sides does die 2 have? ");
        int side2 = scan.nextInt();

        int num1 = generator.nextInt(side1)+1;
        System.out.println("Die 1 first roll = " + num1);
        int num4 = generator.nextInt(side2)+1;
        System.out.println("Die 2 first roll = " + num4 + "\n");

        int num2 = generator.nextInt(side1)+1;
        System.out.println("Die 1 second roll = " + num2);
        int num5 = generator.nextInt(side2)+1;
        System.out.println("Die 2 second roll = " + num5 + "\n");

        int num3 = generator.nextInt(side1)+1;
        System.out.println("Die 1 third roll = " + num3);
        int num6 = generator.nextInt(side2)+1;
        System.out.println("Die 2 third roll = " + num6 + "\n");

        int Side1Total = num1 + num2 + num3;
        int Side2Total = num4 + num5 + num6;
        double Side1Avg = num1 + num2 + num3 / 3;
        double Side2Avg = num4 + num5 + num6 / 3;

        System.out.println("Die 1 rolled a total of " + Side1Total + " and rolled " + Side1Avg + " on average");
        System.out.println("Die 2 rolled a total of " + Side2Total + " and rolled " + Side2Avg + " on average");
    }
}
