package com.mycompany;

public class App {

    public static void main(String[] args) {
        System.out.println("Zretezeni: " + zretezeni("Hello", " world!"));
        System.out.println("Reverze: " + otoceni("Hello world!"));
    }

    public static String zretezeni(String str1, String str2) {
        return str1 + str2;
    }

    public static String otoceni(String string) {
        char[] charArr = string.toCharArray();
        String otoceno = "";
        for (int i = 0; i < charArr.length; i++) {
            otoceno += charArr[(charArr.length - 1) - i];
        }
        return otoceno;
    }
}
