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
public class Director {
        private Builder builder;

    public Director(Builder builder) {
        this.builder = builder;
    }

    public void build() {
        builder.createUser();
        builder.buildName();
        builder.buildPhone();
        builder.buildID();
        builder.buildPW();
    }

    public User getUser() {
        return builder.getUser();
    }
}
