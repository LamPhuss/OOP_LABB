package hust.soict.cybersec.aims.Media;

import java.util.Comparator;

public class MediaComparatorByCostTitle implements Comparator<Media> {
    @Override
    public int compare(Media med1, Media med2) {

        // If the costs are the same, compare based on titles
        if (med1.getCost() == med2.getCost()) {
            return med1.getTitle().compareTo(med2.getTitle());
        }

        // If the costs are not equal, compare based on costs
        return Double.compare(med1.getCost(), med2.getCost());
    }
}