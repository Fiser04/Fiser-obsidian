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

    public String getDesc() {
        return desc;
    }

    public void setDesc(String desc) {
        this.desc = desc;
    }

    @Override
    public String toString() {
        return "TransactionType{" + "ordinal=" + ordinal() + ", name=" + name() + ", desc=" + desc + '}';
    }
    
}
