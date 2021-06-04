/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package deu.cse.software2_4.Order;

/**
 *
 * @author gyueop
 */
public class BeforeOrder implements State{

    @Override
    public void Before_Order(Order order) {
        
    }

    @Override
    public void Complete_Order(Order order) {
        order.setMenuState(new CompleteOrder());
    }
    
}
