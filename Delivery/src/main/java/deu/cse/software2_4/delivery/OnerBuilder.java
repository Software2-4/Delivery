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
public class OnerBuilder extends Builder{
     @Override
    public void buildName() {
        user.setName("콘트리트");
    }

    @Override
    public void buildID() {
        user.setID("철제");
    }

    @Override
    public void buildPW() {
        user.setPW("빨간 ");
    }

    @Override
    public void buildPhone() {
        user.setPhone("일반 ");
    }

    @Override
    public User getUser() {
        return user;
    }
}
