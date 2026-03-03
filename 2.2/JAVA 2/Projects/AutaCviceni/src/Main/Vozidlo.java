package Main;

/**
 *
 * @author fiser
 */

public abstract class Vozidlo implements Comparable<Vozidlo> {

    private String znacka;
    private String model;
    private int rokVyroby;

    public Vozidlo(String znacka, String model, int rokVyroby) {
        this.znacka = znacka;
        this.model = model;
        this.rokVyroby = rokVyroby;
    }

    public String getZnacka() {
        return znacka;
    }

    public String getModel() {
        return model;
    }

    public int getRokVyroby() {
        return rokVyroby;
    }

    @Override
    public String toString() {
        return (
            "Vozidlo{" +
            "znacka=" +
            znacka +
            ", model=" +
            model +
            ", rokVyroby=" +
            rokVyroby +
            '}'
        );
    }

    @Override
    public int compareTo(Vozidlo o) {
        return Integer.compare(this.rokVyroby, o.rokVyroby);
    }
}
