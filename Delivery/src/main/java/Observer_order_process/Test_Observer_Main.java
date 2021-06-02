/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Observer_order_process;

/**
 *
 * @author YOU
 */
public class Test_Observer_Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Notice notice = new Notice();
        User1 user1 = new User1("손님1");
        User2 user2 = new User2("손님2");
        
        notice.attach(user1);
        notice.attach(user2);
       
        String msg = "배달중입니다~!";
        notice.notifyObservers(msg); // 옵저버에 손님1, 손님2가 제대로 추가되었는지 확인

        notice.detach(user1); // user1 공지사항 받는 대상에서 제거, user1은 배달완료
        msg = "배달중입니다~!";
        notice.notifyObservers(msg); // 옵저버에 손님1이 제대로 제거되었는지 확인
    }
    
}
