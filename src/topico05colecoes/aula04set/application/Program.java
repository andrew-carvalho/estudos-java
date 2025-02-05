package topico05colecoes.aula04set.application;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.TreeSet;

public class Program {
    public static void main(String[] args) {
        // Set são conjuntos matemáticos -> não possui elementos repetidos e não existe índices para busca

        // Hash set -> Não ordenado (ordem aleatória), mais rápido
        HashSet<Integer> integerHashSet = new HashSet<Integer>();
        integerHashSet.add(10);
        integerHashSet.add(50);
        integerHashSet.add(30);
        System.out.println("Hash Set: ");
        for (Integer integer : integerHashSet) {
            System.out.println(integer);
        }
        System.out.println();

        // Tree set -> Mais lento, ordenado (Árvore rubro-negra)
        TreeSet<Integer> integerTreeSet = new TreeSet<Integer>();
        integerTreeSet.add(90);
        integerTreeSet.add(30);
        integerTreeSet.add(95);
        System.out.println("Tree Set: ");
        for (Integer integer : integerTreeSet) {
            System.out.println(integer);
        }
        System.out.println();

        // LinkedHashSet -> Velocidade média, Elementos ficam dispostos na ordem de adição
        LinkedHashSet<Integer> integerLinkedHashSet = new LinkedHashSet<Integer>();
        integerLinkedHashSet.add(60);
        integerLinkedHashSet.add(30);
        integerLinkedHashSet.add(40);
        System.out.println("Linked Hash Set: ");
        for (Integer integer : integerLinkedHashSet) {
            System.out.println(integer);
        }
        System.out.println();

        // União -> Adiciona todos os elementos NÃO repetidos
        integerHashSet.addAll(integerTreeSet);
        System.out.println("Hash Set union Tree Set: ");
        for (Integer integer : integerHashSet) {
            System.out.println(integer);
        }
        System.out.println();

        // Intersecção -> Remove todos os elementos diferentes
        integerHashSet.retainAll(integerLinkedHashSet);
        System.out.println("Hash Set intersect Linked Hash Set: ");
        for (Integer integer : integerHashSet) {
            System.out.println(integer);
        }
        System.out.println();

        // Diferença -> Remove todos os elementos iguais
        integerTreeSet.removeAll(integerHashSet);
        System.out.println("Hash Set difference Tree Set: ");
        for (Integer integer : integerTreeSet) {
            System.out.println(integer);
        }
        System.out.println();
    }
}
