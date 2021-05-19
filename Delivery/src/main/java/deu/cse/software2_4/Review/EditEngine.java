package deu.cse.software2_4.Review;

public class EditEngine {

    private static State myState = Delivery_not_complete.getInstance();
    
    public static void setState(State state){
       myState = state;
    }
    
    public void now_state(){
        myState.now_state();
    }
    
    public void delivery_suss(){
        myState.delivery_suss();
    }
        
    public void open(){
       myState.open();
    }
    
    public void close(){
       myState.close();
    }
        
    public void save(){
       myState.save();
    }
    
    //    public void edit(String text){
//       myState.edit(text);
//    }
}