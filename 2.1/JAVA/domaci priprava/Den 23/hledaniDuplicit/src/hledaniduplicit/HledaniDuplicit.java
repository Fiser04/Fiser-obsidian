//Den 23
package hledaniduplicit;

/**
 *
 * @author fiser
 */
public class HledaniDuplicit {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int[] pole = {10, 20, 30, 40, 120, 0, 30};
        najdi(pole);
        
    }
    
    public static void najdi(int [] pole){
        boolean nalezeno = false;
        for(int i = 0; i< pole.length; i++){
            for(int j = i+1; j<pole.length; j++){
                if(pole[i] == pole[j]){
                    nalezeno = true;
                }
            
            }
         }
        System.out.println(nalezeno);
    }
}
