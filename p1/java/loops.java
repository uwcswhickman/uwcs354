public class loops {
    /**
     * Method to calculate factorial using for loop
     *
     * @param n
     * @return
     */
    private static int factorialUsingForLoop(int n) {
        if (n <= 1) {
            return 1;
        }

        int result = 1, i = 2;
        for (i = 2; i <= n; i++) {
            result = result * i;
        }

        return result;
    }

    /**
     * Method to calculate factorial using while loop
     *
     * @param n
     * @return
     */
    private static int factorialUsingWhileLoop(int n) {
        if (n <= 1) {
            return 1;
        }

        int result = 1, i = 2;
        while (i <= n) {
            result = result * i;
            i++;
        }

        return result;
    }

    /**
     * Method to calculate factorial using do-while loop
     *
     * @param n
     * @return
     */
    private static int factorialUsingDoWhileLoop(int n) {
        if (n <= 1) {
            return 1;
        }

        int result = 1, i = 2;
        do {
            result = result * i;
            i++;
        } while (i <= n);

        return result;
    }

    public static void main(String[] args) {
        int n = 5;

        System.out.println(factorialUsingForLoop(n));
        System.out.println(factorialUsingWhileLoop(n));
        System.out.println(factorialUsingDoWhileLoop(n));
    }
}
