public class Cart {

    public static final int MAX_NUMBERS_ORDERED = 20;
    private DigitalVideoDisc itemsOrdered[] =
            new DigitalVideoDisc[MAX_NUMBERS_ORDERED];

    private int qtyOrder;
    public void addDigitalVideoDisc(DigitalVideoDisc disc) {
        // find the first available index in the array
        int index = -1;
        for (int i = 0; i < MAX_NUMBERS_ORDERED; i++) {
            if (itemsOrdered[i] == null) {
                index = i;
                break;
            }
        }

        // if no available index was found, print an error message and return
        if (index == -1) {
            System.out.println("Error: The cart is already full.");
            return;
        }

        // add the disc to the array
        itemsOrdered[index] = disc;

        // print a success message
        //System.out.println("The disc has been added");
    }

    public void removeDigitalVideoDisc(DigitalVideoDisc disc) {
        // find the index of the disc in the array
        int index = -1;
        for (int i = 0; i < MAX_NUMBERS_ORDERED; i++) {
            if (itemsOrdered[i] == disc) {
                index = i;
                break;
            }
        }

        // if the disc was not found in the array, print an error message and return
        if (index == -1) {
            System.out.println("Error: Disc is not in the cart.");
            return;
        }

        // remove the disc from the array
        itemsOrdered[index] = null;

        // shift the remaining elements in the array down one index
        for (int i = index; i < MAX_NUMBERS_ORDERED - 1; i++) {
            itemsOrdered[i] = itemsOrdered[i + 1];
        }
        itemsOrdered[MAX_NUMBERS_ORDERED - 1] = null;

        // print a success message
        System.out.println("Removed disc from the cart.");
    }
    public float totalCost() {
        float totalCost = 0;

        // loop through the items in the array and sum their prices
        for (int i = 0; i < MAX_NUMBERS_ORDERED; i++) {
            if (itemsOrdered[i] != null) {
                totalCost += itemsOrdered[i].getCost();
            }
        }

        return totalCost;
    }


}

