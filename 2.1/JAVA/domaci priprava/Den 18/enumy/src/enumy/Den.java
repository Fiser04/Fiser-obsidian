/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package enumy;

/**
 *
 * @author odkolin
 */
public enum Den {
    PONDELI(1), UTERY(2), STREDA(3), CTVRTEK(4), PATEK(5), SOBOTA(6), NEDELE(7);
    
    private final int denCislo;
    
    Den(int denCislo) {
        this.denCislo = denCislo;
    }
    
    public int getDenCislo(){
        return this.denCislo;
    }
    
}
