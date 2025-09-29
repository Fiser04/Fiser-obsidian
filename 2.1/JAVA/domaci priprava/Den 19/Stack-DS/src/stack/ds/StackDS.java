//Den 19
/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package stack.ds;
import java.util.Stack;
/**
 *
 * @author odkolin
 */
public class StackDS {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // stack - LIFO (last in first out), proste hromada knih treba
        Stack<String> stack = new Stack<>();
        stack.push("cislo1");
        stack.push("cislo2");
        stack.push("cislo3");
        stack.push("cislo4");
        System.out.println(stack);
        stack.pop(); //odstrani "top" objekt (proste to co posledni prijde tak ho i odstranis)
        String s = stack.pop(); //muzu pri odstraneni ho pripsat k jine variable
        stack.search("cislo2"); //toto vraci pozici kdyz se nachazi hledany objekt, pokud hledany objekt neni nalezen vraci -1
        System.out.println(stack.search("cislo2"));
        System.out.println(stack.peek());
        //je mozne ze pri pouzivani stacku tak spotrebujeme vsechnu pamet
        
        /*
        vyuziti stacks:
            undo/redo v text editorech
            dopredu/dozadu historii prohlizece
            backtracking algoritmy
            volani funkci
        */
        
        
        /*
        vyzualne
        5
        4
        3
        2
        1
        0
        
        pop: -smaze nejvyzsi
        4
        3
        2
        1
        0
        
        peek: -vraci nejvyzsi (return)
        4
        
        search: -vrati pozici
        [chleba, rohlik, bageta]
        ...search("chleba") -> 0
        
        */
        
        
    }
    
}
