package com.mycompany;

/**
Úkol: Vytvořte program pro evidenci studentů a jejich známek. Student má rodné číslo, jméno, příjmení a seznam známek z předmětů.
Program musí umět:
    Přidat studenta.
    Přidat známku vyhledanému studentovi.
    Vypočítat a zobrazit průměr známek konkrétního studenta.
    Najít všechny studenty, jejichž průměr je horší než 2.5.
    Uložit a načíst celou evidenci do/z binárního souboru evidence.dat.
Pokrytá látka: Třídy a objekty II (kompozice - Student obsahuje seznam známek), binární soubory, výjimky, ArrayList, algoritmy pro výpočet průměru.
 */
public class App {

    public static void main(String[] args) {
        Evidence evidence = new Evidence();
        /*
        evidence.pridejStudenta(new Student(21313, "Karel", "Cerny"));
        evidence.pridejStudenta(new Student(23425, "Josef", "rumburak"));
        evidence.pridejStudenta(new Student(45353, "Lotrando", "Gondek"));
        evidence.pridejStudenta(new Student(56556, "Zubejda", "Krakonosova"));

        evidence.pridejZnamku(21313, 3);
        evidence.pridejZnamku(21313, 2);
        evidence.pridejZnamku(21313, 4);
        evidence.pridejZnamku(21313, 5);
*/
        //evidence.ulozitDoSouboru();
        evidence.nacistZSouboru();
        System.out.println(evidence.prumerZaka(21313));
    }
}
