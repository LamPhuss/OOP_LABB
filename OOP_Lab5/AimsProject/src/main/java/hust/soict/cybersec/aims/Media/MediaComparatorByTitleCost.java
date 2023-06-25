package hust.soict.cybersec.aims.Media;

import java.util.Comparator;

public class MediaComparatorByTitleCost implements Comparator<Media> {
    @Override
    public int compare(Media med1, Media med2) {

        // If the titles are the same, compare based on costs
        if (med1.getTitle() == med2.getTitle()) {
            return Double.compare(med1.getCost(), med2.getCost());
        }

        // If the titles are not the same, compare based on titles
        return med1.getTitle().compareTo(med2.getTitle());
    }
}
