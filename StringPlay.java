public class StringPlay {
    public static void main(String[] args) {
        String college = new String ("Frostburg State University");
        String town = new String("Frostburg, MD");  // part (a)

        int stringLength;
        String change1, change2, change3;
        stringLength = college.length();    // part (b)

        System.out.println (college + " contains " + stringLength + " characters.");
        change1 = college.toUpperCase();    // part (c)
        change2 = change1.replaceAll("O", "*");     // part (d)
        change3 = college.concat(town);     // part (e)
        System.out.println ("The final string is " + change3);
    }
}
