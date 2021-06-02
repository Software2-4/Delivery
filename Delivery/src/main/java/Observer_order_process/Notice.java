/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Observer_order_process;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author YOU
 */
public class Notice {

    private List<Observer> observers = new ArrayList<Observer>();

    public void attach(Observer observer) {
        System.out.println(observer.msg + "의 배달이 시작되었습니다!");
        observers.add(observer);
    }

    // 옵저버에서 제거
    public void detach(Observer observer) {
        System.out.println(observer.msg + "의 배달이 완료되었습니다!");
        observers.remove(observer);
    }

    // 옵저버들에게 알림
    public void notifyObservers(String msg) {
        for (Observer o : observers) {
            o.receive(msg);
        }
    }

}
