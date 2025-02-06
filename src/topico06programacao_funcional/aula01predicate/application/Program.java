package topico06programacao_funcional.aula01predicate.application;

import java.util.ArrayList;
import java.util.List;

public class Program {
    public static void main(String[] args) {
        List<Integer> integers = new ArrayList<Integer>();
        integers.add(10);
        integers.add(50);
        integers.add(30);

        // Predicate em expressão lambda
        integers.removeIf((x) -> x > 10);

        for (int integer : integers) {
            System.out.println(integer);
        }
    }
}
