package knihovna;

/**
 *
 * @author fiser
 */
public enum TransactionType {
    Borrow("zapujceni"),
    Return("vraceni");
    
    private String desc;    
    private TransactionType(String desc){
        this.desc = desc;
    }
    
    public String showDesc(){
        return this.desc;
    }
    
}
