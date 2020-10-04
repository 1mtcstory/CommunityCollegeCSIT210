import java.util.Random;
import java.util.Scanner;

public class DiceMe {
    public static void main(String[] args) {
        // get  scanner
        // get random gen
        // get user input
        // create loop
        // loop 3 times

        Scanner scan = new Scanner(System.in);
        Random generator = new Random();
        int x = 1;
        int o = 1;
        int[] dice1 = new int[3];
        int[] dice2 = new int[3];

        System.out.print("How many sides does die 1 have? ");
        int sides1 = scan.nextInt();
        System.out.print("How many sides does die 2 have? ");
        int sides2 = scan.nextInt();

        do {
            dice1[x-1] = generator.nextInt(sides1)+1;
            System.out.println("Die 1 " + x + " roll = " + dice1[x-1]);
            dice2[x-1] = generator.nextInt(sides2)+1;
            System.out.println("Die 2 " + x + " roll = " + dice2[x-1] + "\n");



            if (dice1.length == 3) {
                System.out.println("full");
                for (int z = 0; dice1.length <= 3; z++) {
                    //o = o + dice1[z-1];
                    System.out.println("O - " + z);
                    z++;
                }
            }



            /*int num2 = generator.nextInt(sides)+1;

            int num3 = generator.nextInt(sides)+1;

            int Total = num1 + num2 + num3;
            double Avg = (num1 + num2 + num3) / 3;

            System.out.println("DICE GAME");

            System.out.println("First roll = " + num1);

            System.out.println("Second roll = " + num2);

            System.out.println("Third roll = " + num3);

            System.out.println("Die total = " + Total);
            System.out.println("Average roll = " + Avg);*/

            x++;
        } while (x <= 3);

        /**int sides = scan.nextInt();
         int num = generator.nextInt(sides);
         num = generator.nextInt(sides)+1;

         int num2 = generator.nextInt(sides)+1;

         int num3 = generator.nextInt(sides)+1;

         int Total = num + num2 + num3;
         int Avg = num + num2 + num3 / 3;

         System.out.println("DICE GAME");

         System.out.println("First roll = " + num);

         System.out.println("Second roll = " + num2);

         System.out.println("Third roll = " + num3);

         System.out.println("Die total = " + Total);
         System.out.println("Average roll = " + Avg);**/
    }
}
