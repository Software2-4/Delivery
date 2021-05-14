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
public class Waitress {
    ResturantComponent allResturants;

    public Waitress(ResturantComponent getAllResturants) {
        this.allResturants = getAllResturants;
    }
    public void printResturant() {
        allResturants.print();
    }
}
