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
public class NoOptionOrder extends Order {
    public NoOptionOrder(List<String> menus, int totalPrice) {
        this.menus = menus;
        this.totalPrice = totalPrice;
    }
    @Override
    protected void request(String requestText){
        this.requestText = requestText;
    }

    
}
