package pl.qbsapps;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Operation operation = new Operation();

        operation.operation();
    }
}

class Operation {

    public void operation() {
        Calculation calculation = new Calculation();
        Scanner scanner = new Scanner(System.in);
        ArrayList<Integer> numbers = new ArrayList<>();

        int sets = scanner.nextInt();

        for (int i = 0; i < sets; i++) {
            int numbersQuantity = scanner.nextInt();
            for (int j = 0; j < numbersQuantity; j++) {
                numbers.add(scanner.nextInt());
            }
            System.out.println(calculation.LCM(numbers));
        }
    }
}

class Calculation {

    public int LCM(ArrayList<Integer> numbers) {
        int size = numbers.size();
        for (int i = 0; i < size; i++) {
            if (numbers.size() != 1) {
                int temp = LCM(numbers.get(0), numbers.get(1));
                numbers.remove(1);
                numbers.set(0, temp);
            }
        }

        return numbers.get(0);
    }

    public int LCM(int a, int b) {
        return (a * b) / GCF(a, b);
    }

    public int GCF(int a, int b) {
        if (b == 0) {
            return a;
        } else {
            return (GCF(b, a % b));
        }
    }
}
