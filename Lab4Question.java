public class Lab4Question {
    public static void main(String[] args) {
        boolean a, b;

        a = false; b = false;
        if (a && b) {
            System.out.println("True");
        } else {
            System.out.println("false");
        }

        if (a || b) {
            System.out.println("True");
        } else {
            System.out.println("false");
        }

        if (!(a && b)) {
            System.out.println("True");
        } else {
            System.out.println("false");
        }

        if (!(a || b)) {
            System.out.println("True");
        } else {
            System.out.println("false");
        }
    }
}
