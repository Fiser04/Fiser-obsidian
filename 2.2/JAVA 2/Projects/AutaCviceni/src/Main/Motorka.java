package Main;

/**
 *
 * @author fiser
 */

public class Motorka extends Vozidlo {

    private int obsahVaku;

    public Motorka(String znacka, String model, int rokVyroby, int obsahVaku) {
        super(znacka, model, rokVyroby);
        this.obsahVaku = obsahVaku;
    }

    public int getObsahVaku() {
        return obsahVaku;
    }

    @Override
    public String toString() {
        return (
            "Motorka{" + "obsahVaku=" + obsahVaku + "} " + super.toString()
        );
    }
}
