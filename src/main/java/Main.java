public class Main {

    public static void main(String[] args) {
        // call the first add method and store the result into a variable called resultOne.
        int resultOne = add(3,56);
        // print resultOne.
        System.out.println(resultOne);
        // call the greeting method and store the result into a variable called resultTwo.
        String resultTwo = greeting("char");
        // print resultTwo.
        System.out.println(resultTwo);
        // call the second add method and store the result into a variable called resultThree.
        int resultThree = add(6,234,75,121);
        // print resultThree.
        System.out.println(resultThree);
        // call the printCapitalised method.
        printCapitalised("it is what it is");
    }

    /**
     * add
     * @param numOne - an integer
     * @param numTwo - an integer
     * @return the sum of numOne and numTwo (an integer)
     */
    public static int add(int numOne, int numTwo){
        return numOne + numTwo;
    }

    /**
     * greeting
     * @param name - the name of a person (a String)
     * @return a greeting in the format of "Bonjour, [name]!" (a String)
     */
    public static String greeting(String name){
        return "Bonjour, " + name + "!";
    }

    /**
     * add
     * @param numOne - an integer
     * @param numTwo - an integer
     * @param numThree - an integer
     * @param numFour - an integer
     * @return the sum of numOne, numTwo, numThree, and numFour (an integer)
     */
    public static int add(int numOne, int numTwo, int numThree, int numFour){
        return add(numFour,add(numThree, add(numOne, numTwo)));
    }

    /**
     * printCapitalised
     * @param toBePrinted - a String that the user wishes to be printed in all caps.
     */
    public static String printCapitalised(String toBePrinted){
        return toBePrinted.toUpperCase();
    }



}
