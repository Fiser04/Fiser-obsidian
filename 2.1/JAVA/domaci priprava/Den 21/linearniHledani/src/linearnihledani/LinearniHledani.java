//Den 21
/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package linearnihledani;

/**
 *
 * @author odkolin
 */
public class LinearniHledani {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // pomaly s hodne cisly, rychly s malo, nemusim nejak radit, dokaze zkousnout i linked list
        
        int[] array = {23,1,45,23,676,34,345,23,1,56,766,9};
        
        int index = linearSearch(array, 1);
        
        if(index != -1){
            System.out.println("nalezena na indexu: " + index);
            
        }else{
            System.out.println("nenalezeno");
        }
    }
    public static int linearSearch(int[] pole, int hodnota){
        for (int i = 0; i<pole.length; i++){
            if (pole[i] == hodnota){
                return i;
            }
        }
        return -1;
        
    }
}
