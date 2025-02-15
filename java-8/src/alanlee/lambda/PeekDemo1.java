package alanlee.lambda;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class PeekDemo1 {

    public static void main(String[] args) {
        List<String> lists = new ArrayList<>();
        lists.add("p1");
        lists.add("p2");
        lists.add("p3");
        lists.add("p4");
        System.out.println(lists);

        List<String> list2 = lists.stream()
                .filter(f -> f.startsWith("p"))
                .peek(t -> {
                    System.out.println(t);
                })
                .collect(Collectors.toList());
        System.out.println(list2);
    }

}