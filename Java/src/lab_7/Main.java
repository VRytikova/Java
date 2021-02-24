package lab_7;

import javafx.scene.paint.Color;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        Interface pharmacyCatalog = new Interface("Аптека");
        pharmacyCatalog.setLayout(null);
        pharmacyCatalog.setVisible(true);
        pharmacyCatalog.setResizable(false);
    }
}