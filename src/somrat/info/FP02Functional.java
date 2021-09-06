package somrat.info;

import java.util.List;
import java.util.stream.Collectors;

public class FP02Functional {
    public static void main(String[] args) {
        List<Integer> numbers = List.of(12, 9, 13, 4, 6, 2, 4, 12, 15);
        List<Integer> squaredNumbers = squareList(numbers);
        List<Integer> evenNumbers = numbers.stream()
                .filter(number -> number % 2 ==0)
                .collect(Collectors.toList());
        System.out.println(evenNumbers);
//        System.out.println(squaredNumbers);
//        int sum = addListFunctional(numbers);
//        System.out.println(sum);
    }

    private static List<Integer> squareList(List<Integer> numbers) {
        return numbers.stream()
                .map(number -> number * number)
                .collect(Collectors.toList());
    }

    private static int sum(int a, int b) {
        return a + b;
    }
    private static int addListFunctional(List<Integer> numbers) {
        return numbers.stream()
//            .reduce(0, FP02Functional::sum);
//            .reduce(0, (a,b) -> a + b);
            .reduce(0, Integer::sum);
    }
}
