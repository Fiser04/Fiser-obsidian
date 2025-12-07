/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package knihovna;

import java.util.Scanner;

/**
 *
 * @author fiser
 */
public class Interactor {

    private final Library library;
    private boolean running = false;
    private final Scanner sc;
    private final String shell = "> ";

    public Interactor() {
        this.library = new Library();
        this.sc = new Scanner(System.in);
    }

    public Library getLibrary() {
        return library;
    }

    public void start() {
        try (sc) {
            running = true;
            commands();
            while (running) {
                shell();
                switch (sc.nextLine().toLowerCase()) {
                    case "add print" -> {
                        adding();
                    }
                    case "remove" -> {
                        removing();
                    }
                    case "search by parametr", "sbp" -> {
                        searchByParametr();
                    }
                    case "list all prints", "la" -> {
                        listAllPrints();
                    }
                    case "show history", "sh" -> {
                        showHistory();
                    }
                    case "quite", "q" -> {
                        this.running = false;
                    }
                    case "add user" -> {
                        addUser();
                    }
                    case "borrow/return" -> {
                        borrowReturn();
                    }
                    default -> {
                        System.out.println("This is not in the commands list.");
                    }
                }
            }
            System.out.println("Good bye.");
        }
    }

    private void printAddSwitcher(int num) {
        switch (num) {
            case 1 -> {
                String[] info = nameAndAutorGetterFromUser();
                library.addPrint(new Prints(info[0], info[1]));
            }
            case 2 -> {
                String[] info = nameAndAutorGetterFromUser();
                System.out.println("What is the ibpm of the book?");
                shell();
                String ibpm = sc.nextLine();
                library.addPrint(new Book(info[0], info[1], ibpm));
            }
            default ->
                System.out.println("This is not an option");
        }
    }

    private String[] nameAndAutorGetterFromUser() {
        System.out.println("Please enter the required information");
        System.out.println("What is the print's name?");
        shell();
        String name = sc.nextLine();
        System.out.println("What is the autor's name?");
        shell();
        String autor = sc.nextLine();
        return new String[]{name, autor};
    }

    public boolean isRunning() {
        return running;
    }

    public void setRunning(boolean running) {
        this.running = running;
    }

    private String[] questionsStrings() {
        String[] string = new String[3];
        System.out.println("Please enter the required information");
        System.out.println("Category (name, autor, is borrowed)?");
        shell();
        string[0] = sc.nextLine();
        System.out.println("What is the value for search?");
        shell();
        string[1] = sc.nextLine();
        System.out.println("Do you want to apply this to every instance of it (yes, no): ");
        shell();
        string[2] = sc.nextLine().toLowerCase();
        return string;
    }

    private void commands() {
        System.out.println("""
                           add print - if you want to add a print or a book
                           remove - if you want to remove
                           search by parametr - to search by parametr (self explenatory, i know)
                           sbp - search by parametr but shorter
                           list all prints - list everything
                           la - list all prints
                           show history - to show whole history
                           sh - show history
                           quite - to quite
                           add user - adds user to the system
                           q - quite
                           borrow/return - to borrow or return""");
    }

    private void adding() {
        try {
            System.out.println("""
                                           Please choose what type the print is:
                                           1: general print
                                           2: book
                                           """);
            shell();
            printAddSwitcher(Integer.parseInt(sc.nextLine()));
        } catch (NumberFormatException e) {
            System.out.println("This is not a number");
        }
    }

    private void removing() {
        try {
            String[] questioning = questionsStrings();

            library.removePrint(questioning[0], questioning[1], questioning[2]);
        } catch (Exception e) {
            System.out.println("Error while removing");
        }
    }

    private void searchByParametr() {
        try {
            String[] questioning = questionsStrings();
            library.listPrints(questioning[0], questioning[1], questioning[2]);
        } catch (Exception e) {
            System.out.println("Error while searching");
        }
    }

    private void listAllPrints() {
        try {
            library.listPrints();
        } catch (Exception e) {
            System.out.println("Error while listing");
        }
    }

    private void showHistory() {
        try {
            library.listHistory();
        } catch (Exception e) {
            System.out.println("Error while showing the history");
        }
    }

    private void addUser() {
        try {
            System.out.println("Enter the users name");
            shell();
            String name = sc.nextLine();
            System.out.println("Enter the users id");
            shell();
            int id = Integer.parseInt(sc.nextLine());
            library.addUser(name, id);
        } catch (NumberFormatException e) {
            System.out.println("Id is not acceptable, it has to be a number!");
        }
    }

    private void shell() {
        System.out.print(this.shell);

    }

    private void borrowReturn() {
        TransactionType tp = null;
        System.out.println("""
                           Choose the action
                           1: Borrow
                           2: Return""");
        shell();
        int action = Integer.parseInt(sc.nextLine());
        String[] questionsPrint = questionsStrings();
        String[] questionsUser = questionUser();
        System.out.println("Please enter the date");
        shell();
        String date = sc.nextLine();
        switch (action) {
            case 1 ->
                tp = TransactionType.Borrow;
            case 2 ->
                tp = TransactionType.Return;
            default ->
                throw new AssertionError();
        }
        library.borrowReturn(questionsPrint[0], questionsPrint[1], questionsPrint[2], questionsUser[0], questionsUser[1], date, tp);

    }

    private String[] questionUser() {
        String[] string = new String[2];
        System.out.println("Please enter the required information");
        System.out.println("Category (name, id)?");
        shell();
        string[0] = sc.nextLine();
        System.out.println("What is the value for search?");
        shell();
        string[1] = sc.nextLine();
        return string;
    }
}
