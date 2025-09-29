package opratka;

import java.util.ArrayList;

/**
 *
 * @author fiser
 */
public class KontrolaSlova {

    String slovo;
    ArrayList<Integer> pozice;
    String vyresene = "";
    char[] slovoChar;
    public int pocetNalezenych;

    public KontrolaSlova(String slovo) {
        slovoChar = slovo.toCharArray();
        pozice = new ArrayList<>();
        for (int i = 0; i < slovoChar.length; i++) {
            this.vyresene += "_";
        }
    }

    void kontrola(char charakter) {
        for (int i = 0; i < slovoChar.length; i++) {
            if (slovoChar[i] == charakter) {
                pozice.add(i);
            }
        }
    }

    String reseni(char charakter) {
        pocetNalezenych = 0;
        kontrola(charakter);
        char[] pole = vyresene.toCharArray();
        pocetNalezenych += pozice.size();
        for (int a : pozice) {
            pole[a] = charakter;  // na správné pozice dosadíme znak
        }
        pozice.clear();
        vyresene = new String(pole); // pole převedeme zpět na String
        return vyresene;
    }
}
