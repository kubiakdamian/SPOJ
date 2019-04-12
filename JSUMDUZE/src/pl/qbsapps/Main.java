package pl.qbsapps;

import java.math.BigInteger;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Operation operation = new Operation();

        operation.operation();
    }
}

class Operation {

    public void operation() {
        Scanner scanner = new Scanner(System.in);
        Calculator calculator = new Calculator();

        int sets = scanner.nextInt();

        for (int i = 0; i < sets; i++) {
            BigInteger x = scanner.nextBigInteger();
            BigInteger y = scanner.nextBigInteger();

            System.out.println(calculator.sum(x, y));
        }
    }
}

class Calculator {

    public BigInteger sum(BigInteger x, BigInteger y) {
        return x.add(y);
    }
}
