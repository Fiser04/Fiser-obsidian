/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package javaapplication30;

import java.util.Scanner;

/**
 *
 * @author fiser
 */
public class Textering {

    public static int kontrollen(Scanner sc) {
        String kontrolovana = sc.nextLine();
        if (Double.parseDouble(kontrolovana) >= Integer.MIN_VALUE && Double.parseDouble(kontrolovana) <= Integer.MAX_VALUE) {
            return Integer.parseInt(kontrolovana);
        } else {
            throw new MujException("Not in range");
        }
    }
}
