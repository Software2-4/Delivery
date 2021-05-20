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
import java.util.ArrayList;
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
//        try {
//            FileInputStream input = new FileInputStream("C:\\DB\\Resturant.txt");
//            InputStreamReader reader = new InputStreamReader(input, "UTF-8");
//            BufferedReader in = new BufferedReader(reader);
//
//            FileInputStream menuF = new FileInputStream("C:\\DB\\Menu.txt");
//            InputStreamReader menu_reader = new InputStreamReader(menuF, "UTF-8");
//            BufferedReader menuBR = new BufferedReader(menu_reader);
//
//            String resturant;
//            String menu;
//            String temp = "";
//            
//            Entry town = new Directory("A동");
//            town.add(town);
//            Directory type_of_foodK = new Directory("한식");
//            town.add(type_of_foodK);
//            
//            while ((resturant = in.readLine()) != null) {
//                String resturant_arr[] = resturant.split("/");
//                
//                if (resturant_arr[2].equals("A동") && resturant_arr[4].equals("한식")) {
//                    Directory restaurant_name = new Directory(resturant_arr[1]);
//                    type_of_foodK.add(restaurant_name);
//                    
//                    while ((menu = menuBR.readLine()) != null) {
//                        String menu_arr[] = menu.split("/");
//                        
//                        if (resturant_arr[1].equals(menu_arr[0])) {
//                            temp += (menu_arr[2] + "/");
//                        }
//                        
//                    }
//                    Directory menu_name = new Directory(temp);
//                    restaurant_name.add(menu_name);
//                    
//                }
//                
//            }
//             town.printList();
//             
//             in.close();
//
//        } catch (FileNotFoundException ex) {
//            Logger.getLogger(Main.class.getName()).log(Level.SEVERE, null, ex);
//        } catch (UnsupportedEncodingException ex) {
//            Logger.getLogger(Main.class.getName()).log(Level.SEVERE, null, ex);
//        } catch (IOException ex) {
//            Logger.getLogger(Main.class.getName()).log(Level.SEVERE, null, ex);
//        }
//    }
}
}