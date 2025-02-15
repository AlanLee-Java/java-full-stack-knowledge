package alanlee.lambda;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

/**
 * 将多个Stream连接成一个Stream
 *
 * @author AlanLee
 * @date 2025-02-15
 */
public class FlatMapDemos1 {

    public static void main(String[] args) {
        List<Integer> result = Stream.of(Arrays.asList(1, 3), Arrays.asList(5, 6)).flatMap(a -> a.stream()).collect(Collectors.toList());
        result.forEach(System.out::println);
    }

}