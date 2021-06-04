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
    private State state;
    private String recepient;
    
    public Order() {
        this.menus = menus;
        this.totalPrice = totalPrice;
        this.state = new BeforeOrder();
    }
    
    protected abstract void request(String requestText);
    
    public void returnOrder(){
 
        recepient = menus + "/" + totalPrice + "/" + requestText;
        
    }
       
    
    public  void setMenuState(State state) {
        String menuType;
    }
    public boolean removeMenu() {
        if(checkOrder()) {
            menus.removeAll(menus);
            return true;
        }
        return false;
    }
    public State getState() {
        return this.state;
    }
    public void BeforeOrder() {
        state.Before_Order(this);
    }
    public void CompleteOrder() {
        state.Complete_Order(this);
    }
    private boolean checkOrder() {
        if(menus.isEmpty())
            return false;
        return true;
    }
    public String getRecepient() {
        return this.recepient;
    }
}
