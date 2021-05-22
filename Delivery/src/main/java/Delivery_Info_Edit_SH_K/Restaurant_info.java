/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Delivery_Info_Edit_SH_K;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author YOU
 */
public class Restaurant_info implements Subject {

    private List<Observer> observers;
    private String call_num;
    private String run_info;

     public Restaurant_info() {
        observers = new ArrayList<>();
    }
    
    public String getCall_num() {
        return call_num;
    }

    public String getRun_info() {
        return run_info;
    }   

    @Override
    public void registerObserver(Observer o) {
       // System.out.println("Observer Add");
        observers.add(o);
    }

    @Override
    public void removeObserver(Observer o) {
        //System.out.println("Remove Observer");
        
        int index = observers.indexOf(o);
        
        if (index >= 0) {
            observers.remove(o);
        }
    }

    @Override
    public void notifyObservers() {
        for(Observer observer : observers){
            observer.update(call_num, run_info);
        }                
    }
  
    public void measurementsChanged() {
        //System.out.println("값변화 at Restaurant_info");
        notifyObservers();
    }

  public void setMeasurements(String call_num, String run_info) {
      this.call_num = call_num;
      this.run_info = run_info;

      measurementsChanged();
  }
    
}