package topico06programacao_funcional.aula04streams.application;

import java.util.Arrays;
import java.util.stream.Stream;

public class Program {
    public static void main(String[] args) {
        // Streams são sequencias de elementos originadas de uma fonte com suporte a "operações agregadas"
        Stream<String> stream1 = Stream.of("Andrew", "Beatriz", "Bruna");
        System.out.println(Arrays.toString(stream1.toArray()));

        // ERO ABAIXO -> STREAMS SÓ PODEM SER UTILIZADAS UMA VEZ
        //Stream<String> stream2 = stream1.map(String::toUpperCase);

        // Função map -> roda uma função para todos os registros na stream
        stream1 = Stream.of("Andrew", "Beatriz", "Bruna");
        Stream<String> stream2 = stream1.map(String::toUpperCase);
        System.out.println(Arrays.toString(stream2.toArray()));

        // Iterate -> gera uma stream de acordo com uma função
        Stream<Integer> stream3 = Stream.iterate(0, x -> x + 2);
        System.out.println(Arrays.toString(stream3.limit(10).toArray()));
    }
}
