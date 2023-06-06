package hust.soict.cs.aims.store;

import hust.soict.cs.aims.disc.DigitalVideoDisc;

import java.util.ArrayList;

public class Store {
    private ArrayList<DigitalVideoDisc> itemsInStore = new ArrayList<>();

    public void addDVD(DigitalVideoDisc... DVDlist)
    {
        for(DigitalVideoDisc disc : DVDlist)
        {
            itemsInStore.add(disc);
        }
        System.out.println("Success!");
    }

    public void removeDVD(DigitalVideoDisc... DVDlist)
    {
        for(DigitalVideoDisc disc : DVDlist)
        {
            itemsInStore.remove(disc);
        }
        System.out.println("Success!");
    }


}

