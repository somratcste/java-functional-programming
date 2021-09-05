package somrat.info;

import java.util.List;

public class FP01Structured {
    public static void main(String[] args) {
        printAllNumbersInListStructured(List.of(12, 4, 5, 8, 20, 30, 76, 12, 5));
    }

    private static void printAllNumbersInListStructured(List<Integer> numbers) {
        for (int number: numbers) {
            System.out.println(number);
        }
    }
}
