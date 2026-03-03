/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package Main;

/**
 *
 * @author fiser
 */
public class AutaCviceni {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Garaz<Vozidlo> garaz = new Garaz<>();
        Vozidlo t = new Auto("Tesla", "Model S", 2020, 4);

        try {
            garaz.odeber(t);
        } catch (PrazdnyListException ex) {
            System.out.println(ex.getMessage());
        }
        garaz.pridej(new Auto("Skoda", "Octavia", 2010, 5));
        garaz.pridej(new Auto("Ford", "Focus", 2015, 5));
        garaz.pridej(new Motorka("Yamaha", "MT-07", 2018, 689));
        garaz.pridej(new Motorka("Honda", "CBR600RR", 2012, 599));

        System.out.println(
            "Pocet vozidel v garazi: " + garaz.getPocetVozidel()
        );

        try {
            System.out.println(
                "Nejstarsi vozidlo v garazi: " + garaz.getNejstarsiVozidlo()
            );
        } catch (PrazdnyListException ex) {
            System.out.println(ex.getMessage());
        }

        System.out.println("Vypis vozidel v garazi: " + garaz.vypis());

        garaz.seraditPodleRokuVyroby();
        System.out.println(
            "Vypis vozidel v garazi serazeny podle roku vyroby: " +
                garaz.vypis()
        );
    }
}
