package SeminarsHW.HW5.view;

import java.util.Scanner;

public class UserView {
    public static Integer printMenu() {
        String menu = """
                Select an action:
                1. Output the entire list in order.
                2. Sorting by name.
                3. Sorting by age.
                """;
        System.out.println(menu);
        Scanner scanner = new Scanner(System.in);
        Integer choice = scanner.nextInt();
        scanner.close();
        return choice;

    }

    public static void printNameSorting(Integer choice) {
        switch (choice) {
            case 1:
                System.out.println("-----------Iterator--------------");
                break;
            case 2:
                System.out.println("-----------Sort by name--------------");
                break;
            case 3:
                System.out.println("-----------Sort by age--------------");
                break;
            default:
                System.out.println("error");
                break;

        }
    }
}
