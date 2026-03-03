/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pkg01;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 *
 * @author fialav06
 */
public class AutaSKolekci<T extends  prvek> implements Ikolekce<T> {

    private List<T> list = new ArrayList<T>();

    @Override
    public void pridej(T t) {
        list.add(t);
    }

    @Override
    public void odeber(T t) {
       try{
           smaz(t);
       }catch (Exception ex) {
            
        }
    }

    private void smaz(T t) throws PrazdnaKolekceException {
        if (list.isEmpty()) {
            throw new PrazdnaKolekceException("prazdna kolekce");
        } else {
 list.remove(t);
        }
    }

    @Override
    public int pocetPrvku() {
        if (list == null) {
            return 0;
        } else {
            return list.size();
        }
    }

    @Override
    public String vypis() {
        String vypis = "";
        if (list.isEmpty()) {
            return vypis;
        } else {
            for (T v : list) {
                vypis += v + "\n";
            }
            return vypis;
        }
    }

    @Override
    public void serad() {
        Collections.sort(list);
    }

    @Override
    public T max() {
       try{
           return findMax();
       } catch(PrazdnaKolekceException e){
           System.out.println(e.getMessage());
       }
        return null;
    }
    
    private T findMax() throws PrazdnaKolekceException{
         if (list.isEmpty()) {
             throw new PrazdnaKolekceException("prazdna kolekce");
         }
         else{
             T max = null;
             for(T i : list){
                 if(i.compareTo(max)>0){
                     max = i;
                 }
             }
          return max;
         }
        
    }
    
    @Override
    public String getID(T t){
        return t.getId();
    }
}
