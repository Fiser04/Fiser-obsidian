package com.mycompany;

public enum Pozice {
    MANAGER("Manager"),
    MAJITEL("Majitel"),
    IT("informacni technik"),
    KUCHAR("kuchar");

    private final String name;

    private Pozice(String jmeno) {
        name = jmeno;
    }

    public String toString() {
        return this.name;
    }
}
