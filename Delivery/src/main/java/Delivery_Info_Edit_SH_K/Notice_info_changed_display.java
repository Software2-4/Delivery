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
public class Notice_info_changed_display implements Observer, DisplayElement {
    
    private String before_call_num; // 변경 전 전화번호
    private String before_open_info; // 변경 전 영업상태
    Restaurant_info res_info;    
    
    private String changed_call_num; // 변경 후 전화번호
    private String changed_open_info; // 변경 후 영업상태
    
    public Notice_info_changed_display(Subject restaurant_info) {
        
        restaurant_info.registerObserver(this);
        res_info = (Restaurant_info) restaurant_info;
        
        before_call_num = res_info.getCall_num();
        before_open_info = res_info.getRun_info();
    }
        
    @Override
    public void update(String restaurant_call_number, String open_info) {

        //System.out.println("Update at Current");
        this.changed_call_num = restaurant_call_number;
        this.changed_open_info = open_info;
        display();
    }

    @Override
    public void display() {
        
        System.out.println(changed_call_num + "\t" + res_info.getCall_num());
        System.out.println(changed_open_info + "\t" + before_open_info);
        
//        if((changed_call_num.equals(this.before_call_num)) == true || 
//          (changed_open_info.equals(this.before_open_info)) == true ){
//            System.out.println("Info not changed");   
//        }
//        
//        else{
//            System.out.print("Info changed! display() at Current");
//            System.out.println("전화번호: " + changed_call_num +"\t" + "영업상태:" + changed_open_info);
//        }

    }
}
