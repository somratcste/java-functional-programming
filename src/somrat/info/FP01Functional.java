package somrat.info;

import java.util.List;

public class FP01Functional {
    public static void main(String[] args) {
        printAllNumbersInListFunctional(List.of(12, 4, 5, 8, 20, 30, 76, 12, 5));
    }

    private static void print(int number) {
        System.out.println(number);
    }

    private static boolean isEven(int number) {
        return number % 2 ==0;
    }

    private static void printAllNumbersInListFunctional(List<Integer> numbers) {
//        numbers.stream().forEach(FP01Functional::print);
        numbers.stream()
//                .filter(FP01Functional::isEven)
                .filter(number -> number % 2 == 0)
                .forEach(System.out::println);
    }
}
