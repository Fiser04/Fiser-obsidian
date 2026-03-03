package Main;

/**
 *
 * @author fiser
 */

public class Auto extends Vozidlo {

    private int pocetDveri;

    public Auto(String znacka, String model, int rokVyroby, int pocetDveri) {
        super(znacka, model, rokVyroby);
        this.pocetDveri = pocetDveri;
    }

    public int getPocetDveri() {
        return pocetDveri;
    }

    @Override
    public String toString() {
        return ("Auto{" + "pocetDveri=" + pocetDveri + "} " + super.toString());
    }
}
