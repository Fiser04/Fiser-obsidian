package com.mycompany;

public class Pes extends Zvire {

    public Pes(String jmeno) {
        this.jmeno = jmeno;
    }

    @Override
    public void zvuk() {
        System.out.println("haf");
    }
}
