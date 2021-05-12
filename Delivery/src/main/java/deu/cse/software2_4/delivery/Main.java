/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package deu.cse.software2_4.delivery;

/**
 *
 * @author tlatl
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        Builder onerBuilder = new OnerBuilder();
        Director director = new Director(onerBuilder);
        director.build();

        User user1 = director.getUser();
        System.out.println(user1);

        Builder userBuilder = new UserBuilder();
        director = new Director(userBuilder);
        director.build();

        User user2 = director.getUser();
        System.out.println(user2);
    }
    
}
