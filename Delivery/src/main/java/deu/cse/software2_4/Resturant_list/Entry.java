/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package deu.cse.software2_4.Resturant_list;

import java.util.ArrayList;

/**
 *
 * @author YOU
 */
public abstract class Entry {

    public abstract String getName();


    public Entry add(Entry entry) throws FileTreatmentException {
        throw new FileTreatmentException();
    }

    public void printList() {
        printList("");
    }

    protected abstract void printList(String prefix);
    protected abstract ArrayList<Entry> getList();

    public String toString() {
        return getName() ;
    }
}
