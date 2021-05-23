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
public class UserBuilder extends Builder {
    
    private String name;
    private String id;
    private String pw;
    private String residentnum;
    private String phone;
    private String address;
    private String onernum;
    private EnumUserRole role;
    
//    public UserBuilder(String name, String id, String pw, String residentnum, String phone, String address, String onernum ){
//        this.name = name;
//        this.id = id;
//        this.pw = pw;
//        this.residentnum = residentnum;
//        this.phone = phone;
//        this.address = address;
//        this.onernum = onernum;
//    }
    public UserBuilder(EnumUserRole role) {
        this.role = role;
        
    }
     @Override
    public Builder buildName(String name) {
        this.name = name;
        return this;
    }

    @Override
    public Builder buildID(String id) {
        this.id = id;
        return this;
    }

    @Override
    public Builder buildPW(String pw) {
        this.pw = pw;
        return this;
    }

    @Override
    public Builder buildResidentnum(String residentnum) {
        this.residentnum = residentnum;
        return this;
    }
    
    @Override
    public Builder buildPhone(String phone) {
        this.phone = phone;
        return this;
    }

    @Override
    public Builder buildAddress(String address) {
        this.address = address;
        return this;
    }
    
    @Override
    public Builder buildOnernum(String onernum) {
        this.onernum = onernum;
        return this;
    }
    
    @Override
    public User getUser() {
        return user;
    }

    @Override
    public User build() {
        if(this.role == EnumUserRole.OWNER) 
            return new User(this.name,this.id,this.pw,this.residentnum,this.phone,this.address,this.onernum);
        else if(this.role == EnumUserRole.USER)
            return new User(this.name,this.id,this.pw,this.residentnum,this.phone,this.address);
        
        return new User(this.name,this.id,this.pw,this.residentnum,this.phone,this.address);


    }
    
}
