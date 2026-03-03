package Main;

/**
 *
 * @author fiser
 */

public interface IGaraz<T> {
    void pridej(T t);

    void odeber(T t) throws PrazdnyListException;

    String vypis();

    int getPocetVozidel();

    void seraditPodleRokuVyroby();

    T getNejstarsiVozidlo() throws PrazdnyListException;
}
