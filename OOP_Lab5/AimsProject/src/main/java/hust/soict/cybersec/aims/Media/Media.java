package hust.soict.cybersec.aims.Media;

import java.util.*;

public abstract class Media {
    protected int id;
    protected String title;
    protected String category;
    protected float cost;
    private static int nItems = 0;

    public Media() {

    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    public float getCost() {
        return cost;
    }

    public void setCost(float cost) {
        this.cost = cost;
    }

    public Media(String title, String category, float cost) {
        this.title = title;
        this.category = category;
        this.cost = cost;
        id = nItems++;
    }

    public Media(String title) {
        this.title = title;
        id = nItems++;
    }

    @Override
    public boolean equals(Object o) {
        Media media = (Media) o;
        return title == media.title;
    }

    public static final Comparator<Media> COMPARE_BY_TITLE_COST = new MediaComparatorByTitleCost();
    public static final Comparator<Media> COMPARE_BY_COST_TITLE = new MediaComparatorByCostTitle();

    public void play() {
        if (!(this instanceof Playable)) {
            System.out.println("Item is not playable");
            return;
        }
        Playable playable = (Playable) this;
        playable.play();
    }

    public boolean matchId(int id) {
        return this.id == id;
    }

    public boolean matchTitle(String title) {
        return this.title.equals(title);
    }

    @Override
    public abstract String toString();
}
