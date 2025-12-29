package knihovna;

import java.util.Objects;

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
        if (isBorrowed) {
            return "Print's name is " + this.name + ", it's autor is " + this.autor + " and now it is borrowed.";
        }
        else{
             return "Print's name is " + this.name + ", it's autor is " + this.autor + " and now it is free to choose.";
        }
        
        
    }

    @Override
    public int hashCode() {
        int hash = 3;
        hash = 47 * hash + Objects.hashCode(this.name);
        hash = 47 * hash + Objects.hashCode(this.autor);
        hash = 47 * hash + (this.isBorrowed ? 1 : 0);
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Prints other = (Prints) obj;
        if (this.isBorrowed != other.isBorrowed) {
            return false;
        }
        if (!Objects.equals(this.name, other.name)) {
            return false;
        }
        return Objects.equals(this.autor, other.autor);
    }
     
}
