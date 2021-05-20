/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package deu.cse.software2_4.Resturant_list;

import java.util.Iterator;
import java.util.ArrayList;

/**
 *
 * @author YOU
 */
public class Directory extends Entry {

    private String name; // 디렉토리 이름
    private ArrayList directory = new ArrayList(); // 디렉토리 엔트리의 집합
    
    public Directory(String name) {
        this.name = name;
    }

    @Override
    public String getName() {
        // 이름을 얻는다
        return name;
    }


    @Override
    public Entry add(Entry entry) {
        // 엔트리 추가
        directory.add(entry);
        return this;
    }

    @Override
    protected void printList(String prefix) {
        System.out.println(prefix + "/" + this);
        
        Iterator it = directory.iterator();
        
        while (it.hasNext()) {
            Entry entry = (Entry) it.next();
            entry.printList(prefix + "/" + name);
        }
    }
    
    @Override
    protected ArrayList<Entry> getList() {
        return this.directory;
    }
}
