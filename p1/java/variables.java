public class variables {

    /**
     * @param c:           character to print
     * @param isUpperCase: parameter to decide whether to print c in upper or lower case
     */
    private static void displayChar(char c, boolean isUpperCase) {
        if (isUpperCase) {
            System.out.println(Character.toUpperCase(c));
        } else {
            System.out.println(c);
        }
    }

    public static void main(String[] args) {
        int a = 10;
        int b = 5;

        double c = 10.5;
        double d = 5.5;

        System.out.println(a / b);
        System.out.println((int) (c / d));
        System.out.println((int) (a / d));
        System.out.println((int) (c / b));

        displayChar('a', true);
        displayChar('a', false);
    }
}
