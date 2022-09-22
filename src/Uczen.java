public class Uczen extends Osoba {
    private int nrUcznia;
    public static int LiczbaUczniow;

    public Uczen(String imie, int wiek) {
        super(imie, wiek); //wywolanie konstruktora klasy bazowej
        LiczbaUczniow++;
        this.nrUcznia = LiczbaUczniow;
    }

    @Override
    public String toString() {
        return "Uczen{" +getImie()+" wiek: "+getWiek()+" nrUcznia="+nrUcznia+"}";
    }
}
