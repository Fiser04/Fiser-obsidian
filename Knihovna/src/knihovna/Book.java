package knihovna;

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
   
}
