/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Observer_order_process;

/**
 *
 * @author YOU
 */
public class Observer {
    
    public String msg;
    
    public void receive(String msg){
        System.out.println(this.msg + "에서 메시지를 받음: " + msg);
    }
}
