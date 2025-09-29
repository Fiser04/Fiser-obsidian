//Den 22
/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package otoceniretezce;

/**
 *
 * @author fiser
 */
public class OtoceniRetezce {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
            String retezec = "Hrnec";
            char[] retezecArr = new char[retezec.length()];
            String konec="";
            for(int i = 0; i<retezec.length(); i++){
                retezecArr[retezec.length() -1 - i] = retezec.charAt(i);
            }
            for(int i = 0; i<retezec.length(); i++){
                konec +=retezecArr[i];
            }
            System.out.println(konec);
    }
    
}
