package hust.soict.cybersec.aims.Media;

import java.util.*;

public class Book extends Media {

    protected List<String> authors = new ArrayList<String>();

    public List<String> getAuthors() {
        return authors;
    }

    public void setAuthors(List<String> authors) {
        this.authors = authors;
    }

    public Book(String title, String category, float cost) {
        super(title, category, cost);
    }

    // Add an author into the list of authors
    public void addAuthor(String authorName) {
        if (authors.contains(authorName)) {
            System.out.println(authorName + " is already in the list");
        } else {
            authors.add(authorName);
            System.out.println(authorName + " has been added to the list");
        }
    }

    // Remove an author from the list of authors
    public void removeAuthor(String authorName) {
        if (authors.contains(authorName)) {
            authors.remove(authorName);
            System.out.println(authorName + " has been removed from the list");
        } else {
            System.out.println(authorName + " is not in the list");
        }
    }

    @Override
    public String toString() {
        String authorsString = String.join(", ", authors);
        return "Book - " + title + " - " + category + " - "
                + authorsString + ": " + cost + "$";
    }
}
