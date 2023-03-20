package SeminarsHW.HW5.controller;

import java.util.Arrays;
import java.util.Iterator;

import SeminarsHW.HW5.model.Cat;
import SeminarsHW.HW5.model.ListOfCats;
import SeminarsHW.HW5.view.UserView;

public class Start {

    public static void start() {

        ListOfCats cats = new ListOfCats();
        cats.setCatList(Arrays.asList(
                new Cat("yashka", 3),
                new Cat("murzik", 5),
                new Cat("vas'ka", 1),
                new Cat("barsik", 7)));

        Integer userChoice = UserView.printMenu();
        UserView.printNameSorting(userChoice);

        if (userChoice == 1) {
            Iterator<Cat> iterator = cats.iterator();
            while (iterator.hasNext()) {
                Cat cat = iterator.next();
                System.out.println("name = " + cat.getName() + " age = " + cat.getAge());
            }
        }

        if (userChoice == 2) {
            cats.getCatList().sort(new SortByName());
            for (Cat cat : cats) {
                System.out.println("name = " + cat.getName() + " age = " + cat.getAge());
            }
        }

        if (userChoice == 3) {
            cats.getCatList().sort(new SortByYear());
            for (Cat cat : cats) {
                System.out.println("name = " + cat.getName() + " age = " + cat.getAge());
            }
        }
    }
}