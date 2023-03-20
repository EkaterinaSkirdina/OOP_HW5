package SeminarsHW.HW5.controller;

import java.util.Comparator;

import SeminarsHW.HW5.model.Cat;

public class SortByYear implements Comparator<Cat> {

    @Override
    public int compare(Cat cat1, Cat cat2) {
        if (cat1.getAge() < cat2.getAge()) {
            return -1;
        }
        if (cat1.getAge() > cat2.getAge()) {
            return 1;
        }
        return 0;
    }
}
