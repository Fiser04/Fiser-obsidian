package knihovna;

/**
 *
 * @author fiser
 */
public class TransactionOfPrints {
    private User user;
    private String date;
    private Prints print;
    private TransactionType type;

    public TransactionOfPrints(User user, String date, Prints print, TransactionType type) {
        this.user = user;
        this.date = date;
        this.print = print;
        this.type = type;
    }

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public Prints getPrint() {
        return print;
    }

    public void setPrint(Prints print) {
        this.print = print;
    }

    public TransactionType getType() {
        return type;
    }

    public void setType(TransactionType type) {
        this.type = type;
    }

    @Override
    public String toString() {
        return "Transaction{" + "user=" + user + ", date=" + date + ", print=" + print + ", type=" + type + '}';
    }
    
}
