package hust.soict.cybersec.aims.Console;

import java.util.*;

import hust.soict.cybersec.aims.Media.*;

public class StoreView extends MutualGUI {

    Scanner scanner = new Scanner(System.in);

    public StoreView(MutualGUI usageGui) {
        super(usageGui);
        options = Arrays.asList("See a media details", "Add a media to cart", "Play a media", "See current cart");
    }

    @Override
    public void displayInfo() {
        System.out.println();
        store.ItemsInStore();
    }

    @Override
    protected void handleChoice(int choice) {

        String mediaName = null;

        switch (choice) {
            case 1:
                System.out.println("Title of the media you want to see:");
                mediaName = scanner.nextLine();
                Media media1 = store.searchByTitle(mediaName);
                new MediaDetails(this, media1);
                break;
            case 2:
                System.out.println("Title of the media you want to add:");
                mediaName = scanner.nextLine();
                Media media2 = store.searchByTitle(mediaName);
                cart.addMedia(media2);
                break;
            case 3:
                System.out.println("Title of the media you want to play:");
                mediaName = scanner.nextLine();
                Media media3 = store.searchByTitle(mediaName);
                media3.play();
                break;
            case 4:
                new CartView(this);
                break;
        }
    }
}
