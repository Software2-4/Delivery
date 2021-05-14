/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package deu.cse.software2_4.delivery;

/**
 *
 * @author YOU
 */
public class Card_Purchase implements Payment{

    @Override
    public void pay(int amount, String option) {
        
        System.out.println(amount + "원 카드결제 입니다.");       
        
    }
    
}
