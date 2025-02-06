package topico06programacao_funcional.aula03function.application;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Program {
    public static void main(String[] args) {
        List<Integer> integers = new ArrayList<Integer>();
        integers.add(10);
        integers.add(50);
        integers.add(30);

        // Function como expressão lambda
        integers = integers.stream().map((x) -> x += 10).collect(Collectors.toList());

        integers.forEach(System.out::println);
    }
}
