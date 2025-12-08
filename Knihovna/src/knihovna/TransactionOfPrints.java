package knihovna;

import java.util.Objects;

/**
 *
 * @author fiser
 */
public class TransactionOfPrints {
    private String userName;
    private int userId;
    private String date;
    private String printName;
    private String printAutor;
    private TransactionType type;

    public TransactionOfPrints(String userName, int userId, String date, String printName, String printAutor, TransactionType type) {
        this.userName = userName;
        this.userId = userId;
        this.date = date;
        this.printName = printName;
        this.printAutor = printAutor;
        this.type = type;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public int getUserId() {
        return userId;
    }

    public void setUserId(int userId) {
        this.userId = userId;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public String getPrintName() {
        return printName;
    }

    public void setPrintName(String printName) {
        this.printName = printName;
    }

    public String getPrintAutor() {
        return printAutor;
    }

    public void setPrintAutor(String printAutor) {
        this.printAutor = printAutor;
    }

    public TransactionType getType() {
        return type;
    }

    public void setType(TransactionType type) {
        this.type = type;
    }

    @Override
    public String toString() {
        return "TransactionOfPrints{" + "userName=" + userName + ", userId=" + userId + ", date=" + date + ", printName=" + printName + ", printAutor=" + printAutor + ", type=" + type + '}';
    }

    @Override
    public int hashCode() {
        int hash = 5;
        hash = 97 * hash + Objects.hashCode(this.userName);
        hash = 97 * hash + this.userId;
        hash = 97 * hash + Objects.hashCode(this.date);
        hash = 97 * hash + Objects.hashCode(this.printName);
        hash = 97 * hash + Objects.hashCode(this.printAutor);
        hash = 97 * hash + Objects.hashCode(this.type);
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
        final TransactionOfPrints other = (TransactionOfPrints) obj;
        if (this.userId != other.userId) {
            return false;
        }
        if (!Objects.equals(this.userName, other.userName)) {
            return false;
        }
        if (!Objects.equals(this.date, other.date)) {
            return false;
        }
        if (!Objects.equals(this.printName, other.printName)) {
            return false;
        }
        if (!Objects.equals(this.printAutor, other.printAutor)) {
            return false;
        }
        return this.type == other.type;
    }

    
}