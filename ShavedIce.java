// 09/28/2020

import java.math.BigInteger;
import java.text.DecimalFormat;
import java.text.NumberFormat;
import java.util.Random;
import java.util.Scanner;

public class ShavedIce {
    public static void main(String[] args) {
        String coName;
        int smSales, mdSales, lgSales, xlSales;
        final double sm = 1.23, md = 2.34, lg = 3.45, xl = 4.56;

        Scanner scan = new Scanner(System.in);
        System.out.print("Enter company name: ");
        coName = scan.nextLine().toUpperCase();

        System.out.print("Child units sold today: ");
        smSales = scan.nextInt();
        System.out.print("Medium units sold today: ");
        mdSales = scan.nextInt();
        System.out.print("Large units sold today: ");
        lgSales = scan.nextInt();
        System.out.print("Extra large units sold today: ");
        xlSales = scan.nextInt();

        // default is US and also formats in 0.##
        NumberFormat defaultFormat = NumberFormat.getCurrencyInstance();

        double smTotal = sm * smSales;
        double mdTotal = md * mdSales;
        double lgTotal = lg * lgSales;
        double xlTotal = xl * xlSales;
        double total = smTotal + mdTotal + lgTotal + xlTotal;

        Random rand = new Random();
        int cmfmCode = rand.nextInt(999999999 - 100000000);

        System.out.println("\t\t\t\t\t\t\t\t\t" + coName);             // Company Name {PENGUIN SHAVED ICE}
        System.out.println("\t\t\t\t\t\t\t\t//----//----~----\\\\----\\\\");
        System.out.println("\t\t\t\t# of Sales \t\t\t\tPrice \t\t\tTotal");
        System.out.println("Child\t\t\t" + smSales + " \t\t\t\t\t\t" + defaultFormat.format(sm) + "\t\t\t" + defaultFormat.format(smTotal));
        System.out.println("Medium\t\t\t" + mdSales + " \t\t\t\t\t\t" + defaultFormat.format(md) + "\t\t\t" + defaultFormat.format(mdTotal));
        System.out.println("Large\t\t\t" + lgSales + " \t\t\t\t\t\t" + defaultFormat.format(lg) + " \t\t\t" + defaultFormat.format(lgTotal));
        System.out.println("Extra Large\t\t" + xlSales + " \t\t\t\t\t\t" + defaultFormat.format(xl) + "\t\t\t" + defaultFormat.format(xlTotal));

        System.out.println("\t\t\t\tTotal \t\t\t\t\t\t\t\t\t" + defaultFormat.format(total));
        System.out.println("\t\t\t\tConfirmation code: " + cmfmCode);
    }
}
