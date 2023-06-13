package hust.soict.cybersec.aims.Console;

import java.util.*;
import hust.soict.cybersec.aims.Store.*;
import hust.soict.cybersec.aims.Cart.*;

public class MainMenu extends MutualGUI {

    public MainMenu(Store store, Cart cart, Scanner scanner) {
        super(store, cart, scanner);
        options = Arrays.asList("View store", "Update store", "See current cart");
    }

    @Override
    public void displayInfo() {
        System.out.println("AIMS");
    }

    @Override
    protected void handleChoice(int choice) {
        switch (choice) {
            case 1:
                new StoreView(this).display();
                break;
            case 2:
                new StoreUpdate(this).display();
                break;
            case 3:
                new CartView(this).display();
                break;
        }
    }
}
