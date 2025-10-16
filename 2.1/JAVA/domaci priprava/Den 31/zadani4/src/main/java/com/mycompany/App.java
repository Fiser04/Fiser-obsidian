package com.mycompany;

import java.util.ArrayList;
import java.util.Scanner;

public class App {

    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            String line = "";
            ArrayList<String> vstupyArrayListNepretvoreno = new ArrayList<
                String
            >();
            ArrayList<Integer> vstupyArrayList = new ArrayList<Integer>();
            int delkaPole = 0;
            boolean jeVseInt = true;
            while (!(line = sc.nextLine()).equals("q")) {
                vstupyArrayListNepretvoreno.add(line);
            }

            try {
                for (String string : vstupyArrayListNepretvoreno) {
                    vstupyArrayList.add(Integer.parseInt(string));
                    delkaPole++;
                }
            } catch (NumberFormatException e) {
                jeVseInt = false;
            }
            int[] pole = new int[delkaPole];
            int poziceVpoli = 0;
            for (int i : vstupyArrayList) {
                pole[poziceVpoli] = i;
                poziceVpoli++;
            }
            int min = pole[0];
            int druhymin = pole[pole.length - 1];
            for (int i = 1; i < pole.length; i++) {
                if ((pole[i] < druhymin) && (pole[i] > min)) {
                    druhymin = pole[i];
                }
                if (pole[i] < min) {
                    druhymin = min;
                    min = pole[i];
                }
            }
            System.out.println(druhymin);
        } catch (Exception e) {}
    }
}
