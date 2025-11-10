package com.mycompany;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.stream.Collectors;

public class Knihovna {

    ArrayList<Kniha> knihas = new ArrayList<>();

    public void pridejKnihu(Kniha kniha) {
        this.knihas.add(kniha);
    }

    public void listPodleRoku() {
        ArrayList<Kniha> list = (ArrayList<Kniha>) this.knihas.stream()
            .sorted(Comparator.comparingInt(Kniha::getRok))
            .collect(Collectors.toList());

        for (Kniha kniha : list) {
            System.out.print(kniha.getNazev() + kniha.getRok());
        }
    }

    public void najdiKnihuPodleAutora(String autor) {
        for (Kniha kniha : knihas) {
            if (kniha.getAutor().toLowerCase().equals(autor.toLowerCase())) {
                System.out.print(kniha.getNazev() + kniha.getAutor());
            }
        }
    }
}
