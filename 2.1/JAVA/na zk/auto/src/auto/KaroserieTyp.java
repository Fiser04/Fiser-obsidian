/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Enum.java to edit this template
 */
package auto;

/**
 *
 * @author fiser
 */
public enum KaroserieTyp {
    SEDAN("sedan"),
    HATCHBACK("hatchback");
    private String popis;

    private KaroserieTyp(String popis) {
        this.popis = popis;
    }
    
}
