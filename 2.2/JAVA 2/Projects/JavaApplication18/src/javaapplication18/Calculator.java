/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package javaapplication18;

/**
 *
 * @author fialav06
 */
public class Calculator {

    public static double podil(int a, int b) {
        if (b == 0) {
            throw new MojeVyjmka("Delitel nesmi byt 0, zkuste to znovu");
        } else {
            double delitel = b;
            return a / delitel;
        }
    }
}
