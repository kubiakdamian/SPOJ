package pl.qbsapps;

import java.math.BigInteger;
import java.util.ArrayList;
import java.util.Scanner;

public class Operation {

    public void operation() {
        Scanner scanner = new Scanner(System.in);
        ArrayList<BigInteger> numbers = new ArrayList<>();
        Calculation calculation = new Calculation();

        int size = scanner.nextInt();
        for (int i = 0; i < size; i++) {
            numbers.add(scanner.nextBigInteger());
        }

        int attempts = scanner.nextInt();

        for (int i = 0; i < attempts; i++) {
            int number = scanner.nextInt();

            System.out.println(calculation.quantityOfSmallerNumbers(numbers, number));
        }
    }
}
