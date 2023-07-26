package br.com.paulohenrique.examplesorting;

import java.util.Comparator;

public class ComparatorCatNomeColorAge implements Comparator<Cat> {
    @Override
    public int compare(Cat cat1, Cat cat2) {
        int aux = cat1.getName().compareToIgnoreCase(cat2.getName());
        if(aux != 0) return aux;
        aux = cat1.getHairColor().compareToIgnoreCase(cat2.getHairColor());
        if(aux != 0) return aux;
        else return Integer.compare(cat1.getAge(), cat2.getAge());
    }
}
