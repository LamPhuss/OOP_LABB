package hust.soict.cybersec.aims.Console;

import java.util.*;
import hust.soict.cybersec.aims.Media.*;

public class StoreUpdate extends MutualGUI {

    public StoreUpdate(MutualGUI usageGui) {
        super(usageGui);
        options = Arrays.asList("Add a media", "Remove a media");
    }

    @Override
    public void displayInfo() {
        System.out.println();
        store.ItemsInStore();
    }

    @Override
    protected void handleChoice(int choice) {

        switch (choice) {

            case 1:
                new StoreAdd(this).display();
                System.out.println("The item has been added");
                break;
            case 2:
                System.out.println("The title of the media you want to remove from store: ");
                String title = null;
                title = scanner.nextLine();
                Media mediaToRemoved = store.searchByTitle(title);
                store.removeMedia(mediaToRemoved);
                break;
        }
    }
}
