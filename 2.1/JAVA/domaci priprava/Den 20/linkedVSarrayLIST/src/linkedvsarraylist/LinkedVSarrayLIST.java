//Den 20
package linkedvsarraylist;
import java.util.ArrayList;
import java.util.LinkedList;
public class LinkedVSarrayLIST {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        LinkedList<Integer> linkedList = new LinkedList<>();
        ArrayList<Integer> arrayList = new ArrayList<>();
        
        long start;
        long end;
        long uslo;
        
        for(int i = 0; i<1000000; i++){
            linkedList.add(i);
            arrayList.add(i);
        }
        
        
        //LinkedList
        start = System.nanoTime();
        
        //linkedList.get(0);
        //linkedList.get(500000);
        //linkedList.get(999999);
        //linkedList.remove(0);
        //linkedList.remove(500000);
        linkedList.remove(999999);
        
        end = System.nanoTime();
        uslo = end - start;
        System.out.println("Linked list:\t" + uslo+ " ns");
        
        //------------------------------------------------------
        
        //ArrayList
        start = System.nanoTime();
        
        //arrayList.get(0);
        //arrayList.get(500000);
        //arrayList.get(999999);
        //arrayList.remove(0);
        //arrayList.remove(500000);
        arrayList.remove(999999);
        
        end = System.nanoTime();
        uslo = end - start;
        System.out.println("Array list:\t" + uslo+ " ns");
    }
    
}
