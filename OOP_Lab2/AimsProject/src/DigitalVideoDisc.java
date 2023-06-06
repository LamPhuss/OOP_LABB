public class DigitalVideoDisc {
    public String getTilte() {
        return tilte;
    }

    public void setTilte(String tilte) {
        this.tilte = tilte;
    }

    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    public String getDirector() {
        return director;
    }

    public void setDirector(String director) {
        this.director = director;
    }

    public int getLength() {
        return length;
    }

    public void setLength(int length) {
        this.length = length;
    }

    public float getCost() {
        return cost;
    }

    public void setCost(float cost) {
        this.cost = cost;
    }

    private String tilte;
    private String category;
    private String director;
    private int length;
    private float cost;

    public DigitalVideoDisc(String tilte) {
        this.tilte = tilte;
    }

    public DigitalVideoDisc(String tilte, String category, float cost) {
        this.tilte = tilte;
        this.category = category;
        this.cost = cost;
    }

    public DigitalVideoDisc(String tilte, String category, String director, float cost) {
        this.tilte = tilte;
        this.category = category;
        this.director = director;
        this.cost = cost;
    }

    public DigitalVideoDisc(String tilte, String category, String director, int length, float cost) {
        this.tilte = tilte;
        this.category = category;
        this.director = director;
        this.length = length;
        this.cost = cost;
    }
}
