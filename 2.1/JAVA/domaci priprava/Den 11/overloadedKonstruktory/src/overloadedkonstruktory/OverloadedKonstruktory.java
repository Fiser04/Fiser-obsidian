//Den 11
/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package overloadedkonstruktory;

/**
 *
 * @author fiser
 */
public class OverloadedKonstruktory {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        User uzivatel1 = new User("Kuba");
        User uzivatel2 = new User("Robert", "idk123@gmail.com");
        User uzivatel3 = new User("Pavel", "21312asdad@gmail.com", 30);
        User uzivatel4 = new User();
        print(uzivatel1, uzivatel2, uzivatel3, uzivatel4);
    }
    
    static void print(User... users){
        for(User user : users){
            user.print();
        }
    }
    
}
