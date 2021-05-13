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
public class Consumer_Login implements Login_strategy{

    @Override
    public void loginscreen() {
        
        System.out.println("Hello Consumer!");
        
        UserloginModel object = new UserloginModel();
        object.setVisible(true);
    }
    
}
