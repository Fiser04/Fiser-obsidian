//Den 9
package kviz;

import java.util.Scanner;

public class Kviz {

    static String[] otazky = {
        "1. Které zvíře je největší savec na světě?",
        "2. Jaké zvíře je známé svou pomalostí a žije v deštných pralesech Jižní Ameriky?",
        "3. Jaké zvíře je nejrychlejší na souši?",
        "4. Který pták neumí létat, ale umí skvěle plavat?"
    };
    static String[][] odpovedi = {
        {"1) Slon africký", "2) Velryba modrá", "3) Žirafa", "4) Hroch"},
        {"1) Lenochod", "2) Koala", "3) Panda", "4) Tapír"},
        {"1) Gepard", "2) Lev", "3) Kůň", "4) Klokan"},
        {"1) Pštros", "2) Tučňák", "3) Kiwi", "4) Emu"}
    };

    static int[] odpovedSpravnaInt = {2, 1, 1, 2};

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        do {
            try {
                System.out.println("odpovezte q pro ukonceni");
                printOtazky();
                String vstupOtazka = sc.nextLine();
                if (jeQ(vstupOtazka)) {
                    break;
                }
                int indexOtazka = Integer.parseInt(vstupOtazka);
                printOdpovedi(indexOtazka - 1);
                String vstupOdpoved = sc.nextLine();
                if (jeQ(vstupOdpoved)) {
                    break;
                }
                int indexOdpoved = Integer.parseInt(vstupOdpoved);
                kontrolaOdpovedi(indexOtazka, indexOdpoved);

            } catch (Exception e) {
                System.out.println("Neplatny input");
            }
        } while (true);

        sc.close();
    }
    
    static boolean jeQ(String vstup){
        return vstup.equalsIgnoreCase("q");
    }

    static void printOtazky() {
        for (String otazka : otazky) {
            System.out.println(otazka);
        }
    }

    static void printOdpovedi(int vyber) {
        for (int i = 0; i < (odpovedi[vyber]).length; i++) {
            System.out.println(odpovedi[vyber][i]);
        }
    }

    static void kontrolaOdpovedi(int indexOtazka, int indexOdpoved) throws Exception {
        if (indexOdpoved > 0 && indexOdpoved <= odpovedi[indexOtazka].length) {
            if (indexOdpoved == odpovedSpravnaInt[indexOtazka - 1]){
                System.out.println("Spravne");
            } else {
                System.out.println("Spatne");
            }
            
        } else {
            throw new Exception();
        }

    }
}
