package topico05colecoes.aula05map.application;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.TreeMap;

public class Program {
    public static void main(String[] args) {
        // Map -> Conjunto de chave e valor (indexados pela chave, não pode repetir)

        // HashMap -> Mais rápido e não ordenado
        HashMap<String, Integer> stringIntegerHashMap = new HashMap<String, Integer>();
        stringIntegerHashMap.put("A", 10);
        stringIntegerHashMap.put("C", 20);
        stringIntegerHashMap.put("B", 30);
        stringIntegerHashMap.put("D", 40);
        System.out.println("Hash Map: ");
        for (String key : stringIntegerHashMap.keySet()) {
            int value = stringIntegerHashMap.get(key);
            System.out.println(key + " " + value);
        }
        System.out.println();

        // TreeMap -> Mais lento e ordenado pelo CompareTo do objeto
        TreeMap<String, Integer> stringIntegerTreeMap = new TreeMap<String, Integer>();
        stringIntegerTreeMap.put("A", 10);
        stringIntegerTreeMap.put("C", 20);
        stringIntegerTreeMap.put("B", 30);
        stringIntegerTreeMap.put("D", 40);
        System.out.println("Tree Map: ");
        for (String key : stringIntegerTreeMap.keySet()) {
            int value = stringIntegerTreeMap.get(key);
            System.out.println(key + " " + value);
        }
        System.out.println();

        // LinkedHashMap -> Velocidade média, ordenação por ordem de inserção
        LinkedHashMap<String, Integer> stringIntegerLinkedHashMap = new LinkedHashMap<String, Integer>();
        stringIntegerLinkedHashMap.put("A", 10);
        stringIntegerLinkedHashMap.put("C", 20);
        stringIntegerLinkedHashMap.put("B", 30);
        stringIntegerLinkedHashMap.put("D", 40);
        System.out.println("Tree Map: ");
        for (String key : stringIntegerLinkedHashMap.keySet()) {
            int value = stringIntegerLinkedHashMap.get(key);
            System.out.println(key + " " + value);
        }
    }
}
