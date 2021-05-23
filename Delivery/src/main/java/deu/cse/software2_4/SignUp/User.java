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
public class User {
    
    private String name;
    private String id;
    private String pw;
    private String residentnum;
    private String phone;
    private String address;
    private String onernum;
    
    User(String name, String id, String pw, String residentnum, String phone, String address, String onernum) {
        this.name = name;
        this.id = id;
        this.pw = pw;
        this.residentnum = residentnum;
        this.phone = phone;
        this.address = address;
        this.onernum = onernum;
    }
    User(String name, String id, String pw, String residentnum, String phone, String address) {
        this.name = name;
        this.id = id;
        this.pw = pw;
        this.residentnum = residentnum;
        this.phone = phone;
        this.address = address;
        this.onernum = "";
    }
    @Override
    public String toString() {
        return  name + "/" + residentnum + "/" + phone + "/" + address + "/" + id  + "/" + pw + "/" + onernum ;
    }    
}
