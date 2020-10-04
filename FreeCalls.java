import java.util.Scanner;

public class FreeCalls {
    public static void main(String[] args) {
        long n1, n2, n3, num;
        int[] toll = {800, 855, 866, 877, 888};
        int tl = toll.length - 1;

        Scanner scan = new Scanner(System.in);
        System.out.print("Enter a phone number (First 3 numbers): ");
        n1 = scan.nextLong();
        System.out.print("Enter a phone number (Middle 3 numbers): ");
        n2 = scan.nextLong();
        System.out.print("Enter a phone number (Last 4 numbers): ");
        n3 = scan.nextLong();

        for (int x = 0; x <= tl; x++) {
            if (n1 == toll[x]) {
                System.out.println("(" + toll[x] + ") " + n2 + "-" + n3 + " is a toll-free number");
            }
        }
    }
}
