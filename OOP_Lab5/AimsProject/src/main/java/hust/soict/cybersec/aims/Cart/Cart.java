package hust.soict.cybersec.aims.Cart;

import java.util.*;

import hust.soict.cybersec.aims.Media.*;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;

public class Cart {
    public static final int MAX_NUMBER_ORDERED = 33;
    public ObservableList<Media> items0rdered =
            FXCollections.observableArrayList();

    public void addMedia(Media media) {
        if (items0rdered.size() == MAX_NUMBER_ORDERED) {
            System.out.println("The cart is already full");
        }

        if (items0rdered.contains(media)) {
            System.out.println("The item is already in the cart");
        }

        else {
            items0rdered.add(media);
            System.out.println("The disc has been added to the cart");
        }
    }

    public void removeMedia(Media media) {

        if (items0rdered.size() == 0) {
            System.out.println("The cart is empty");
        }

        if (!items0rdered.contains(media)) {
            System.out.println("The item is not in the cart");
        } else {
            items0rdered.remove(media);
            System.out.println("The disc has been removed from the cart");
        }
    }

    public float totalCost() {
        float sum = 0;

        for (int i = 0; i < items0rdered.size(); i++) {
            sum += items0rdered.get(i).getCost();
        }

        return sum;
    }

    public void print() {
        System.out.println("***********************CART***********************");
        System.out.println("Ordered Items:");
        for (int i = 0; i < items0rdered.size(); i++) {
            System.out.println((i + 1) + ". " + items0rdered.get(i).toString());
        }
        System.out.println("Total cost: " + totalCost());
        System.out.println("**************************************************");

    }

    public Media searchByID(int id) {
        for (Media item : items0rdered)
            if (item.matchId(id))
                return item;
        return null;
    }

    public Media searchByTitle(String title) {
        for (Media item : items0rdered)
            if (item.matchTitle(title))
                return item;
        return null;
    }

    public void sortItemsByTitle() {
        Collections.sort(items0rdered, Media.COMPARE_BY_TITLE_COST);
    }

    public void sortItemsByCost() {
        Collections.sort(items0rdered, Media.COMPARE_BY_COST_TITLE);
    }
    public ObservableList<Media> getItemsOrdered(){
        return items0rdered ;
    }
    public void placeOrder() {
        items0rdered.clear();
        System.out.println("Order placed!");
    }
}
