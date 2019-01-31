public class conditionals {

    /**
     * Method returning true
     *
     * @return true
     */
    private static boolean trueFunction() {
        System.out.println("Inside True Function");
        return true;
    }

    /**
     * Method returning false
     *
     * @return false
     */
    private static boolean falseFunction() {
        System.out.println("Inside False Function");
        return false;
    }

    /**
     * Method demonstrating use of conditionals
     */
    private static void conditional() {
        if (falseFunction()) {
            System.out.println("Inside if");
        } else if (trueFunction()) {
            System.out.println("Inside else-if");
        }
    }

    /**
     * Method demonstrating use of nested conditionals
     */
    private static void nestedConditional() {
        System.out.println("Nested if-else conditional");
        if (trueFunction()) {
            System.out.println("Inside if");
            if (falseFunction()) {
                System.out.println("Inside if-if");
            } else {
                System.out.println("Inside if-else");
            }
        } else {
            System.out.println("Inside else");
        }
    }

    /**
     * Method demonstrating use of switch
     *
     * @param c: Parameter to decide whether to invole trueFunction or falseFunction
     */
    private static void switchConstruct(char c) {
        switch (c) {
            case 't':
                trueFunction();
                break;
            case 'f':
                falseFunction();
                break;
        }
    }

    /**
     * Method demonstrating and short circuit
     */
    private static void andShortCircuit() {
        if (falseFunction() && trueFunction()) {
            System.out.println("AND short circuiting is cool!");
        }
    }

    /**
     * Method demonstrating or short circuit
     */
    private static void orShortCircuit() {
        if (trueFunction() && falseFunction()) {
            System.out.println("OR Short circuiting is cool!");
        }
    }

    public static void main(String[] args) {
        conditional();
        nestedConditional();
        switchConstruct('t');
        andShortCircuit();
        orShortCircuit();
    }
}
