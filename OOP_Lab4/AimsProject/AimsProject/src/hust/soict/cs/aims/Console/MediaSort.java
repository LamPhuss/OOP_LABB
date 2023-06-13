package hust.soict.cybersec.aims.Console;

import java.util.*;

public class MediaSort extends MutualGUI {

    public MediaSort(MutualGUI usageGui) {
        super(usageGui);
        options = Arrays.asList("By title", "By cost");
    }

    @Override
    public void displayInfo() {
        System.out.println();
        cart.print();
    }

    @Override
    protected void handleChoice(int choice) {

        switch (choice) {

            case 1:
                cart.sortItemsByTitle();
                break;
            case 2:
                cart.sortItemsByCost();
                break;
        }

        back();
    }
}
