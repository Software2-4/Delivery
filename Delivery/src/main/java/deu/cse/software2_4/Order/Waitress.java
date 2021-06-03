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
public class Waitress {
    private Menu lunchMenu;
    
    public Waitress(Menu lunchMenu) {
        this.lunchMenu = lunchMenu;
    
    }

    public void printMenu() {
        Iterator lunchIterator = lunchMenu.createIterator();
    
        System.out.println("===== 식사 메뉴 =====");
        printMenu(lunchIterator);
    
    }

    private void printMenu(Iterator iterator) {
        while (iterator.hasNext()) {
            MenuItem menuItem = (MenuItem) iterator.next();
            System.out.print(menuItem.getRes_name()+ ", ");
            System.out.print(menuItem.getMenu()+ ", ");
            System.out.println(menuItem.getPrice());
        }
    }
}
