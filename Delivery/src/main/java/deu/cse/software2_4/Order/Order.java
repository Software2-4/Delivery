/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package deu.cse.software2_4.Order;

import java.util.List;

/**
 *
 * @author gyueop
 */
public abstract class Order {
    private List<String> menus;
    private int totalPrice;
    protected String requestText;
    private boolean menuState;
    
    public Order() {
        this.menus =menus;
        this.totalPrice = totalPrice;
        this.menuState = false;
    }
    
    protected abstract void request(String requestText);
    
    public String returnOrder(){
        String ordertype;
        ordertype = menus + "/" + totalPrice + "/" + requestText;
        return ordertype;
    }
    
    public void addMenu() {
        
    }
    
    private void setMenuState() {
        String menuType;
    }
    public boolean removeMenu() {
        if(checkOrder()) {
            menus.removeAll(menus);
            return true;
        }
        return false;
    }
    
    private boolean checkOrder() {
        if(menus.isEmpty())
            return false;
        return true;
    }
}
