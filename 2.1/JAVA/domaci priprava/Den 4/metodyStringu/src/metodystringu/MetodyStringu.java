//Den 4
/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package metodystringu;

/**
 *
 * @author fiser
 */
public class MetodyStringu {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        String jmeno = "Havel Jan";
        
        //pocet charakteru
        int delka = jmeno.length();
        System.out.println(delka);
        
        //pismeno/znak na pozici
        char pismeno = jmeno.charAt(0);
        System.out.println(pismeno);
        
        //na jake pozici je znak
        int index = jmeno.indexOf("a"); //prvni pozice kde je znak
        System.out.println(index);
        int indexLast = jmeno.lastIndexOf("a"); //posledni pozice kde je znak
        System.out.println(indexLast);
        
        //zmena velikosti pisma (caps vs no caps)
        String jmenoVelkym = jmeno.toUpperCase();
        System.out.println(jmenoVelkym);
        String jmenoMalym = jmeno.toLowerCase();
        System.out.println(jmenoMalym);
        
        //odstraneni "deadspacu", proste odstrani zbytecne mezery
        String jmenoMezery = "      Jan Havel     ";
        jmenoMezery = jmenoMezery.trim();
        System.out.println(jmenoMezery);
        
        //replace charakteru
        String jmenoReplaced = jmeno.replace("a", "o");
        System.out.println(jmenoReplaced);
        
        //je prazdne?
        String jmenoPrazdne = "";
        System.out.println(jmenoPrazdne.isEmpty());
        
        //obsahuje string toto?
        String jmenoObsah = "Cheba/";
        System.out.println((jmenoObsah.contains("/")));
        
        //jsou stejne?
        String nazev1 = "robot";
        String nazev2 = "clovek";
        System.out.println((nazev1.equals("robot"))); //ale toto reseni je case sensitivni
        System.out.println(nazev1.equals(nazev2));
        
        //jsou stejne bez case sensitivity?
        String osoba = "karel";
        System.out.println((osoba.equalsIgnoreCase("Karel")));
    }
    
}
