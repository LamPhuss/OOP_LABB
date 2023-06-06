package hust.soict.cs.aims.cart;
import hust.soict.cs.aims.disc.DigitalVideoDisc;

public class Cart {
    public static final int MAX_NUMBER_ORDERED = 20;
    private DigitalVideoDisc itemsOrder[] = new DigitalVideoDisc[MAX_NUMBER_ORDERED];

    public void addDigitalVideoDisc(DigitalVideoDisc disc) {
        int index = -1;
        for (int i = 0; i < MAX_NUMBER_ORDERED; i++) {
            if (itemsOrder[i] == null) {
                index = i;
                break;
            }
        }
        if (index != -1) {
            itemsOrder[index] = disc;
            System.out.println("Add Successful");
        } else {
            System.out.println("The cart is full");
        }
    }
    public void removeDigitalVideoDisc(DigitalVideoDisc disc){
        int index = -1;
        for(int i = 0; i < MAX_NUMBER_ORDERED; i++){
            if(itemsOrder[i] == disc){
                index = i;
            }
        }
        if(index != -1){
            itemsOrder[index] = null;
            System.out.println("Remove Successful");
        }else{
            System.out.println("The disc is not in the cart");
        }
        for(int j = index; j < MAX_NUMBER_ORDERED - 1; j++){
            itemsOrder[j] = itemsOrder[j+1];
        }
    }
    public double totalCost(){
        int length = itemsOrder.length;
        double cost = 0;
        for(int i = 0; i < length; i++){
            if (itemsOrder[i] != null){
                cost += itemsOrder[i].getCost();
            }
        }
        return Double.parseDouble(String.format("%.2f", cost));
    }

    public DigitalVideoDisc searchDVD(String title){
        for(int i = 0; i < itemsOrder.length; i++ ){
            if(itemsOrder[i].isMatch(title)){
                System.out.println("Found DVD");
                return itemsOrder[i];
            }
        }
        return null;
    }
    public DigitalVideoDisc searchID(int id){
        for(int i = 0; i < itemsOrder.length; i++){
            if(itemsOrder[i].getID() == id){
                System.out.println("Found DVD");
                return itemsOrder[i];
            }
        }
        return null;
    }
    public void print(){
        for(int i = 0; i < itemsOrder.length; i++){
            if(itemsOrder[i] != null){
                System.out.println(itemsOrder[i]);
            }
        }
    }
}

