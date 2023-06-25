package hust.soict.cybersec.aims.Console;

import java.util.*;
import hust.soict.cybersec.aims.Media.*;

public class MediaDetails extends MutualGUI {

    private Media media;

    public MediaDetails(MutualGUI usageGui, Media media) {
        super(usageGui);
        this.media = media;
        options = Arrays.asList("Add to cart", "Play");
    }

    @Override
    public void displayInfo() {
        System.out.println(media.toString());
    }

    @Override
    protected void handleChoice(int choice) {
        switch (choice) {
            case 1:
                cart.addMedia(media);
                break;
            case 2:
                media.play();
                break;
        }
    }
}
