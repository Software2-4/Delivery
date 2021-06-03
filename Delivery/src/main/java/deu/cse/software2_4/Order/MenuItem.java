/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package deu.cse.software2_4.Order;

import java.util.Iterator;

/**
 *
 * @author YOU
 */
public class MenuItem {
    private String res_name;
    private String menu;
    private int price;

    public MenuItem(String res_name, String menu, int price) {
        this.res_name = res_name;
        this.menu = menu;
        this.price = price;
    }

    public String getRes_name() {
        return res_name;
    }

    public String getMenu() {
        return menu;
    }

    public int getPrice() {
        return price;
    }
}
