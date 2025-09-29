//Den 11
/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package konstruktory;

/**
 *
 * @author fiser
 */
public class Konstruktory {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // konstruktor je takovej inserter, nebo prvni setup objektu
        Studenti student1 = new Studenti("Josef", 29);
        Studenti student2 = new Studenti("Adam", 17);
        print(student1, student2);
        
    }
    
    static void print(Studenti... s){
        for (Studenti student : s) {
            student.print();
        }
    }
    
}
