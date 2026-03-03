package Main;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 *
 * @author fiser
 */

public class Garaz<T extends Vozidlo> implements IGaraz<T> {

    private List<T> seznamVozidel = new ArrayList<>();

    @Override
    public void pridej(T t) {
        seznamVozidel.add(t);
    }

    @Override
    public void odeber(T t) throws PrazdnyListException {
        if (seznamVozidel.isEmpty()) {
            throw new PrazdnyListException(
                "Garaz je prazdna, nelze odebrat vozidlo."
            );
        }
        seznamVozidel.remove(t);
    }

    @Override
    public String vypis() {
        return seznamVozidel.toString();
    }

    @Override
    public int getPocetVozidel() {
        return seznamVozidel.size();
    }

    @Override
    public T getNejstarsiVozidlo() throws PrazdnyListException {
        if (seznamVozidel.isEmpty()) {
            throw new PrazdnyListException(
                "Garaz je prazdna, nelze ziskat nejstarsi vozidlo."
            );
        }
        int idOfMax = 0;
        for (int i = 0; i < seznamVozidel.size(); i++) {
            if (
                seznamVozidel.get(i).getRokVyroby() <
                seznamVozidel.get(idOfMax).getRokVyroby()
            ) {
                idOfMax = i;
            }
        }
        return seznamVozidel.get(idOfMax);
    }

    @Override
    public void seraditPodleRokuVyroby() {
        Collections.sort(seznamVozidel);
    }

    @Override
    public String toString() {
        String toReturn = "";
        for (T t : seznamVozidel) {
            toReturn += t.toString() + "\n";
        }
        return toReturn;
    }
}
