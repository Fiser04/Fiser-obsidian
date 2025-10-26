package com.mycompany;

/*
Navrhněte systém pro evidenci zaměstnanců firmy.
U každého zaměstnance evidujte osobní údaje, pozici, plat a datum nástupu.
Systém umožňuje přidávat/odebírat zaměstnance,
měnit jejich plat, vyhledávat podle různých kritérií a generovat přehledy.
Data se persistují do souboru.

summary, pekne na kokot zadani, jebu to, jdu to psat na random
 */
public class App {

    public static void main(String[] args) {
        Firma firma = new Firma();
        firma.pridatZamestnance(
            "jan",
            "novak",
            "29.2.",
            20000.0,
            Pozice.MAJITEL
        );

        firma.pridatZamestnance(
            "pepa",
            "jirina",
            "29.5.",
            40000.0,
            Pozice.MANAGER
        );
        firma.zmenaPlatu(
            "pepa",
            "jirina",
            "29.5.",
            40000.0,
            Pozice.MANAGER,
            45000.0
        );
        firma.nalestZamestnanceProVypis(
            "",
            "",
            "",
            30000.0,
            (Pozice) null,
            "<"
        );
    }
}
