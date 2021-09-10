package somrat.info;

import java.util.List;
import java.util.function.BinaryOperator;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.stream.Collectors;

public class FP03BehaviorParameterization {
    
    public static void main(String[] args) {
        List<Integer> numbers = List.of(12, 9, 13, 4, 6, 2, 4, 12, 15);
        filterAndPrint(numbers, number -> number % 2 == 0);
        filterAndPrint(numbers, number -> number % 2 != 0);

        List<Integer> squaredNumbers = mapAndCreateNewList(numbers, number -> number * number);
        List<Integer> cubeNumbers = mapAndCreateNewList(numbers, number -> number * number * number);
    }

    private static List<Integer> mapAndCreateNewList(List<Integer> numbers,
                                 Function<Integer, Integer> mappingFunction) {
        return numbers.stream()
                .map(mappingFunction)
                .collect(Collectors.toList());
    }

    private static void filterAndPrint(List<Integer> numbers, Predicate<Integer> oddPredicate) {
        numbers.stream()
                .filter(oddPredicate)
                .forEach(System.out::println);
    }
}
