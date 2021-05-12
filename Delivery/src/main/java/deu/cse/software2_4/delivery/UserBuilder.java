/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package deu.cse.software2_4.delivery;

import java.util.Scanner;


/**
 *
 * @author tlatl
 */
public class UserBuilder extends Builder {
    Scanner scan = new Scanner(System.in);
    String str = scan.nextLine();
    
    String arr[] = str.split(" ");
    
     @Override
    public void buildName() {
        user.setName(arr[0]);
    }

    @Override
    public void buildID() {
        user.setID(arr[1]);
    }

    @Override
    public void buildPW() {
        user.setPW(arr[2]);
    }

    @Override
    public void buildPhone() {
        user.setPhone(arr[3]);
    }

    @Override
    public User getUser() {
        return user;
    }
}
