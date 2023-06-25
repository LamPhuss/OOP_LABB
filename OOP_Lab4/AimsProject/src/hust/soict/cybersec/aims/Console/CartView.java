package hust.soict.cybersec.aims.Console;

import java.util.*;
import hust.soict.cybersec.aims.Media.*;

public class CartView extends MutualGUI {

    public CartView(MutualGUI usageGui) {
        super(usageGui);
        options = Arrays.asList("Filter medias in cart", "Sort medias in cart",
                "Remove media from cart", "Play a media", "Place order");
    }

    @Override
    public void displayInfo() {
        System.out.println();
        cart.print();
    }

    protected void handleChoice(int choice) {

        Media item = null;
        if (choice >= 3 && choice <= 4) {
            System.out.print("Enter title of item: ");
            String search = scanner.nextLine();
            item = cart.searchByTitle(search);

            if (item == null) {
                System.out.println("There is no item with such name");
                scanner.nextLine();
                return;
            }
        }

        switch (choice) {
            case 1:
                new MediaFilter(this).display();
                break;
            case 2:
                new MediaSort(this).display();
                break;
            case 3:
                cart.removeMedia(item);
                scanner.nextLine();
                break;
            case 4:
                item.play();
                scanner.nextLine();
                break;
            case 5:
                cart.items0rdered.clear();
                System.out.println("An order is created");
                break;
        }
    }
}
