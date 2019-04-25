import org.junit.Test;

/**
 * MiniCodingTest is mini coding test
 *
 * @author lanxy
 * @date 2019-04-25
 */
public class MiniCodingTest {

    /**
     * part one : for multiples of three print "Fizz" instead of the number
     * and for multiples of five print "Buzz".For numbers which are multiples
     * of both three and five print "FizzBuzz".
     */
    @Test
    public void partOne() {
        for (int i = 1; i <= 100; i++) {
            if (isMultiplesThree(i) && isMultiplesFive(i)) {
                System.out.println("FizzBuzz");
            } else if (isMultiplesThree(i)) {
                System.out.println("Fizz");
            } else if (isMultiplesFive(i)) {
                System.out.println("Buzz");
            } else {
                System.out.println(i);
            }
        }
    }

    /**
     * part two: divisible by 3 or has a 3 in it
     *           divisible by 5 or has a 5 in it
     */
    @Test
    public void partTwo() {
        String numberString;
        for (int i = 1; i <= 100; i++) {
            numberString = "" + i;
            if ((isMultiplesThree(i) || isContainsThree(numberString))
                    && (isMultiplesFive(i) || isContainsFive(numberString))) {
                System.out.println("FizzBuzz");
            } else if (isMultiplesThree(i) || isContainsThree(numberString)) {
                System.out.println("Fizz");
            } else if (isMultiplesFive(i) || isContainsFive(numberString)) {
                System.out.println("Buzz");
            } else {
                System.out.println(i);
            }
        }
    }

    /**
     * deduce the number is for multiples of three
     *
     * @param number
     * @return
     */
    private boolean isMultiplesThree(int number) {
        return number % 3 == 0;
    }

    /**
     * deduce the number is for multiples of five
     *
     * @param number
     * @return
     */
    private boolean isMultiplesFive(int number) {
        return number % 5 == 0;
    }

    /**
     * deduce is contains number three
     *
     * @param numberString
     * @return
     */
    private boolean isContainsThree(String numberString) {
        if (numberString != null) {
            return numberString.contains("3");
        } else {
            return false;
        }
    }

    /**
     * deduce is contains number five
     *
     * @param numberString
     * @return
     */
    private boolean isContainsFive(String numberString) {
        if (numberString != null) {
            return numberString.contains("5");
        } else {
            return false;
        }
    }
}
