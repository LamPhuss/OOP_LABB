package hust.soict.cybersec.aims.Screen;

import hust.soict.cybersec.aims.Cart.Cart;
import hust.soict.cybersec.aims.Store.Store;
import javafx.application.Platform;
import javafx.embed.swing.JFXPanel;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;

import javax.swing.*;
import java.awt.*;
import java.io.IOException;

public class AddCompactDiscToStoreScreen extends JFrame {
    private Store store;
    private Cart cart;

    public AddCompactDiscToStoreScreen(Store store, Cart cart){
        super();
        this.store = store;
        this.cart = cart;

        // initiate panel
        JFXPanel fxPanel = new JFXPanel();
        this.add(fxPanel);

        // Configure panel
        this.setTitle("Add Compact Disc To Store");
        this.setSize(new Dimension(600, 400));
        this.setVisible(true);

        Runnable windowCloser = () -> SwingUtilities.invokeLater(
                () -> this.setVisible(false)
        );

        // Run
        Platform.runLater(new Runnable() {
            @Override
            public void run() {
                try {
                    FXMLLoader loader = new FXMLLoader(getClass()
                            .getResource("addCD.fxml"));
                    AddCompactDiscToStoreScreenController controller = new
                            AddCompactDiscToStoreScreenController(store, cart);
                    loader.setController(controller);
                    controller.setWindowCloser(windowCloser);
                    Parent root = loader.load();
                    fxPanel.setScene(new Scene(root));
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        });
    }
}