package hust.soict.cybersec.aims.Aims;

import java.util.*;

import hust.soict.cybersec.aims.Media.*;
import hust.soict.cybersec.aims.Store.*;
import hust.soict.cybersec.aims.Cart.*;
import hust.soict.cybersec.aims.Console.*;

public class Aims {
    public static void main(String[] args) {

        Cart cart = new Cart();
        Store store = new Store();
        Scanner scanner = new Scanner(System.in);

        DigitalVideoDisc dvd = new DigitalVideoDisc("The Lion King", "Animation", "Roger Allers", 87, 19.95f);
        cart.addMedia(dvd);

        Book book = new Book("Star Wars", "Science Fiction", 24.95f);
        cart.addMedia(book);

        CompactDisc cd = new CompactDisc("24K Magic", "Funk Pop", null, 34, 18.99f, "Bruno Mars");
        cart.addMedia(cd);

        MainMenu menu = new MainMenu(store, cart, scanner);
        menu.display();
    }
}