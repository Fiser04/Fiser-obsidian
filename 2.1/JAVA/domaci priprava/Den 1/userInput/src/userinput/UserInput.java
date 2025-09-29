//Den 1
/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package userinput;

import java.util.Scanner; //import scanner

/**
 *
 * @author fiser
 */
public class UserInput {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in); //vytvoreni objektu scannaru
        // Pro string
            //jeden mozny zpusob zapisu/vypisu
            System.out.println("Napis sve jmeno");
            String jmeno = scanner.nextLine();
            System.out.println("Tve jmeno je " + jmeno);
        
            //druhy zpusob
            System.out.println("Napis sve jmeno");
            System.out.printf("Tve jmeno je %s\n", scanner.nextLine()); //vnoreny zpusob
        
        // Pro int
            System.out.print("Kolik ti je let? ");
            System.out.printf("Je ti prave %d\n", scanner.nextInt());
         
        // Pro double
            System.out.println("Kolik to stoji?");
            System.out.printf("Stoji to %f\n", scanner.nextDouble());
            
        // Pro boolean
            System.out.println("Jsi student? (true/false)");
            System.out.printf("Student: %b\n", scanner.nextBoolean());
            
        //znamy problem
            System.out.println("Kolik ti je let?");
            int vek = scanner.nextInt();
            System.out.println("Napis svoje prijmeni");
            String prijmeni = scanner.nextLine();
            System.out.printf("Tve prijmeni je %s a je ti %d.\n", prijmeni, vek);
            /*
            problem spociva v zanechavani znaku, kdyz zmacknu enter tak je to \n, takze input\n,
            to \n se pak predava tomu stringu a veme to jako input
            */
            //reseni (clearing input buffer)
            System.out.println("Kolik ti je let?");
            int vekR = scanner.nextInt();
            scanner.nextLine(); //proste to chytim, je to \n, takze stejne to hned skippne
            System.out.println("Napis svoje prijmeni");
            String prijmeniR = scanner.nextLine();
            System.out.printf("Tve prijmeni je %s a je ti %d.\n", prijmeniR, vekR);
        scanner.close(); //killnuti objektu
    }
    
}
