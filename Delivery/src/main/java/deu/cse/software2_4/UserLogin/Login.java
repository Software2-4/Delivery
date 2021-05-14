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
public class Login {
    
    String ID;
    String PW;
    private Login_strategy login_strategy;
    boolean is_businessnum_null;
    
    //ID, PW등을 DB에서 가져온다
    //ID, PW등을 가져온 후 사용자가 입력한 정보와 일치하는지 출력한다.
    
    public void setLogin_strategy(Login_strategy login_strategy){
        
        this.login_strategy = login_strategy;
    }
    
    public void loginscreen(){
        
        if(login_strategy == null){
         
            System.out.println("Failed to Login"); 
        }   
        
        else    
            login_strategy.loginscreen();
        
    }
    
}
