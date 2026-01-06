/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Enum.java to edit this template
 */
package auto;

/**
 *
 * @author fiser
 */
public enum PneuType {
    ZIMNI("w"),
    LETNI("s");
    private String type;

    private PneuType(String type) {
        this.type = type;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    @Override
    public String toString() {
        return "PneuType{" + "ordinal=" + ordinal() + ", name=" + name() + ", type=" + type + '}';
    }
    
    
}
