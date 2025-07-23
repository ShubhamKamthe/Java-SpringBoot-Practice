package com.java.basics.datetime;

import java.util.Locale;
import java.util.ResourceBundle;

public class InternationalizationExample {
    public static void main(String[] args) {
        // Set locale to French (France)
        Locale locale = new Locale("fr", "FR");

        // Load the resource bundle
        ResourceBundle bundle = ResourceBundle.getBundle("Messages", locale);

        // Access messages
        System.out.println(bundle.getString("greeting"));  // Should print "Bonjour"
        System.out.println(bundle.getString("farewell"));  // Should print "Au revoir"
    }
}
