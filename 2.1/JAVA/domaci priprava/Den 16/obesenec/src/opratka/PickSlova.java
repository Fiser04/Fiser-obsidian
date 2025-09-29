package opratka;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Random;

public class PickSlova {

    private String cestaSouboru;
    private ArrayList<String> slovaSouboruList;
    public String slovoVybrane;
    private Random random;


    public PickSlova(String cestaSouboru) throws IOException {
        this.cestaSouboru = cestaSouboru;
        slovaSouboruList = new ArrayList<>();
        vybratSlovo();
    }

    private void ReadSoubor() throws FileNotFoundException, IOException {
        try (BufferedReader br = new BufferedReader(new FileReader(this.cestaSouboru))) {
            String line;
            while ((line = br.readLine()) != null) {
                slovaSouboruList.add(line);
            }
        }
    }

    private int GenrateNum() {
        random = new Random();
        return random.nextInt(0, slovaSouboruList.size() - 1);
    }

    private final void vybratSlovo() throws IOException {
        ReadSoubor();
        slovoVybrane = slovaSouboruList.get(GenrateNum());
    }

    public String getSlovoVybrane() {
        return slovoVybrane;
    }

}
