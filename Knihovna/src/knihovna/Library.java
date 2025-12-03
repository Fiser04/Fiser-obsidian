package knihovna;

import java.util.ArrayList;
import java.util.List;

public class Library {

    private final String name;
    private List<Prints> listPrints;
    private List<User> listUsers;
    private List<TransactionOfPrints> historyOfTransactions;

    public Library(String name) {
        this.name = name;
        this.listPrints = new ArrayList<>();
        this.listUsers = new ArrayList<>();
        this.historyOfTransactions = new ArrayList<>();
    }

    public void addPrint(Prints print) {
        this.listPrints.add(print);
    }

    public void listPrints(String whatIsearchWith, String value, boolean returnEverything) {
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

    public void removePrint(String whatIsearchWith, String value, boolean removeEverything) {
        ArrayList<Prints> list = searchPrint(whatIsearchWith, value, removeEverything);
        if (!list.isEmpty()) {
            this.listPrints.removeAll(list);
        }
    }

    private ArrayList<Prints> searchPrint(String whatIsearchWith, String value, boolean returnEverything) {
        ArrayList<Prints> resultsOfSearch = new ArrayList<>();
        whatIsearchWith = whatIsearchWith.toLowerCase();
        value = value.toLowerCase();

        try {
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
                        if (isConvertible(print, "Book") && value.equals(((Book) print).getIbpm())) {
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

    private boolean isConvertible(Prints print, String toWhat) {
        try {
            boolean convered = false;
            switch (toWhat) {
                case "Book" -> {
                    Book b = (Book) print;
                    convered = true;
                }

            }
            //dalsi druhy tiskovin
            return convered;
        } catch (Exception e) {
            return false;
        }
    }

    public void addUser(String name, int id) {
        this.listUsers.add(new User(name, id));
    }

    public void addUser(User user) {
        this.listUsers.add(user);
    }

    public void borrowPrint(Prints print, User user) {
        if (this.listPrints.contains(print) && this.listUsers.contains(user) && !print.isIsBorrowed()) {
            this.listPrints.get(this.listPrints.indexOf(print)).borrow();
        }
    }

    private boolean convertStringToBooleanOnlyTrueFalse(String value) throws WrongSearchParametr {
        switch (value) {
            case "true", "1" -> {
                return true;
            }
            case "false", "0" -> {
                return false;
            }
            default ->
                throw new WrongSearchParametr("Input is not convertable to boolean");
        }
    }

    public void borrowReturn(String whatIsearchWith, String value, boolean returnEverything, User user, String date, TransactionType transactionType) {
        ArrayList<Prints> toBorrow = searchPrint(whatIsearchWith, value, returnEverything);

        if (!toBorrow.isEmpty()) {
            for (Prints print : toBorrow) {
                if (transactionType.equals(TransactionType.Borrow)) {
                    if (print.isBorrowed) {
                        System.out.println("Print is allready borrowed");
                    } else {
                        this.listPrints.get(this.listPrints.indexOf(print)).setIsBorrowed(true);
                    }
                } else if (transactionType.equals(TransactionType.Return)) {
                    if (!print.isBorrowed) {
                        System.out.println("You can't return book that was't borrowed");
                    } else {
                        this.listPrints.get(this.listPrints.indexOf(print)).setIsBorrowed(false);
                    }
                }
                this.historyOfTransactions.add(new TransactionOfPrints(user, date, print, transactionType));
            }
        }
    }

    public void listHistory() {
        for (TransactionOfPrints t : historyOfTransactions) {
            System.out.println(t);
        }
    }
}
