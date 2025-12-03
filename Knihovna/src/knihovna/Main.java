package knihovna;

/**
 *
 * @author fiser
 */
public class Main {
    public static void main(String[] args) {
        Library lib = new Library("JCU");
        lib.addPrint(new Book("Moje cesta", "Malir", "123421"));
        lib.addPrint(new Book("Mafie", "On", "1231"));
        lib.addPrint(new Book("Jeho", "On", "1223"));
        lib.addPrint(new Book("Moj", "Malir", "54546"));
        lib.addPrint(new Prints("Mojea", "Malir"));
        
        User user = new User("pepa", 0);
        lib.addUser(user);
        
        lib.listPrints("is Borrowed", "false", true);
        System.out.println("------------------");
        lib.borrowReturn("ibpm", "123421", true, user, "25.1.", TransactionType.Borrow);
        lib.listPrints("is Borrowed", "true", true);
        
        
        lib.listHistory();
    }
    
}
