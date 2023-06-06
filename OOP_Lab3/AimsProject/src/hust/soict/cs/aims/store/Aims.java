package hust.soict.cs.aims.store;
import hust.soict.cs.aims.cart.Cart;
import hust.soict.cs.aims.disc.DigitalVideoDisc;

public class Aims {
    public static void main(String[] args) {
        // Create a new cart
        Cart anOrder = new Cart();
        //int len = anOrder.len();

        //Create a new dvd objects and add them to the cart
        DigitalVideoDisc dvd1 = new DigitalVideoDisc("The Lion King", "Animation", "Roger Allers", 87, 19.95f);

        DigitalVideoDisc dvd2 = new DigitalVideoDisc("Star Wars", "Science Fiction", "George Lucas", 87, 24.95f);

        DigitalVideoDisc dvd3 = new DigitalVideoDisc("Aladin", "Animation", 18.99f);

        anOrder.addDigitalVideoDisc(dvd1);
        anOrder.addDigitalVideoDisc(dvd2);
        anOrder.addDigitalVideoDisc(dvd3);
        //anOrder.removeDigitalVideoDisc(dvd1);
        //anOrder.removeDigitalVideoDisc(dvd2);



        System.out.println(anOrder.searchDVD("Star Wars"));
    }
}
