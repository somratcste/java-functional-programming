package somrat.info;

import java.util.List;

public class FP01Exercise {
    public static void main(String[] args) {
        List<Integer> numbers = List.of(12, 4, 5, 8, 20, 30, 76, 12, 5);
//        printAllNumbersInListFunctional(numbers);
//        printSquareOfEvenNumber(numbers);

        List<String> courses = List.of("Spring", "Spring Boot", "API" , "Microservices",
                "AWS", "PCF","Azure", "Docker", "Kubernetes");

//        courses.stream()
//                .filter(course -> course.contains("Spring"))
//                .forEach(System.out::println);

//        courses.stream()
//                .filter(course -> course.length() >= 4)
//                .forEach(System.out::println);

        courses.stream()
                .map(course -> course + " " + course.length())
                .forEach(System.out::println);

    }

    private static void printAllNumbersInListFunctional(List<Integer> numbers) {
        numbers.stream()
                .filter(number -> number % 2 != 0)
                .forEach(System.out::println);
    }

    private static void printSquareOfEvenNumber(List<Integer> numbers) {
        numbers.stream()
                .filter(number -> number % 2 == 0)
                .map(number -> number * number)
                .forEach(System.out::println);
    }
}
