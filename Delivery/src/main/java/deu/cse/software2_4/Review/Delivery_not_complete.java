package deu.cse.software2_4.Review;

public class Delivery_not_complete implements State {

    private Delivery_not_complete(){}
    private static Delivery_not_complete modify;
    public static Delivery_not_complete getInstance(){
       if(modify ==null)
           modify = new Delivery_not_complete();
       return modify;
    }

    @Override
    public void now_state() {
        System.out.println("배달 중인 상태");
    }
    
    @Override
    public void delivery_suss() {
        
        System.out.println("배달완료로 전환");
        EditEngine.setState(Delivery_complete.getInstance());
    }

    @Override
    public void open() {
        
        System.out.println("배달 중 이라서 리뷰 작성 못함");
    }

    @Override
    public void close() {
        
        System.out.println("배달 중 이라서 리뷰 작성 못함");        
    }

    @Override
    public void save() {
        
        System.out.println("배달 중 이라서 리뷰 작성 못함");
    }

//    @Override
//    public void edit(String txt) {
//        
//        System.out.println("배달 중 이라서 리뷰 작성 못함");
//    }
    
}