//Den 19
/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package linkovylist;

import java.util.LinkedList;

/**
 *
 * @author odkolin
 */
public class LinkovyList {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        /*
           (Singly) Linked list = kazdy prvek ma jeste jednu hodnotu ktera poukazuje na adresu dalsiho prvku,
           proste kdyz budu mit linked list ABCD, tak to realne vypada A - kde je B, B - kde je C, C - kde je D, D - null
           insert je jednoduchy oproti polim (kde se musi vse posouvat), jen se prepise adresa ukazujici a adresa kde je dalsi
           jsou ale spatny pri hledani, musim hledat postupne od zacatku
           takze super zalezitost na mazani a pridavani, ale hledani je pain
           Doubly Linked List = ted kazdy prvek ma i adresu predesleho, takze muzu i od konce hledat
        */
        
        LinkedList<String> list = new LinkedList<>();
        
        //chovani jako stack
        /*
        list.push("a");
        list.push("c");
        list.push("d");
        list.push("b");
        list.push("f");
        System.out.println(list); [f, b, d, c, a]
        */
        
        //chovani jako queue
        list.offer("a");
        list.offer("c");
        list.offer("d");
        list.offer("b");
        list.offer("f");
        System.out.println(list); //[a, c, d, b, f]
        list.add(4, "E");
        list.remove("E");
        System.out.println((list.indexOf("c")));
        System.out.println(list);
        
        System.out.println(list.peekFirst());
        System.out.println(list.peekLast());
        list.addFirst("1");
        list.addLast("2");
        System.out.println(list);
        
        
        /*
        Vyhody
            dynamicke
            jednoduche mazani, pridavani
        Nevyhody
            zadny index (hledani)
            zabira vice ramek
            linearni hledani O(n)
        Vyuziti
            GPS
            Music player
            Stacks/queues implementations
        */
    }
    
}
