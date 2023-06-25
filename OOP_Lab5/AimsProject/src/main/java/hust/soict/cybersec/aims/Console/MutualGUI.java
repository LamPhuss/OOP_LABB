package hust.soict.cybersec.aims.Console;

import java.util.*;
import hust.soict.cybersec.aims.Cart.*;
import hust.soict.cybersec.aims.Store.*;

public abstract class MutualGUI {

    protected boolean Still = true;
    protected List<String> options;
    protected Scanner scanner;
    protected Store store;
    protected Cart cart;

    protected MutualGUI(Store store, Cart cart, Scanner scanner) {
        this.store = store;
        this.cart = cart;
        this.scanner = scanner;
    }

    protected MutualGUI(MutualGUI usageGui) {
        this.store = usageGui.store;
        this.cart = usageGui.cart;
        this.scanner = usageGui.scanner;
    }

    protected void back() {
        Still = false;
    }

    public void display() {
        int choice = -1;

        while (Still) { // Separator

            displayInfo();

            System.out.println("\nOptions:");
            System.out.println("---------------------------------");
            for (int i = 0; i < options.size(); i++) {
                System.out.println((i + 1) + ". " + options.get(i));
            }
            System.out.println("0. Back");
            System.out.println("---------------------------------");
            System.out.println("Please choose one option: ");

            try {
                choice = scanner.nextInt();
            } catch (InputMismatchException e) {
                System.out.println("\nInvalid choice!");
                scanner.nextLine(); // Consume newline character
                continue;
            }

            scanner.nextLine(); // Consume newline char

            if (choice < 0 || choice > options.size()) {
                System.out.println("\nInvalid choice!");
                scanner.nextLine();
            }

            else if (choice == 0) {
                Still = false;
                continue;
            }

            System.out.println();
            handleChoice(choice);
        }
    }

    protected abstract void handleChoice(int choice);

    protected abstract void displayInfo();
}
