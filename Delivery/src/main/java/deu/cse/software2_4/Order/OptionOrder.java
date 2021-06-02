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
public class OptionOrder extends Order {
    
    public OptionOrder(List<String> menus, int totalPrice) {
    }
    
    @Override
    protected void request(String requestText){
       this.requestText = requestText;
    }
}
