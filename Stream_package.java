
import java.util.*;
import java.util.stream.*;


public class Stream_package{
    public static void main(String[] args) {
        List<Integer> list = Arrays.asList(1,2,3,4,5,6,7,8,9,10);

        // Filter list
        List<Integer> even = list.stream()
                                . filter(n -> n%2 == 0)
                                .collect(Collectors.toList());
        System.out.println("Even numbers list " + even);

        // Map (example : square each number)   Means mapping each element to itself 
        List<Integer> squares = list.stream()
                                    .map(n -> n*n)
                                    .collect(Collectors.toList());
        System.out.println("squares list " + squares);

        // Reduce (example sum all numbers)
        int sum = list.stream()
                    .reduce(0,(a,b) -> a+b);    // It's the initial value that the reduction starts with
        System.out.println("sum" + sum);

        // Count elements
        long count = list.stream()
                        .count();
        System.out.println("Count elements  "+ count);

        // Collect into a set
        Set<Integer> set = list.stream()
                                .collect(Collectors.toSet());
        System.out.println("Set: " + set);
                            
        // Grouping by remainder mod 3
        Map<Integer, List<Integer>> grouped = list.stream() 
                                                .collect(Collectors.groupingBy(n -> n%3));
        System.out.println("Grouped mod 3 "+ grouped);

        // Flatten a list of lists
        List<List<Integer>> nested = Arrays.asList(Arrays.asList(1,2), Arrays.asList(3,4));
        List<Integer> flat = nested.stream()
                                .flatMap(Collection::stream)
                                .collect(Collectors.toList());
        System.out.println("Flattened list "+ flat);

        // IntStream for range
        List<Integer> range = IntStream.rangeClosed(1, 6)
                                    .boxed()
                                    .collect(Collectors.toList());
        System.out.println("Range -5 : "+range);

        // Sum of Squares
        
    }
}