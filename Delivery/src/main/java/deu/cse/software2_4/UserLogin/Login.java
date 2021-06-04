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
    private static String bossnum;
    private static String returnid;
    private Login_strategy login_strategy;
    boolean is_businessnum_null;
    
    
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
    
    public void setBossnum(String bossnum){
        this.bossnum = bossnum;
    }
    
    public String getBossnum(){
        return bossnum;
    }
    
    public void setReturnid(String returnid){
        this.returnid = returnid;
    }
    public String getReturnid(){
        return returnid;
    }
}
