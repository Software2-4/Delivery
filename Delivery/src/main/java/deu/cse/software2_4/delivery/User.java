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
    private String residentnum;
    private String phone;
    private String address;
    private String onernum;
    

    public void setName(String name) {
        this.name = name;
    }

    public void setID(String id) {
        this.id = id;
    }

    public void setPW(String pw) {
        this.pw = pw;
    }

    public void setResidentnum(String residentnum) {
        this.residentnum = residentnum;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }
    
    public void setAddress(String address) {
        this.address = address;
    }
    
    public void setOnernum(String onernum) {
        this.onernum = onernum;
    }
    @Override
    public String toString() {
        return  name + "/" + residentnum + "/" + phone + "/" + address + "/" + id  + "/" + pw + "/" + onernum ;
    }    
}
