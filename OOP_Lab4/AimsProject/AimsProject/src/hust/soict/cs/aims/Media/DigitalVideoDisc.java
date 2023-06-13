package hust.soict.cybersec.aims.Media;

public class DigitalVideoDisc extends Disc implements Playable {

    public DigitalVideoDisc(String title, String category, String director, int length, float cost) {
        super(title, category, director, length, cost);
    }

    public DigitalVideoDisc(String title) {
        super(title);
    }

    public DigitalVideoDisc(String title, String category, float cost) {
        super(title, category, cost);
    }

    // public boolean isMatch(String title) {
    // return this.getTitle().equalsIgnoreCase(title);
    // }

    @Override
    public String toString() {
        if (length != 0) {
            return "DVD" + " - " + title + " - " + category + " - "
                    + director
                    + " - "
                    + length + ": " + cost + "$";
        }

        else {
            return "DVD" + " - " + title + " - " + category + " - "
                    + director
                    + " - null" + ": " + cost + "$";
        }
    }

    public void play() {
        System.out.println("Playing DVD: " + title);
        System.out.println("DVD length: " + length);
    }
}
