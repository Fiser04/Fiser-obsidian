//Den 23
package slovoctenelevopravo;
import java.util.Scanner;
public class SlovoCteneLevoPravo {
    public static void main(String[] args) {
        String input;
        char[] textArray;
        boolean cteSeTak = true;
        
        try (Scanner sc = new Scanner(System.in)){
            input = sc.nextLine();
            textArray = new char[input.length()];
            
            for(int i = 0; i<textArray.length; i++){
                textArray[i] = input.charAt(i);
            }
        
            for(int i = 0; i<textArray.length;i++){
                if(!(textArray[i] == textArray[textArray.length-1-i])){
                        cteSeTak = false;
                }
            }
            
            if(cteSeTak){
                System.out.println("toto slovo se cte stejne jak z leva tak z prava");
            
            }else{
                System.out.println("nope");
            }
        }
    
    }
    
}
