package br.com.paulohenrique.examplesorting;

import java.util.Comparator;

public class ComparatorCatColor implements Comparator<Cat> {
    @Override
    public int compare(Cat cat1, Cat cat2) {
        return cat1.getHairColor().compareToIgnoreCase(cat2.getHairColor());
    }
}
