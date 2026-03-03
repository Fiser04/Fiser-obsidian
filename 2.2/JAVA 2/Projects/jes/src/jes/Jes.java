/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package jes;

import java.util.Arrays;

/**
 *
 * @author fiser
 */
public class Jes {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Integer[] a  = new Integer[]{1,10,20,30,5};
        String[] s = new String[]{"jes", "peasdads", "zope"};
        System.out.println(Arrays.toString(ArrayUtils.delej(a)));
        System.out.println(Arrays.toString(ArrayUtils.delej(s)));
    }
    
}
