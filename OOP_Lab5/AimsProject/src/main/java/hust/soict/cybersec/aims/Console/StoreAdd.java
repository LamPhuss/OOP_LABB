package hust.soict.cybersec.aims.Console;

import java.util.*;
import hust.soict.cybersec.aims.Media.*;

public class StoreAdd extends MutualGUI {

    public StoreAdd(MutualGUI usageGui) {
        super(usageGui);
        options = Arrays.asList("Add a book", "Add a DVD", "Add a CD");
    }

    @Override
    public void displayInfo() {
        System.out.println("To add a media, you need to: ");
    }

    @Override
    protected void handleChoice(int choice) {

        String title = null;
        String category = null;
        Float cost = null;
        String director = null;
        int length = 0;

        System.out.println("Write below the titles - category - cost: ");
        System.out.println("Title: ");
        title = scanner.nextLine();
        System.out.println("Category: ");
        category = scanner.nextLine();
        System.out.println("Cost: ");
        try {
            cost = scanner.nextFloat();
        } catch (InputMismatchException e) {
        }
        scanner.nextLine();
        System.out.println("Director (Write 'None' if not exist): ");
        director = scanner.nextLine();
        System.out.println("Director (Write '0' if not exist): ");
        length = scanner.nextInt();
        scanner.nextLine();

        switch (choice) {

            case 1:
                Book book = new Book(title, category, cost);
                System.out.println("Write the authors of the book (Separated by commas):");
                String authorsInput = scanner.nextLine();
                String[] authorsArray = authorsInput.split(",");
                List<String> authorsOfBook = Arrays.asList(authorsArray);
                book.setAuthors(authorsOfBook);
                store.addMedia(book);
                break;
            case 2:
                DigitalVideoDisc dvd = new DigitalVideoDisc(title, category, director, length, cost);
                store.addMedia(dvd);
                break;
            case 3:
                System.out.println("Write the artist of this CD: ");
                String artist = scanner.nextLine();
                CompactDisc cd = new CompactDisc(title, category, director, length, cost, artist);
                store.addMedia(cd);
                break;
        }
    }
}
