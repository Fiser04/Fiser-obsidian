//Den 20
package dynamicarrays;
public class DynamicArrays {
    public static void main(String[] args) {
        // pole, ktere jde zvetsit/zmensit
        listPole lp = new listPole();

        lp.add(1);
        lp.add("adam");
        lp.add('^');
        lp.add(1.5);
        lp.add(true);

        System.out.println(lp);
        System.out.println("capacita: " + lp.getCapacity());
        System.out.println("velikost obsazeni: " + lp.getSize());
        System.out.println("je pole prazdne? " + lp.jePrazdny());
        System.out.println(lp.search(1));
    }

}
