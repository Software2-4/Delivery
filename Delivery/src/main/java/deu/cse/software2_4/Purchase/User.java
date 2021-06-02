package deu.cse.software2_4.Purchase;


public class User{

    private Purchase purchase;
    
    public void setMeasurement(Purchase which_way){
        
        this.purchase = which_way;
    }
    
    public String doPurchase(String total) {
        
        return purchase.doPurchase(total);
    }
}
