public class LabTwo {
    public static void main(String[] args) {
        // size = 8; size += size + 12; size = size * 9; size = size / 3;
        /***
         * int size = 8;
         *          System.out.println(size);
         *         System.out.println(size += size + 12);
         *         System.out.println(size = size + 9);
         *         System.out.println(size = size / 3);
         */

        // depth = 2.7; depth = 20 - depth * 4; depth = depth / 5;
        /***
         * double depth = 2.7;
         *         System.out.println(depth = 28 - depth * 4);
         *         System.out.println(depth = depth / 5);
         */

        // length = 32; length *= 2+1; length *= length; length /= length;
        int length = 31;
        System.out.println(length += 2+1);
        System.out.println(length += length);
        System.out.println(length /= length);

    }
}
