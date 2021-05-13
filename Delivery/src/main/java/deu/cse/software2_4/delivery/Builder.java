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
public abstract class Builder {
    protected User user;
    
    public void createUser() {
        user = new User();
    }

    public abstract void buildName();

    public abstract void buildID();

    public abstract void buildPW();

    public abstract void buildPhone();

    public abstract void buildResidentnum();

    public abstract void buildAddress();

    public abstract void buildOnernum();

    public abstract User getUser();
}
