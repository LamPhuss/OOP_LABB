package hust.soict.cs.test.disc;

import hust.soict.cs.aims.disc.DigitalVideoDisc;

public class TestPassingParameter {
    public static void main(String[] args) {
        // TODO Auto-generated method stub
        DigitalVideoDisc jungleDVD =  new DigitalVideoDisc("Jungle");
        DigitalVideoDisc cinderallaDVD = new DigitalVideoDisc("Cinderalla");

        swap(jungleDVD, cinderallaDVD); // pass by value : create alternative objects that do not affect the actual objects
        System.out.println("jungle dvd title: " + jungleDVD.getTilte());
        System.out.println("cinderella dvd title: " + cinderallaDVD.getTilte());

        changeTitle(jungleDVD, cinderallaDVD.getTilte());
        System.out.println("jungle dvd title: " + jungleDVD.getTilte());
    }
    public static void swap(Object o1, Object o2){
        Object tmp = o1;
        o1 = o2;
        o2 = tmp;
    }
     public static void changeTitle(DigitalVideoDisc dvd, String title) {
        String oldTitle = dvd.getTilte();
        dvd.setTilte(title);
        dvd = new DigitalVideoDisc(oldTitle);
     }
}
