/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Delivery_Info_Edit_SH_K;

/**
 *   
 * @author YOU
 */
public class Current_Statue_Display implements Observer, DisplayElement {
    
    private String call_num;
    private String open_info;
    private Subject res_info;

    public String getCall_num() {
        return call_num;
    }

    public String getOpen_info() {
        return open_info;
    }
        
    public Current_Statue_Display(Subject res_info) {

        this.res_info = res_info;
        res_info.registerObserver(this);
       
    }

    @Override
    public void update(String restaurant_call_number, String open_info) {

        //System.out.println("Update at Current");
        this.call_num = restaurant_call_number;
        this.open_info = open_info;
        display();
    }

    @Override
    public void display() {
        System.out.println("전화번호: " + this.call_num + " " + "영업상태: " + this.open_info);        
    }
    
}
