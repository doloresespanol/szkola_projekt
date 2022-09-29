import java.util.ArrayList;

public class Szkola {
    private static Szkola szkola = new Szkola(); //singleton, obiekt klasy szkola ma byc tylko jeden
    public ArrayList<Klasa> klasy = new ArrayList<>();
    private Szkola() {
    }
    public boolean czyKlasaJestWSzkole(Klasa klasa){
        return klasy.contains(klasa);
    };
    public static Szkola getSzkola() {
        return szkola;
    }
    public void dodajKlaseDoSzkoly(Klasa klasa){
        if(czyKlasaJestWSzkole(klasa)){
            System.out.println("Nie można dodać klasy, już jest");
        }else{
            klasy.add(klasa);
        }
    }

    @Override
    public String toString() {
        System.out.println("Klasy: ");
        for(Klasa x:klasy) {
            System.out.println(x);
            ;
        }
        return "";
    }
}
