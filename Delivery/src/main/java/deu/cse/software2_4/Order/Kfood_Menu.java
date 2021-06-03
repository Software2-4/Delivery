/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package deu.cse.software2_4.Order;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.UnsupportedEncodingException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author YOU
 */
public class Kfood_Menu implements Menu {

    private List<MenuItem> menuItems;
       
    public Kfood_Menu(String rest_name) throws FileNotFoundException, UnsupportedEncodingException {
        try {
            menuItems = new ArrayList<>();
            
            FileInputStream input;
            String[] restaurant_arry;
            String restaurant_info;
                        
            input = new FileInputStream("C:\\Users\\YOU\\Documents\\GitHub\\Delivery\\Delivery\\DB\\Menu.txt");
            InputStreamReader reader = new InputStreamReader(input, "UTF-8");
            BufferedReader in = new BufferedReader(reader);
            
            while ((restaurant_info = in.readLine()) != null) {
                restaurant_arry = restaurant_info.split("/");
                if (restaurant_arry[0].equals(rest_name)) {
                    //System.out.println(restaurant_arry[1]);
                    int price = Integer.parseInt(restaurant_arry[2].toString());
                    addItem(restaurant_arry[0], restaurant_arry[1], price);
                }
            }

        } catch (IOException ex) {
            Logger.getLogger(Kfood_Menu.class.getName()).log(Level.SEVERE, null, ex);
        }

    }

    public void addItem(String name, String description, int price) {
        MenuItem menuItem = new MenuItem(name, description, price);
        menuItems.add(menuItem);
    }


    @Override
    public Iterator createIterator() {
        return menuItems.iterator();
    }
}
