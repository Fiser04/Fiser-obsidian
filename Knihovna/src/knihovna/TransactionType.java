/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Enum.java to edit this template
 */
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
