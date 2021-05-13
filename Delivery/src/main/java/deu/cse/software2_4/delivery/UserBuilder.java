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
public class UserBuilder extends Builder {
    
    private String name;
    private String id;
    private String pw;
    private String residentnum;
    private String phone;
    private String address;
    private String onernum;
    
    public UserBuilder(String name, String id, String pw, String residentnum, String phone, String address, String onernum ){
        this.name = name;
        this.id = id;
        this.pw = pw;
        this.residentnum = residentnum;
        this.phone = phone;
        this.address = address;
        this.onernum = onernum;
    }
     @Override
    public void buildName() {
        user.setName(name);
    }

    @Override
    public void buildID() {
        user.setID(id);
    }

    @Override
    public void buildPW() {
        user.setPW(pw);
    }

    @Override
    public void buildResidentnum() {
        user.setResidentnum(residentnum);
    }
    
    @Override
    public void buildPhone() {
        user.setPhone(phone);
    }

    @Override
    public void buildAddress() {
        user.setAddress(address);
    }
    
    @Override
    public void buildOnernum() {
        user.setOnernum(onernum);
    }
    
    @Override
    public User getUser() {
        return user;
    }
}
