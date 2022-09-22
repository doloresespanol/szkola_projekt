public class Uczen extends Osoba {
    private int nrUcznia;
    public static int LiczbaUczniow;

    public Uczen(String imie, int wiek) {
        //super musi byc pierwsze, konstruktor nadrzednej klasy w podrzednej
        super(imie, wiek); //wywolanie konstruktora klasy bazowej
        LiczbaUczniow++;
        this.nrUcznia = LiczbaUczniow;
    }

    public Uczen(int nrUcznia,String zmienna) {
        setImie(zmienna);
        this.nrUcznia = nrUcznia;
    }

    @Override
    public String toString() {
        return "Uczen{" +getImie()+" wiek: "+getWiek()+" nrUcznia="+nrUcznia+"}";
    }
}
