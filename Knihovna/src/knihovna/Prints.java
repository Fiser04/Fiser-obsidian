/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package knihovna;

/**
 *
 * @author fiser
 */
public class Prints {
     String name, autor;
     boolean isBorrowed = false;

    public Prints(String name, String autor) {
        this.name = name.toLowerCase();
        this.autor = autor.toLowerCase();
    }
    
    public void borrow(){
        this.isBorrowed = !this.isBorrowed;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public boolean isIsBorrowed() {
        return isBorrowed;
    }

    public void setIsBorrowed(boolean isBorrowed) {
        this.isBorrowed = isBorrowed;
    }

    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    @Override
    public String toString() {
        return "Prints{" + "name=" + name + ", autor=" + autor + " is borrowed " + isBorrowed + '}';
    }
     
}
