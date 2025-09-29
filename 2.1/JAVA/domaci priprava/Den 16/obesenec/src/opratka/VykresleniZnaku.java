package opratka;

import java.util.ArrayList;

public class VykresleniZnaku {

     ArrayList<String> postavaList = new ArrayList<>();
    
    
    public VykresleniZnaku() {
        naplnitList();
    }

    void naplnitList(){
        postavaList.add("");
        postavaList.add("  O  ");
        postavaList.add("""
                          O  
                          | """);
        postavaList.add("""
                          O  
                         /|  """);
        postavaList.add("""
                          O  
                         /|\\ """);
        postavaList.add("""
                          O  
                         /|\\  
                         / """);
        postavaList.add("""
                          O  
                         /|\\  
                         / \\  """);
    }
    
    
}
