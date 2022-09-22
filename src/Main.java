import java.util.ArrayList;
import java.util.List;
import java.lang.Math;

public class Main {
    public static void main(String[] args) {
        //private tylko dla klasy, protected klasa i dzieci, public wszyscy, brak w ramach pakietu
        //Osoba jas = new Osoba("Jaś",10); //nie mozna bo klasa osoba jest abstrakcyjna
        //System.out.println(jas.getImie());
        //System.out.println(jas);
        Osoba janek = new Uczen("Jaś",11);
        System.out.println(janek);
        Nauczyciel wit1 = new Wychowawca("Witek",27,"przedmioty zawodowe");
        System.out.println(wit1);
    }
}