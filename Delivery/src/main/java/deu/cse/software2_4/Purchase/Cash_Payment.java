/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package deu.cse.software2_4.Purchase;


/**
 *
 * @author YOU
 */
public class Cash_Payment implements Purchase {

    public Cash_Payment() {
        
        System.out.println("현금으로 결제합니다");
    }

    @Override
    public String doPurchase(String total) {
        
        System.out.println(total + "원 을 결제합니다." );
        return "현금으로 " + total + "원 을 결제합니다.";
    }

}
