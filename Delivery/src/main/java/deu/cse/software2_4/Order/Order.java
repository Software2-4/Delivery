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
    protected List<String> menus;
    protected int totalPrice;
    protected String requestText;
    private State state;
    private String recepient;
    
    public Order() {
        this.state = new BeforeOrder();
    }
    
    protected abstract void request(String requestText);
    
//    public void setmenus(List<String> menus){
//        this.menus = menus;
//    }
//    public void setTotalPrice(int totalPrice){
//        this.totalPrice = totalPrice;
//    }
    
    public String returnOrder(){
        recepient = menus + "/" + totalPrice + "/" + requestText;
        return recepient;
    }
       
    
    public  void setMenuState(State state) {
        this.state = state;
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
