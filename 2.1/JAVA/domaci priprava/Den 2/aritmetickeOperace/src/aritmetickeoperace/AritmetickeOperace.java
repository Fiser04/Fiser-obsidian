//Den 2
/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package aritmetickeoperace;

/**
 *
 * @author fiser
 */
public class AritmetickeOperace {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int x = 10;
        int y = 2;
        int z;
        
       z = x + y; //scitani
       z = x - y; //odecitani
       z = x * y; //nasobeni
       z = x / y; //deleni
       z = x % y; //modulo
       System.out.printf("%d\n", z);
       
       x = x + y;
       x += y; //totozne s tim co je nad tim
       x -= y;
       x *= y;
       x /= y;
       x %= y;
       System.out.printf("%d\n", x);
       
       x++; //plus 1
       x--; //minus 1
       
       //PEMDAS
       double result = 3 + 4 * (7 - 5) / 2.0;
       // neboli resi se to jako v matice -> nejdrive zavorky, pak nasobeni/deleni a pak scitani/odcitani
       
    }
    
}
