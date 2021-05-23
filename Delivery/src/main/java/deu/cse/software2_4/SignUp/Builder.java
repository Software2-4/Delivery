/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package deu.cse.software2_4.SignUp;

/**
 *
 * @author tlatl
 */
public abstract class Builder {
    protected User user;
    
    public void createUser() {
        
    }

    public abstract Builder buildName(String name);

    public abstract Builder buildID(String id);

    public abstract Builder buildPW(String pw);

    public abstract Builder buildPhone(String phone);

    public abstract Builder buildResidentnum(String residentnum);

    public abstract Builder buildAddress(String address);

    public abstract Builder buildOnernum(String onernum);

    public abstract User getUser();
    
    public abstract User build();
}
