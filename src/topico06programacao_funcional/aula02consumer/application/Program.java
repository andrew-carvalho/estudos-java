package topico06programacao_funcional.aula02consumer.application;

import java.util.ArrayList;
import java.util.List;

public class Program {
    public static void main(String[] args) {
        List<Integer> integers = new ArrayList<Integer>();
        integers.add(10);
        integers.add(50);
        integers.add(30);

        // Consumer em expressão lambda
        //integers.forEach(x -> System.out.println(x));
        integers.forEach(System.out::println);
    }
}
