package knihovna;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class Library {

    private List<Prints> listPrints;
    private List<User> listUsers;
    private List<TransactionOfPrints> historyOfTransactions;

    public Library() {
        this.listPrints = new ArrayList<>();
        this.listUsers = new ArrayList<>();
        this.historyOfTransactions = new ArrayList<>();
    }

    public void addPrint(Prints print) {
        this.listPrints.add(print);
        System.out.println("Print was added");
    }

    public void listPrints(String whatIsearchWith, String value, String returnEverything) {
        ArrayList<Prints> list = searchPrint(whatIsearchWith, value, returnEverything);
        if (list.isEmpty()) {
            System.out.println("Nothing was found");
        } else {
            for (Prints p : list) {
                System.out.println(p);
            }
        }
    }

    public void listPrints() {
        for (Prints print : this.listPrints) {
            System.out.println(print);
        }
    }

    public void removePrint(String whatIsearchWith, String value, String removeEverything) {
        ArrayList<Prints> list = searchPrint(whatIsearchWith, value, removeEverything);
        if (!list.isEmpty()) {
            this.listPrints.removeAll(list);
        }
    }

    private ArrayList<Prints> searchPrint(String whatIsearchWith, String value, String re) {
        ArrayList<Prints> resultsOfSearch = new ArrayList<>();
        try {

            whatIsearchWith = whatIsearchWith.toLowerCase();
            value = value.toLowerCase();
            boolean returnEverything = convertStringToBooleanOnlyTrueFalse(re);

            for (Prints print : this.listPrints) {
                boolean matched = false;

                switch (whatIsearchWith) {
                    case "name" -> {
                        if (value.equals(print.getName())) {
                            matched = true;
                        }
                    }
                    case "autor" -> {
                        if (value.equals(print.getAutor())) {
                            matched = true;
                        }
                    }
                    case "ibpm" -> {
                        if ((print instanceof Book) && value.equals(((Book) print).getIbpm())) {
                            matched = true;
                        }
                    }
                    case "is borrowed" -> {
                        if (convertStringToBooleanOnlyTrueFalse(value) == print.isIsBorrowed()) {
                            matched = true;
                        }
                    }
                    case "" ->
                        matched = true;
                    default ->
                        throw new AssertionError();
                }

                if (matched) {
                    resultsOfSearch.add(print);
                    if (!returnEverything) {
                        return resultsOfSearch;
                    }
                }
            }
        } catch (WrongSearchParametr ex) {
            System.out.println(ex.getMessage());

        }
        return resultsOfSearch;
    }

    public void addUser(String name, int id) {
        this.listUsers.add(new User(name.toLowerCase(), id));
        System.out.println("User was added");
    }

    public void addUser(User user) {
        this.listUsers.add(user);
    }

    public void borrowPrint(Prints print, User user) {
        if (this.listPrints.contains(print) && this.listUsers.contains(user) && !print.isIsBorrowed()) {
            this.listPrints.get(this.listPrints.indexOf(print)).borrow();
        }
    }

    public User searchUser(String bywhat, String name) {
        try {
            for (User user : this.listUsers) {
                if (bywhat.equals("name") && user.getName().equals(name.toLowerCase())) {
                    return user;
                } else if (bywhat.equals("id") && (user.getId() == Integer.parseInt(name))) {
                    return user;
                }
            }
        } catch (NumberFormatException e) {
            System.out.println("This is not a valid number.");
        }
        return null;
    }

    public boolean convertStringToBooleanOnlyTrueFalse(String value) throws WrongSearchParametr {
        switch (value) {
            case "true", "1", "yes" -> {
                return true;
            }
            case "false", "0", "no" -> {
                return false;
            }
            default ->
                throw new WrongSearchParametr("Input is not convertable to boolean");
        }
    }

    public void borrowReturn(String whatIsearchWith, String value, String returnEverything, String userByWhat, String userValue, String date, TransactionType transactionType) {
        ArrayList<Prints> toBorrow = searchPrint(whatIsearchWith, value, returnEverything);
        User user = searchUser(userByWhat, userValue);
        if(toBorrow.isEmpty()){
            System.out.println("No print was found");
            return;
        }
        if (user == null ) {
            System.out.println("User was not found");
            return;
        }

        for (Prints print : this.listPrints) {

            if (!toBorrow.contains(print)) {
                continue;
            }

            switch (transactionType) {
                case Borrow -> {
                    if (print.isBorrowed) {
                        System.out.println("Print is allready borrowed");
                    } else {
                        print.setIsBorrowed(true);
                        this.historyOfTransactions.add(new TransactionOfPrints(user.getName(), user.getId(), date, print.getName(), print.getAutor(), TransactionType.Borrow));
                        System.out.println("Print was borrowed");
                    }
                }
                case Return -> {
                    if (!print.isBorrowed) {
                        System.out.println("You can't return book that was't borrowed");
                    } else {
                        print.setIsBorrowed(false);
                        this.historyOfTransactions.add(new TransactionOfPrints(user.getName(), user.getId(), date, print.getName(), print.getAutor(), TransactionType.Return));
                        System.out.println("Print was returned");
                    }
                }
                default ->
                    System.out.println("Transaction type does not have defined action");
            }

        }

    }

    public void listHistory() {
        List<TransactionOfPrints> tran = historyOfTransactions.reversed();
        for (TransactionOfPrints t : tran) {
            System.out.println(t);
        }
    }

    public List<Prints> getListPrints() {
        return listPrints;
    }

    public void setListPrints(List<Prints> listPrints) {
        this.listPrints = listPrints;
    }

    public List<User> getListUsers() {
        return listUsers;
    }

    public void setListUsers(List<User> listUsers) {
        this.listUsers = listUsers;
    }

    public List<TransactionOfPrints> getHistoryOfTransactions() {
        return historyOfTransactions;
    }

    public void setHistoryOfTransactions(List<TransactionOfPrints> historyOfTransactions) {
        this.historyOfTransactions = historyOfTransactions;
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 43 * hash + Objects.hashCode(this.listPrints);
        hash = 43 * hash + Objects.hashCode(this.listUsers);
        hash = 43 * hash + Objects.hashCode(this.historyOfTransactions);
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
        final Library other = (Library) obj;
        if (!Objects.equals(this.listPrints, other.listPrints)) {
            return false;
        }
        if (!Objects.equals(this.listUsers, other.listUsers)) {
            return false;
        }
        return Objects.equals(this.historyOfTransactions, other.historyOfTransactions);
    }

    @Override
    public String toString() {
        return "Library{" + "listPrints=" + listPrints + ", listUsers=" + listUsers + ", historyOfTransactions=" + historyOfTransactions + '}';
    }

    
}
