package pl.qbsapps;

import java.math.BigInteger;
import java.util.ArrayList;

public class Calculation {

    int quantityOfSmallerNumbers(ArrayList<BigInteger> numbers, int number) {
        return numbers.stream().filter(i -> i.compareTo(BigInteger.valueOf(number)) < 0).toArray().length;
    }
}
