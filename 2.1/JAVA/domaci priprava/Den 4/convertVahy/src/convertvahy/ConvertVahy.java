//Den 4
/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package convertvahy;

import java.util.Scanner;

/**
 *
 * @author fiser
 */
public class ConvertVahy {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //ano slo by to ze by se pozival jen jeden double, ale takhle mi prijde ze jde rychleji videt co se deje
        //vysledek = sc.nextDouble * & / konstanta
        //nebo by to slo narvat i bez nej jen do printu
        //System.out.println("prevedena hodnota se rovna " + (sc.nextDouble * & / konstanta));
        //slo by taky ten double zkratit
        //System.out.printf("%.2f", (sc.nextDouble * & / konstanta));
        Scanner sc = new Scanner(System.in);
        double kg;
        double lbs;
        int typVyberu;
        final double constantaPrevodu = 0.45359237;

        try {
            System.out.printf("1: KG -> LBS\n2: LBS -> KG\nProsim vyberte moznost: ");
            typVyberu = sc.nextInt();
            
            if (typVyberu == 1) {
                System.out.print("Vlozte kolik kilo chcete prevest: ");
                kg = sc.nextDouble();
                lbs = kg / constantaPrevodu;
                System.out.println(kg + " kg je presne " + lbs + " liber");
            } else if (typVyberu == 2) {
                System.out.print("Vlozte kolik liber chcete prevest: ");
                lbs = sc.nextDouble();
                kg = lbs * constantaPrevodu;
                System.out.println(lbs + " liber je presne " + kg + " kilo");
            } else {
                throw new Exception();
            }
        } catch (Exception e) {
            System.out.println("Neplatny input");
        }

        sc.close();
    }

}
