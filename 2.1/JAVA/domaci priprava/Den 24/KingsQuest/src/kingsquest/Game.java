/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package kingsquest;

import java.util.Scanner;

/**
 *
 * @author fiser
 */
public class Game {

    //mistnosti
    Room kingsRoom = new Room("Hall");
    Room dragonsRoom = new Room("Cave");
    Room weaponaryRoom = new Room("Weaponary");
    Room armoaryRoom = new Room("Armory");
    Room libraryRoom = new Room("Library");
    Room currentRoom;
    
    
    final int waitLong = 3000;
    final int waitShort = 2000;
    boolean left = false;
    boolean isLeaveable = false;

    public void Start() {
        Introduction();
        try (Scanner sc = new Scanner(System.in)) {
            String input = sc.nextLine();
            while (!left) {
                String[] inputCut = input.split(" ");
                switch (inputCut[0]) {
                    case "leave": {
                        if (isLeaveable) {
                            left = true;
                        } else {
                            System.out.println("You need to kill the dragon to get tooth");
                        }
                    }
                    break;

                    case "map":
                        ShowMapShort();
                        break;
                    case "mapAll":
                        ShowMapAll();
                        break;
                    case "help":
                        ShowHelp();
                    default:
                        throw new AssertionError();
                }
            }

        } catch (Exception e) {
            System.out.println("error v startu");
        }
    }

    public void ShowMapAll() {
        System.out.println("""
                               On your left there is a magiacal book, get it, it is going to make the dragon unable to cook you by his dangerous flames.
                               We used to have weaponary, however there is still a chance that you can find a weapon there, sword, spear, something. It is located behind the door in front of you.
                               Behind the doors behind you there is an armour, it is too heavy for old king like me, take it, it is made by the best steel in the whole kindom.
                               And when you have everything, you can go into the right door, there sleeps the mighty dragon on our precious gold.                  
                               """);
    }

    public void ShowMapShort() {
        System.out.println("""
                           Left - Magical book
                           Up - Weapon
                           Down - Armor
                           Right - Dragon
                           """);
    }

    public void ShowHelp() {
        System.out.println("""
                           help - shows back of the note
                           mapAll - shows front of the note
                           map - show your map
                           go [direction] - go where you wrote the location (from your notes)
                           leave - try to leave the place, dragon's tooth is needed
                           myLocation - the walls gives you your location
                           """);

    }

    public void Introduction() {
        System.out.println("You have fallen into unvisible hole!");
        try (Scanner sc = new Scanner(System.in)) {

            //intruducing
            currentRoom = kingsRoom;
            Thread.sleep(waitShort);
            System.out.println("You have appeard in some old castle.");
            Thread.sleep(waitShort);
            System.out.println("Me: Where am i?");
            Thread.sleep(waitShort);
            System.out.println("King: Dear stranger, welcome to our castel, we were waiting for someone to finally save us.");
            Thread.sleep(waitLong);
            System.out.println("King: There is a mighty dragon in one of these rooms, here, take my notes, it is basically map for you.");
            Thread.sleep(waitShort);
            System.out.println("");
            System.out.print("Notes: ");
            ShowMapAll();
            Thread.sleep(waitLong);
            System.out.println("King: Now, when you know everything, one more thing, everything that you want to do, you have to say it.");
            Thread.sleep(waitLong);
            System.out.println("King: There key words for you, we call them spells, they are preaty easy, most of the time it is just short way to say the name of the item or action you want to do");
            Thread.sleep(waitLong);
            System.out.println("King: They are written on the back of the note.");
            Thread.sleep(waitShort);
            ShowHelp();

        } catch (InterruptedException ex) {
            System.getLogger(Game.class.getName()).log(System.Logger.Level.ERROR, (String) null, ex);
        }
    }
    
    public void Go(Room room){
        this.currentRoom = room;
    }
    
}
