import java.util.ArrayList;
import java.util.List;
import java.lang.Math;

public class Main {
    public static void main(String[] args) {
        //private tylko dla klasy, protected klasa i dzieci, public wszyscy, brak w ramach pakietu
        //Osoba jas = new Osoba("Jaś",10); //nie mozna bo klasa osoba jest abstrakcyjna
        //System.out.println(jas.getImie());
        //System.out.println(jas);
        Uczen janek = new Uczen("Jaś",11);
        Uczen janek1 = new Uczen("Kamil",10);
        System.out.println(janek);
        Nauczyciel wit1 = new Wychowawca("Witek",27,"przedmioty zawodowe");
        System.out.println(wit1);
        Klasa kl3P = new Klasa("3P");
        kl3P.dodajUczniaDoKlasy(janek1);
        kl3P.dodajUczniaDoKlasy(janek);
        Szkola szkola1 = Szkola.getSzkola();
        szkola1.dodajKlaseDoSzkoly(kl3P);
        System.out.println(szkola1);
        System.out.println(kl3P);



    }
}