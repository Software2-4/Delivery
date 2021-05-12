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
public class User {
    private String name;
    private String id;
    private String pw;
    private String phone;

    public void setName(String name) {
        this.name = name;
    }

    public void setID(String id) {
        this.id = id;
    }

    public void setPW(String pw) {
        this.pw = pw;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    @Override
    public String toString() {
        return  name + "," + id + "," + pw + "," + phone ;
    }    
}
