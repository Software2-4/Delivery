/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package deu.cse.software2_4.UserLogin;


/**
 *
 * @author YOU
 */
public class Business_Login implements Login_strategy{

    @Override
    public void loginscreen() {
    
        System.out.println("Hello Business!");
        
        OnerLoginModel object = new OnerLoginModel();
        object.setVisible(true);
    }
    
}
