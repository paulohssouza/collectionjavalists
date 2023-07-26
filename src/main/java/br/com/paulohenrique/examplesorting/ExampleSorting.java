package br.com.paulohenrique.examplesorting;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class ExampleSorting {
    public static void main(String[] args) {
        System.out.println("Crie uma lista de gatos para uso na ordenação.");
        System.out.println("-------------------------------------------------");
        List<Cat> catList = new ArrayList<>();
        catList.add(new Cat("Romeu", 12, "Preto"));
        catList.add(new Cat("Julieta", 12, "Tigrado"));
        catList.add(new Cat("Romeu", 18, "Cinza"));
        catList.add(new Cat("Tom", 6, "Amarelo"));
        catList.add(new Cat("Snarff", 24, "Rubro"));
        System.out.println(catList);
        System.out.println("-------------------------------------------------");
        System.out.println("Exibir a lista em ordem de inserção: ");
        System.out.println("Ordem de inserção: \n" + catList);
        System.out.println("-------------------------------------------------");
        System.out.println("Exibir a lista em ordem aleatória: ");
        Collections.shuffle(catList);
        System.out.println("Ordem aleatória: \n" + catList);
        System.out.println("-------------------------------------------------");
        System.out.println("Exibir a lista em ordem de nome: ");
        Collections.sort(catList);
        System.out.println("Ordem alfabética: " + catList);
        System.out.println("-------------------------------------------------");
        System.out.println("Exibir a lista com ordem de idade: ");
        catList.sort(new ComparatorCatAge());
        System.out.println(catList);
        System.out.println("-------------------------------------------------");
        System.out.println("Exibir lista ordenada por ordem de cor: ");
        catList.sort(new ComparatorCatColor());
        System.out.println(catList);
        System.out.println("-------------------------------------------------");
        System.out.println("Exibir lista ordenada com prioridade Nome/Cor/Idade: ");
        catList.sort(new ComparatorCatNomeColorAge());
        System.out.println(catList);
    }
}
