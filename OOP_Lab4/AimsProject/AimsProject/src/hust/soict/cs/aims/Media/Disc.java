package hust.soict.cybersec.aims.Media;

public class Disc extends Media {
    protected String director;
    protected int length;

    public String getDirector() {
        return director;
    }

    public int getLength() {
        return length;
    }

    public Disc(String title, String category, String director, int length, float cost) {
        super(title, category, cost);
        this.director = director;
        this.length = length;
    }

    public Disc(String title) {
        super(title);
    }

    public Disc(String title, String category, float cost) {
        super(title, category, cost);
    }

    public String toString() {
        return "Disc - " + title + " - " + category + " - " + director +
                " - " + length + ": " + cost + "$";
    }
}
