package somrat.info;

import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class JShellCommands {
    public static void main(String[] args) {

        System.out.println("JShell Commands Executed!");

        List<Integer> numbers = List.of(12, 9, 13, 4, 6, 2, 4, 12, 15);

        numbers.stream().reduce(0, (x,y)->x+y);
        numbers.stream().reduce(0, (x,y)->x);
        numbers.stream().reduce(0, (x,y)->y);
        numbers.stream().reduce(0, (x,y)-> x>y ? x:y);

        numbers.stream().reduce(Integer.MIN_VALUE, (x,y)-> x>y ? x:y);
        numbers.stream().reduce(Integer.MIN_VALUE, (x,y)-> x>y ? y:x);
        numbers.stream().reduce(Integer.MAX_VALUE, (x,y)-> x>y ? y:x);

        numbers.stream().reduce(0, (x,y) -> x*x + y*y);
        numbers.stream().map(x -> x*x).reduce(0, Integer::sum);
        numbers.stream().map(x -> x*x*x).reduce(0, Integer::sum);

        numbers.stream().filter(x -> x%2==1).reduce(0, Integer::sum);
        numbers.stream().filter(x -> x%2==0).reduce(0, Integer::sum);

        numbers.stream().distinct().forEach(System.out::println);

        numbers.stream().sorted().forEach(System.out::println);

        numbers.stream().distinct().sorted().forEach(System.out::println);

        List<String> courses = List.of("Spring", "Spring Boot", "API" , "Microservices","AWS", "PCF","Azure", "Docker", "Kubernetes");

        courses.stream().sorted().forEach(System.out::println);

        courses.stream().sorted(Comparator.naturalOrder()).forEach(System.out::println);
        courses.stream().sorted(Comparator.reverseOrder()).forEach(System.out::println);
        courses.stream().sorted(Comparator.comparing(str -> str.length())).forEach(System.out::println);

        courses.stream().map(x -> x.length()).collect(Collectors.toList());

        numbers.stream().map(x -> x*x).collect(Collectors.toList());
    }
}
