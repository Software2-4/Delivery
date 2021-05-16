/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package deu.cse.software2_4.Resturant_list;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.UnsupportedEncodingException;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author YOU
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        try {
            FileInputStream input = new FileInputStream("C:\\DB\\Resturant.txt");
            InputStreamReader reader = new InputStreamReader(input, "UTF-8");
            BufferedReader in = new BufferedReader(reader);

            FileInputStream menuF = new FileInputStream("C:\\DB\\Resturant.txt");
            InputStreamReader menu_reader = new InputStreamReader(input, "UTF-8");
            BufferedReader menuBR = new BufferedReader(reader);

            String resturant;
            String menu;
            Directory town = new Directory("A동");
            Directory type_of_foodK = new Directory("한식");
            town.add(type_of_foodK);
            while ((resturant = in.readLine()) != null) {
                String resturant_arr[] = resturant.split("/");
                while ((menu = menuBR.readLine()) != null) {
                    String menu_arr[] = menu.split("/");
                    if (resturant_arr[2].equals("A동") && resturant_arr[4].equals("한식")) {
                        Directory restaurant_name = new Directory(resturant_arr[1]);
                        type_of_foodK.add(restaurant_name);
                        if(resturant_arr[1].equals(menu_arr[0])){
                            Directory menu_name = new Directory(menu_arr[2]);
                            restaurant_name.add(menu_name);
                        }
                    }
                }
            }
            town.printList();

            in.close();

        } catch (FileNotFoundException ex) {
            Logger.getLogger(Main.class.getName()).log(Level.SEVERE, null, ex);
        } catch (UnsupportedEncodingException ex) {
            Logger.getLogger(Main.class.getName()).log(Level.SEVERE, null, ex);
        } catch (IOException ex) {
            Logger.getLogger(Main.class.getName()).log(Level.SEVERE, null, ex);
        }

//        try {
//            System.out.println("Making root entries...");
//            Directory town = new Directory("A동");
//
//            Directory type_of_foodK = new Directory("한식");
//            Directory type_of_foodJ = new Directory("일식");
//
//            Directory restaurant_name = new Directory("식당1");
//
//            town.add(type_of_foodK);
//            town.add(type_of_foodJ);
//
//            type_of_foodK.add(restaurant_name);
//            type_of_foodJ.add(restaurant_name);
//
//            town.printList();
//
//        } catch (FileTreatmentException e) {
//            e.printStackTrace();
//        }
    }
}
