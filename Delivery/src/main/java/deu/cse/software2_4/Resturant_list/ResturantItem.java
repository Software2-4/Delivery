/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package deu.cse.software2_4.Resturant_list;

/**
 *
 * @author tlatl
 */
public class ResturantItem extends ResturantComponent {

    private String r_name;
    //private String r_time;
    

    public ResturantItem(String r_name) {
        this.r_name = r_name;
    }

    @Override
    public String get_r_Name() {
        return r_name;
    }
    
//    @Override
//    public String get_r_Time() {
//        return r_time;
//    }
    

    @Override
    public void print() {
        System.out.print(get_r_Name());
//        System.out.println(", " + get_r_Time());
//        System.out.println(" -- " + getDescription());
    }
}
