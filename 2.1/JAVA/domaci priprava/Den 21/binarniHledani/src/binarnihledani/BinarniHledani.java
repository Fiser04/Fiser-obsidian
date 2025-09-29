//Den 21
package binarnihledani;

public class BinarniHledani {

    public static void main(String[] args) {
        // binary search = furt pulim interval, pole musi byt serazene abych mohl pouzit
        //binary search pro jednotlive znaky abecedy, dalo by se pouzit s charAt abych hledal vse co zacina na/ma v sobe na urcite pozici x
        String[] array = {"a", "c", "d", "e", "f", "g", "h", "z"}; //moje pole ve kterem hledam
        int poziceStart = 0; //prvni index pole
        int poziceKonec = array.length; //posledni index pole
        int nalezenaPozice = -1; //nalezena pozice (default -1), pokud zustane tak nebylo nalezeno
        String hledanyString = "b"; //hledany string
        boolean nalezeno = false;

        while (!nalezeno) {
            int pozice = (poziceKonec + poziceStart) / 2; //vypoctu si index stredu pole

            if (array[pozice].equals(hledanyString)) { //pokud se rovna hledany string a string na pozici pozice
                nalezenaPozice = pozice;
                nalezeno = true;
            } else if (array[pozice].codePointAt(0) < hledanyString.codePointAt(0)) { //pokud je hledany vic v pravo upravym start
                poziceStart = pozice;
                //System.out.println(array.length - 1);
            } else if (array[pozice].codePointAt(0) > hledanyString.codePointAt(0)) { //pokud vic v levo upravim konec
                poziceKonec = pozice;
            }
            if (((poziceKonec == array.length - 1) && (poziceStart == array.length - 2)) || ((poziceStart == 0) && (poziceKonec == 1))) { //pokud neni nalezeno
                break;
            }
        }
        System.out.println(nalezenaPozice);
    }
 
}
