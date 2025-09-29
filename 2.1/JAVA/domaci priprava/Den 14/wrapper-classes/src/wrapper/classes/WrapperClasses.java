/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package wrapper.classes;

/**
 *
 * @author fiser
 */
public class WrapperClasses {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // pretvoreni jednoducheho datoveho typu na slozity (udelat z typu jako je int object, aby se "choval" jako string)

        //TECHNIKA AUTOBOXING
        //int a = 123;
        //jen pro predstavu, uz to takhle je blbost delat
        Integer a = new Integer(123);
        Double b = new Double(3.21);
        Character c = new Character('#');
        Boolean d = new Boolean(true);

        //tak jak se to dela ted
        Integer ab = 123;
        Double bb = 4.12;
        Character cb = '%';
        Boolean db = true;

        //TECHNIKA UNBOXING
        int ax = ab;
        double bx = bb;
        char cx = cb;
        boolean dx = db;

        //toto se hodi treba pri konvertovani na string
        String p1 = Integer.toString(123);
        String p2 = Double.toString(4.5);
        String p3 = Character.toString('^');
        String p4 = Boolean.toString(true);

        String[] strings = {p1, p2, p3, p4};

        for (String s : strings) {
            System.out.println(s);
        }
        System.out.println(p1 + p2 + p3 + p4);
        
        //parsovani, neboli z stringu na jednoduchy
        int l1 = Integer.parseInt("32");
        double l2 = Double.parseDouble("5.3");
        char l3 = "Kebab".charAt(0); //char nema parsovani
        boolean l4 = Boolean.parseBoolean("false");
        
        //dale dokazeme kontrolovat veci kolem
        char pismeno = '#';
        System.out.println((Character.isLetter(pismeno)));
    }

}
