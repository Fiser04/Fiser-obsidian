package knihovna;

import java.util.Objects;

/**
 *
 * @author fiser
 */
public class Book extends Prints{
   private String ibpm;

    public Book(String name, String autor, String ibpm) {
        super(name, autor);
        this.ibpm = ibpm.toLowerCase();
    }

    public String getIbpm() {
        return ibpm;
    }

    public void setIbpm(String ibpm) {
        this.ibpm = ibpm;
    }

    @Override
    public String toString() {
         if (isBorrowed) {
            return "Book's name is " + this.name + ", it's autor is " + this.autor + ", it's ibpm is " + this.ibpm + " and now it is borrowed.";
        }
        else{
             return "Book's name is " + this.name + ", it's autor is " + this.autor + ", it's ibpm is " + this.ibpm + " and now it is free to choose.";
        }
    }

   @Override
    public String getName() {
        return name;
    }

   @Override
    public void setName(String name) {
        this.name = name;
    }

   @Override
    public String getAutor() {
        return autor;
    }

   @Override
    public void setAutor(String autor) {
        this.autor = autor;
    }

   @Override
    public boolean isIsBorrowed() {
        return isBorrowed;
    }

   @Override
    public void setIsBorrowed(boolean isBorrowed) {
        this.isBorrowed = isBorrowed;
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 31 * hash + Objects.hashCode(this.ibpm);
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
        final Book other = (Book) obj;
        return Objects.equals(this.ibpm, other.ibpm);
    }
    
    
   
}
