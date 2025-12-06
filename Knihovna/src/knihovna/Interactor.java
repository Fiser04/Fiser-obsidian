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
    private Scanner sc;

    public Interactor() {
        this.library = new Library();
        this.sc = new Scanner(System.in);
    }

    public Library getLibrary() {
        return library;
    }

    public void start() {
        running = true;
        while (running) {
            switch (sc.nextLine().toLowerCase()) {
                case "add": {
		    try{
                    printAddSwitcher(Integer.parseInt(sc.nextLine()));
		    }
		    catch(Exception e){
			System.out.println("Toto neni cislo");
		    }
                }
		break;
		case "remove":{
		    try{
		    String searcher = sc.nextLine();
		    String searchedBy = sc.nextLine();
		    boolean everything = Boolean.parseBoolean(sc.nextLine().toLowerCase());
		    library.removePrint();
		    }
		    catch(Exception e){
		    }
		}
                break;
                default:
                    throw new AssertionError();
            }
        }
    }

    private void printAddSwitcher(int num) {
        switch (num) {
            case 1: {
		String[] info = nameAndAutorGetterFromUser();
                library.addPrint(new Prints(info[0], info[1]));
            }
            break;
            case 2:{
		String[] info = nameAndAutorGetterFromUser();
		String ibpm = sc.nextLine();
		library.addPrint(new Book(info[0], info[1], ibpm));
	    }
                break;
            default:
	    System.out.println("This is no an option");
        }
    }

    private String[] nameAndAutorGetterFromUser(){
	return new String[]{sc.nextLine(), sc.nextLine()};
    }

	public boolean isRunning() {
		return running;
	}

	public void setRunning(boolean running) {
		this.running = running;
	}
}

