//Den 6
/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package methody;

/**
 *
 * @author fiser
 */
public class Methody {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        String jmenoVMainu = "Jotaro";
        int vekVMainu = 21;
        double num = 9;
        printHappy();
        printHappyWithName(jmenoVMainu);
        printNameAge(jmenoVMainu, vekVMainu);
        System.out.printf("%.2f\n", sqrtNum(num));
        System.out.println(jePlnolety(vekVMainu));
    }

    static void printHappy() {
        System.out.println("i am happy");
        System.out.println("you happy");
        System.out.println("we happy");
    }

    static void printHappyWithName(String jmenoVMethode) {
        System.out.println("i am happy");
        System.out.println("you happy");
        System.out.printf("%s is happy\n", jmenoVMethode);
        System.out.println("we happy");
    }

    static void printNameAge(String name, int vek) {
        System.out.printf("Ahoj %s, je ti prave %d\n", name, vek);
    }

    static double sqrtNum(double num) {
        num = Math.pow(num, 2);
        return num;
    }
    
    static boolean jePlnolety(int vek){
        boolean result = (vek > 17) ? true : false;
        return result;
    }
}
