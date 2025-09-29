//Den 8
/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package varargs;

/**
 *
 * @author fiser
 */
public class VarArgs {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // nahrada overloaded method, methoda ktera veme ruzny pocet argumentu
        
        System.out.println(add(1, 2, 3));
        System.out.println(add(1, 2, 3, 4));
        System.out.println(avg(1, 3));
        
    }

    static int add(int... numbers) {
        int celek = 0;
        for (int num : numbers) {
            celek += num;
        }
        return celek;
    }
    static double avg(double... numbers){
        int celek = 0;
        for (double num : numbers){
        celek+=num;
        }
        return (celek/numbers.length);
    }
}
