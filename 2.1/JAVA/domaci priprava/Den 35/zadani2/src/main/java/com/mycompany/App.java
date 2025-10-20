package com.mycompany;

/**
Úkol: Vytvořte program pro evidenci objednávek. Zákazník má jméno a adresu.
Objednávka patří konkrétnímu zákazníkovi a obsahuje seznam objednaných položek (název, množství, cena za kus).
Program musí umět:
    Přidat zákazníka.
    Vytvořit pro zákazníka novou objednávku a přidat do ní položky.
    Pro danou objednávku vypočítat celkovou cenu.
    Zobrazit všechny objednávky konkrétního zákazníka.
    Uložit data (zákazníky a jejich objednávky) do souboru.
Pokrytá látka: Třídy a objekty II, kompozice (Zákazník → seznam Objednávek → seznam Položek),
binární soubory, práce s kolekcemi.
 */
public class App {

    public static void main(String[] args) {
        Ustredna ustredna = new Ustredna();

        /* Zakaznik zakaznik1 = new Zakaznik("Josef", "Hrabal", "Dub 1312");
        Zakaznik zakaznik2 = new Zakaznik("Karel", "Hynek", "Vysocina 9");
        Zakaznik zakaznik3 = new Zakaznik("Tomas", "Skrbek", "Doma 0");

        Objednavka objednavka1 = new Objednavka(0, zakaznik1);
        objednavka1.pridejPolozku(new Zbozi("Jablko", 20), 3);
        objednavka1.pridejPolozku(new Zbozi("Hrusky", 30), 4);

        Objednavka objednavka2 = new Objednavka(1, zakaznik1);
        objednavka2.pridejPolozku(new Zbozi("Kladivo", 300), 1);
        objednavka2.pridejPolozku(new Zbozi("Hrebik", 3), 80);

        Objednavka objednavka3 = new Objednavka(2, zakaznik3);
        objednavka3.pridejPolozku(new Zbozi("Kladivo", 300), 1);
        objednavka3.pridejPolozku(new Zbozi("Hrebik", 3), 80);

        ustredna.pridatObjednavku(objednavka1);
        ustredna.pridatObjednavku(objednavka2);
        ustredna.pridatObjednavku(objednavka3);
*/
        ustredna.vypisObjednavkyJednoho("Josef", "Hrabal");

        ustredna.ulozitDoSouboru();
    }
}
