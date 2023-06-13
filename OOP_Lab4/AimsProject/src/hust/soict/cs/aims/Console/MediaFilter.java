package hust.soict.cybersec.aims.Console;

import java.util.*;
import hust.soict.cybersec.aims.Media.*;

public class MediaFilter extends MutualGUI {

    public MediaFilter(MutualGUI usageGui) {
        super(usageGui);
        options = Arrays.asList("By ID", "By title");
    }

    @Override
    public void displayInfo() {
        System.out.println();
        cart.print();
    }

    @Override
    protected void handleChoice(int choice) {

        Media item = null;

        switch (choice) {

            case 1:
                System.out.println("The ID of the media you want: ");
                int id = -1;
                try {
                    id = scanner.nextInt();
                } catch (InputMismatchException e) {
                }
                scanner.nextLine();
                item = cart.searchByID(id);
                break;
            case 2:
                System.out.println("The title of the media you want: ");
                String title = null;
                title = scanner.nextLine();
                item = cart.searchByTitle(title);
                break;
        }

        if (item != null) {
            System.out.println(item.toString());
        }

        else {
            System.out.println("No item with that criteria");
        }

        scanner.nextLine();
    }
}
