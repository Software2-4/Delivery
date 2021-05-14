/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package deu.cse.software2_4.Resturant_list;


import java.util.ArrayList;

/**
 *
 * @author tlatl
 */
public class Menu extends ResturantComponent {
    private  ArrayList<ResturantComponent> resturantComponents;
    private String r_name;

    public Menu(String r_name) {
        resturantComponents = new ArrayList<>();
        this.r_name = r_name;
    }
    @Override
    public void add(ResturantComponent resturantComponent) {
        resturantComponents.add(resturantComponent);
    }
    @Override
    public String get_r_Name() {
        return r_name;
    }
    @Override
    public void print() {
        System.out.println(get_r_Name());
        for (ResturantComponent resturantComponent : resturantComponents) {
            resturantComponent.print();
        }
    }
}
