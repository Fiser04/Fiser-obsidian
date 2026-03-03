/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package kolekcezk;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

/**
 *
 * @author fiser
 */
public class Nabidka<T extends Dort> implements IKolekce<T> {

    private List<T> list = new ArrayList();

    @Override
    public void pridej(T t) {
//        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
        list.add(t);
    }

    @Override
    public void odeber(T t) {
        if (!list.isEmpty()) {
            list.remove(t);
        } else {
            System.out.println("chuju ne");
        }
        // throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public int pocetPrvku() {
        if (!list.isEmpty()) {
            return list.size();
        } else {
            return 0;
        }
    }

    @Override
    public void serad() {
        Collections.sort(list);
    }

    @Override
    public String vypis() {
        if (!list.isEmpty()) {
            String toReturn = "";
            for (T t : list) {
                toReturn += t + "\n";
            }
            return toReturn;
        } else {
            return null;
        }
    }

    @Override
    public T max() {
        T max = null;
        double maxCena = Double.MIN_VALUE;
        if (!list.isEmpty()) {
            for (T t : list) {
                if (t.getCena() > maxCena) {
                    max = t;
                    maxCena = max.getCena();
                }
            }
        }
        return max;
    }
}


