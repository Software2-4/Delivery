/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.test;

import java.util.*;
  
public class Return_book implements Observer, DisplayElement {

    private int id;
    private String title;
    private String genre;
    private String author;
    private String status;
    private int count;
    private Subject bookData;

  public Return_book(Subject subject) {
    this.bookData = subject;
    bookData.registerObserver(this);
  }

  @Override
public void update(int id, String title, String genre,String author,String status,int count) //주체에서 데이터의 변경사항을 전달 받기 위한 메서드
 {
        this.id = id;
        this.title = title;
        this.genre = genre;
        this.author = author;
        this.status = status;
        this.count = count;
    display();
  }

  @Override
  public void display() {
    System.out.println(" " +
        id + " " + title + " "+genre+" "+author+" "+status+" "+count);
  }

}