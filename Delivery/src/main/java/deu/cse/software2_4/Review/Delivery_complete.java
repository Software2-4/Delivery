package deu.cse.software2_4.Review;

public class Delivery_complete implements State {

    private Delivery_complete() {
    }
    private static Delivery_complete modify;

    public static Delivery_complete getInstance() {
        if (modify == null) {
            modify = new Delivery_complete();
        }
        return modify;
    }
    
    @Override
    public void now_state() {
        System.out.println("배달 완료상태");
    }
    
    @Override
    public void delivery_suss() {

        System.out.println("배달 완료, 상태 그대로임");
    }

    @Override
    public void open() {
        System.out.println("리뷰 작성 오픈.");
        //save();
    }

    @Override
    public void close() {
        System.out.println("리뷰가 수정되었습니다. Close");
        //save();
    }

    @Override
    public void save() {
        System.out.println("현재 리뷰를 저장합니다.");
        EditEngine.setState(Delivery_complete.getInstance());
    }

//    @Override
//    public void edit(String text) {
//        System.out.println("편집 상태 -> 편집상태 (상태변화없음)");
//
//    }

    
}
