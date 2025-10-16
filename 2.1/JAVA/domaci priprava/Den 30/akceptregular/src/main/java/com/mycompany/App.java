package com.mycompany;

import java.util.regex.*;

public class App {

    public static void main(String[] args) {
        String regularniVyraz = "^[a-zA-Z0-9]+@[a-zA-Z0-9]+.[a-zA-Z]{2,}$";
        String email = "frantalala@jcu.cz";
        Pattern pattern = Pattern.compile(regularniVyraz);
        Matcher matcher = pattern.matcher(email);
        if (matcher.matches()) {
            System.out.println(email + " je prijatelny retezec");
        } else {
            System.out.println(email + " neni prijatelny retezec");
        }
    }
}
