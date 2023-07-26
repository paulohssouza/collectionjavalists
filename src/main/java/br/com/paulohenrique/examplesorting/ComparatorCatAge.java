package br.com.paulohenrique.examplesorting;

import java.util.Comparator;

public class ComparatorCatAge implements Comparator<Cat> {
    @Override
    public int compare(Cat cat1, Cat cat2) {
        return Integer.compare(cat1.getAge(), cat2.getAge());
    }
}
