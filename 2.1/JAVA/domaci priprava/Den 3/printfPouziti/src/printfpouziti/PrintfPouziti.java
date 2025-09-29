//Den 3
/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package printfpouziti;

/**
 *
 * @author fiser
 */
public class PrintfPouziti {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        String jmeno = "Havel";
        char zavinac = '@';
        int vek = 20;
        double vyska = 185.59;
        boolean jeStudent = true;
        //s (string) = string, char
        //d (decimal) = int
        //f (float) = double, float -> zaklad je 6 desetinych mist, pomoci .xf jde nastavit pocet mist (%.3f = 3 desetina mista)
            //lze pomoci flagu poupravovat output
                //+
                    //System.out.printf("%+.2f\n", vyska);
                    //+185.59
                //,
                    //a = 10000.0;
                    //System.out.printf("%,.2f\n", a);
                    //10,000.00
                //(
                    //u negativnich cisel je obali zavorkou
                    //a = -500.0;
                    //System.out.printf("%(.2f\n", a);
                    //(500.00)
                //mezernik
                    //u kladnych cisel prida mezeru aby to bylo zarovnane s minusem
                    //a = -3.0;
                    //b = 5.0;
                    //System.out.printf("% .2f\n", a);
                    //System.out.printf("% .2f\n", b);
                    //-3.00
                    // 5.00
                //cislo
                    //jakoby zarovnani, kdyz pred nej dam 0, tak to vyplni nulama, kdyz dam misto 0 minus tak z toho budou cisla v levo a + v pravo, zbytek vyplni
        //b (boolean) = boolean
        System.out.printf("Ahoj %s,\ntvoje emailova adresa je %s%sgoogle.com,\nje ti prave %d let,\nprave mas %.2fcm a status studenta je %b.\n", jmeno, jmeno.toLowerCase(), zavinac, vek, vyska, jeStudent);
        
    }
    
}
