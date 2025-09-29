package dynamicarrays;
public class listPole {

    
    //DEKLARACE
    private int size; //vyplnena cast array
    public int capacity = 1;
    Object[] array;
    private final int zmensovac = 3;
    private final int zvetsovac = 2;

    
    
    //KONSTRUKTORY
    public listPole() {
        this.array = new Object[capacity];
    }

    public listPole(int capacity) {
        this.capacity = capacity;
        this.array = new Object[capacity];
    }

    
    
    //ADD METHODA
    public void add(Object object) {
        if (size >= capacity) { //kontrola jestli se mi to vejde, kdyztak to zvetsim
            zvets();
        }
        array[size] = object;
        size++;
    }

    
    
    //INSERT METHODA
    public void instert(Object object, int pozice) {
        if (this.size >= this.capacity) { //kontrola jestli se mi to vejde, kdyztak to zvetsim
            zvets();
        }
        for (int i = this.size; i > pozice; i--) { //posunu vse od te pozice o jednu do prava
            this.array[i] = this.array[i - 1];
        }
        this.array[pozice] = object; //vlozim objekt
        this.size++;
    }

    
    
    //DELETE
    public void delete(Object object) {
        for (int i = this.size - 1; i >= 0; i--) { //prochazim pole a kdyz najdu object tak posouvam vse o jednu do leva
            if (object.equals(this.array[i])) {
                for (int j = i; j < this.size - 1; j++) {
                    this.array[j] = this.array[j + 1];
                }
                this.size--; //oznamuju ze jsem zmensil pocet obsazenych
                this.array[size] = null; //posledni objekt v array "vymazu", proste prepisu na null\
                
            }
        }
        if(size <= (int)(capacity/zmensovac)){ //po zmazani zkontroluju jestli nahodou nemam az moc zbytecne velke pole, kdyz jo tak zavolam abych ho zmensil
                    zmensi();
                }
    }

    
    
    //HLEDANI
    public int[] searching(Object object) {
        int pozice[] = new int[size]; //vytvorim si pole o stejne delce jako vyplnena cast array, protoze je to maximimalni pocet pozic
        for (int i = 0; i < size; i++) {
            pozice[i] = -1; //naplnim ho -1, jakozto prazdna pozice/pozice kde neni hledany object
        }
        int poziceI = 0;
        for (int i = 0; i < size; i++) {
            if (object.equals(array[i])) {
                pozice[poziceI] = i; //mozna by to slo vyresit nejakym vnorenym cyklem
                poziceI++;
            }
        }
        return pozice;
    }

    public String search(Object object) {
        int[] pozice = searching(object); //naplnim si mistni pole
        String s = "";
        for (int i : pozice) { //prevadim vysledek hledani do stringu
            if (i != -1) {
                s += i + ", ";
            }
        }
        if (s.length() > 0) { //urcuju formatovani a jestli vubec to neco naslo
            s = "Nalezeno na indexech: [" + s.substring(0, s.length() - 2) + "]";
        } else {
            s = "Nenalezeno";
        }
        return s;
    }
    
    
    
    //ZVETSOVANI KAPACITY POLE
    private void zvets() {
        this.capacity = (int) this.capacity * zvetsovac; //zvysim celkovou kapacitu o dvojnasobek (v jave to arraylist automaticky resi zvetsenim 1.5x)
        Object[] object = new Object[this.capacity]; //novy objekt s delkou pole nove kapacity
        for (int i = 0; i < this.size; i++) {
            object[i] = this.array[i]; //naplnuji nove pole starym
        }
        this.array = object; //nahrazuji v projektu stare pole za nove
    }

    
    
    //ZMENSE KAPACITY POLE
    private void zmensi() {
        this.capacity = (this.capacity / zmensovac); //zmensim pole delenim zmensovacem
        Object[] object = new Object[this.capacity]; //novy objekt s delkou pole nove kapacity
        for (int i = 0; i < this.size; i++) {
            object[i] = this.array[i]; //naplnuji nove pole starym
        }
        this.array = object; //nahrazuji v projektu stare pole za nove
    }

    
    //TRUE/FALSE OHLEDNE NAPLNENI POLE
    public boolean jePrazdny() {
        return size == 0;
    }

    
    
    //TO STRING METHODA
    @Override
    public String toString() {
        String string = "";
        /* toto reseni ukaze vse v poli, i null
        for(Object object : array){
            string += object + ", ";
        }
         */
        for (int i = 0; i < size; i++) {
            /* -- jeden z zpusobu reseni vypisu
            if(i == size - 1){
                string += array[i];
            }else{
            string += array[i] + ", ";
            }
             */
            string += array[i] + ", ";
        } 
        if (!string.equals("")) { //ale take to jde vzit pres substring a proste oriznout posledni 2 znaky
            string = "[" + string.substring(0, string.length() - 2) + "]";
        } else {
            string = "[]";
        }
        return string;
    }

    
    
    //GETTERS & SETTERS
    public int getSize() {
        return size;
    }

    public void setSize(int size) {
        this.size = size;
    }

    public int getCapacity() {
        return capacity;
    }

    public void setCapacity(int capacity) {
        this.capacity = capacity;
    }

    public Object[] getArray() {
        return array;
    }

    public void setArray(Object[] array) {
        this.array = array;
    }

}
