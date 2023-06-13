package hust.soict.cybersec.aims.Store;

import java.util.ArrayList;

import hust.soict.cybersec.aims.Media.*;

public class Store {

    private static int storage = 333;
    private ArrayList<Media> itemsInStore = new ArrayList<>();

    public void addMedia(Media media) {
        if (itemsInStore.size() < storage) {
            if (itemsInStore.contains(media)) {
                System.out.println("The item is already in the storage");
            }

            else {
                itemsInStore.add(media);
                System.out.println("The item has been added to the storage");
                media.setId(itemsInStore.size());
            }
        }

        else {
            System.out.println("The storage is full");
        }
    }

    public void removeMedia(Media media) {

        if (itemsInStore.size() != 0) {
            if (itemsInStore.contains(media)) {
                itemsInStore.remove(media);
                System.out.println("The item has been removed from the storage");
            }

            else {
                System.out.println("The item is not in the storage");
            }
        }

        else {
            System.out.println("The storage is empty");
        }
    }

    public Media searchByTitle(String title) {
        for (Media item : itemsInStore)
            if (item.getTitle() == title) {
                return item;
            }
        return null;
    }

    public void ItemsInStore() {
        for (Media item : itemsInStore)
            System.out.println(item.getId() + " - " + item.toString());
    }
}
