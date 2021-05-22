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
public class Info_edit_Main{
        
    public static void main(String[] args) {

        Restaurant_info res_info = new Restaurant_info();    
        
        Current_Statue_Display current = new Current_Statue_Display(res_info);
        Notice_info_changed_display notice = new Notice_info_changed_display(res_info);
        
        res_info.setMeasurements("111", "Open");
        res_info.setMeasurements("1112", "Open");
          
    }
}
