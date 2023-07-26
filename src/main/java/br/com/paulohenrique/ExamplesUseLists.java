package br.com.paulohenrique;

import java.sql.SQLOutput;
import java.util.*;

public class ExamplesUseLists {
    public static void main(String[] args) {
        //Creating and using an ArrayList
        List<Double> testScore = new ArrayList<>(List.of(7d, 8.5, 9.3, 5d, 7d, 0d, 3.6));
        System.out.println(testScore);
        testScore.add(1d);
        testScore.remove(5d);
        System.out.println(testScore);
        testScore.sort(Double::compareTo);
        System.out.println(testScore);
        System.out.println("-----------------------------------");

        System.out.println("Crie uma lista e adicione sete notas:");
        List<Double> listScore2 = new ArrayList<>(Arrays.asList(7d, 8.5, 9.3, 5d, 6.5, 0d, 10d));
        System.out.println(listScore2);
        System.out.println("-----------------------------------");
        System.out.println("Exiba a posição da nota 5.0:");
        System.out.println("A posição da nota 5.0 é: " + listScore2.indexOf(5d));
        System.out.println("-----------------------------------");
        System.out.println("Adicione na lista a nota 8.0 na posição 4:");
        listScore2.add(4, 8.0);
        System.out.println(listScore2);
        System.out.println("-----------------------------------");
        System.out.println("Substitua a nota 5.0 pela nota 6.0:");
        System.out.println(listScore2);
        listScore2.set(listScore2.indexOf(5.0), 6.0);
        System.out.println(listScore2);
        System.out.println("-----------------------------------");
        System.out.println("Confira se a nota 5.0 está na lista:");
        System.out.println("A nota 5.0 está na lista? Verdadeiro ou Falso: "
                + listScore2.contains(5.0));
        System.out.println("-----------------------------------");
        System.out.println("Exiba todas as notas na ordem em que foram informados:");
        System.out.println(listScore2);
        System.out.println("-----------------------------------");
        System.out.println("Exiba a terceira nota adicionada:");
        System.out.println("A terceira nota é: " + listScore2.get(2));
        System.out.println("-----------------------------------");
        System.out.println("Exiba a menor nota:");
        System.out.println(" A menor nota é: " + Collections.min(listScore2));
        System.out.println("-----------------------------------");
        System.out.println("Exiba a maior nota:");
        System.out.println("A maior nota é: " + Collections.max(listScore2));
        System.out.println("-----------------------------------");
        System.out.println("Exiba a soma dos valores: ");
        Double sum = 0d;
        for (Double nota: listScore2) sum+= nota;
        System.out.println("A soma dos valores da lista é: " + String.format("%.2f", sum));
        System.out.println("-----------------------------------");
        System.out.println("Exiba a média das notas: ");
        System.out.println("A média das notas é: " + String.format("%.2f", (sum / listScore2.size())));
        System.out.println("-----------------------------------");
        System.out.println("Remova a nota 0: ");
        System.out.println(listScore2);
        listScore2.remove(0d);
        System.out.println(listScore2);
        System.out.println("-----------------------------------");
        System.out.println("Remova a nota da posição 0: ");
        System.out.println(listScore2);
        listScore2.remove(0);
        System.out.println(listScore2);
        System.out.println("-----------------------------------");
        System.out.println("Remova as notas menores que 7 e exiba a lista: ");
        System.out.println(listScore2);
        listScore2.removeIf(score -> score < 7);
        System.out.println(listScore2);
        System.out.println("-----------------------------------");
        System.out.println("Apague toda a lista: ");
        System.out.println(listScore2);
        listScore2.clear();
        System.out.println(listScore2);
        System.out.println("-----------------------------------");
        System.out.println("Confira se a lista está vazia: ");
        System.out.println("A lista está vazia? Verdadeiro ou falso: " + listScore2.isEmpty());
        System.out.println("-----------------------------------");
        System.out.println("Crie uma lista chamada listScore3 e coloque valores nela: ");
        List<Double> listScore3 = new LinkedList<>();
        listScore3.add(5d);
        listScore3.add(8.5);
        listScore3.add(7.8);
        listScore3.add(10d);
        System.out.println(listScore3);
        System.out.println("-----------------------------------");
        System.out.println("Mostre a primeira nota da nova lista sem removê-lo: ");
        System.out.println("O primeiro elemento da lista é: " + listScore3.get(0));
        System.out.println("-----------------------------------");
        System.out.println("Mostre a primeira nota da nova lista removendo-a: ");
        System.out.println("O item removido foi: " + listScore3.remove(0));
    }
}
