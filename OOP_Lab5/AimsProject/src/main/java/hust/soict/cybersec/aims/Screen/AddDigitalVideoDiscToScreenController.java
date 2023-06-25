package hust.soict.cybersec.aims.Screen;

import hust.soict.cybersec.aims.Cart.Cart;
import hust.soict.cybersec.aims.Media.DigitalVideoDisc;
import hust.soict.cybersec.aims.Screen.AddBookToStoreScreen;
import hust.soict.cybersec.aims.Screen.AddCompactDiscToStoreScreen;
import hust.soict.cybersec.aims.Screen.CartScreen;
import hust.soict.cybersec.aims.Screen.StoreScreen;
import hust.soict.cybersec.aims.Store.Store;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.MenuItem;
import javafx.scene.control.TextField;

import javax.naming.LimitExceededException;
import java.io.IOException;

public class AddDigitalVideoDiscToScreenController {
    private Store store;
    private Cart cart;
    private Runnable windowCloser;

    @FXML
    private Button btnAdd;
    @FXML
    private TextField tfTitle;
    @FXML
    private TextField tfCategory;
    @FXML
    private TextField tfCost;
    @FXML
    private MenuItem viewStore;
    @FXML
    private MenuItem viewCart;
    @FXML
    private MenuItem addBook;
    @FXML
    private MenuItem addCD;

    public AddDigitalVideoDiscToScreenController(Store store, Cart cart){
        super();
        this.store = store;
        this.cart = cart;
    }
    @FXML
    private void initialize(){
        // Add button handler
        btnAdd.setOnAction(e -> {
            String title = tfTitle.getText();
            String category = tfCategory.getText();
            Float cost = Float.parseFloat(tfCost.getText());
            DigitalVideoDisc dvd = null;
            dvd = new DigitalVideoDisc(title, category, cost);
            store.addMedia(dvd);
            tfTitle.clear();
            tfCategory.clear();
            tfCost.clear();
        });
        // Handler menu items
        viewStore.setOnAction(e -> {
            windowCloser.run();
            new StoreScreen(store, cart);
        });
        viewCart.setOnAction(e -> {
            windowCloser.run();
            new CartScreen(cart, store);
        });
        addBook.setOnAction(e -> {
            windowCloser.run();
            new AddBookToStoreScreen(store, cart);
        });
        addCD.setOnAction(e -> {
            windowCloser.run();
            new AddCompactDiscToStoreScreen(store, cart);
        });
    }

    // Setup window closer
    public void setWindowCloser(Runnable windowCloser){
        this.windowCloser = windowCloser;
    }
}