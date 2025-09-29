/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package vnorenyif;

/**
 *
 * @author fiser
 */
public class VnorenyIf {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        boolean jeStudent = true;
        boolean jeMladsiJak18 = true;
        double castkaOrigo = 259.99;
        char procento = '%';
        
        if(jeStudent){
            if(jeMladsiJak18){
                System.out.printf("Dostavas slevu pro deti ve vysi 20%s a zaroven studentskou slevu ve vysi 10%s, celkova cena je %.2f.\n", procento, procento, castkaOrigo * 0.70);
            }else{
            System.out.printf("Dostavas studenskou slevu 10%s, celkova cena je tedy %.2f.\n", procento, castkaOrigo * 0.9);
            }
        }else{
            if(jeMladsiJak18){
                System.out.printf("Dostavas slevu pro deti ve vysi 20%s, celkova castka je %.2f.\n", procento, castkaOrigo * 0.8);
            }else{
            System.out.printf("Nemas slevu, celkova cena je %.2f.\n",castkaOrigo);
            }
        }
        
    }
    
}
