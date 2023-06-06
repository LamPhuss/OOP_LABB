package hust.soict.cs.test.store;
import hust.soict.cs.aims.disc.DigitalVideoDisc;
import hust.soict.cs.aims.store.Store;

public class StoreTest {
    public static void main(String[] args) {
        Store newStore = new Store();

        //Create new dvd objects and add them to the store
        DigitalVideoDisc dvd1 = new DigitalVideoDisc("The Lion King", "Animation",
                "Roger Allers", 87, 19.95f);
        DigitalVideoDisc dvd2 = new DigitalVideoDisc("Star Wars", "Science Fiction",
                "George Lucas", 87, 24.95f);
        DigitalVideoDisc dvd3 = new DigitalVideoDisc("Aladin", "Animation",
                18.99f);

        //Test add
        newStore.addDVD(dvd1, dvd2, dvd3);

        //Test remove
        newStore.removeDVD(dvd1);
    }
}
