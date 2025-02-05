package topico05colecoes.aula02curinga.application;

import java.util.ArrayList;
import java.util.List;

public class Program {
    public static void main(String[] args) {
        List<Integer> myIntegers = new ArrayList<Integer>();
        myIntegers.add(10);
        myIntegers.add(10);
        myIntegers.add(20);
        printList(myIntegers);

        List<Character> myCharacters = new ArrayList<Character>();
        myCharacters.add('A');
        myCharacters.add('B');
        myCharacters.add('C');
        printList(myCharacters);
    }

    public static void printList(List<?> list) {
        for (Object object : list) {
            System.out.println(object);
        }
    }
}
