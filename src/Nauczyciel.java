public sealed class Nauczyciel extends Osoba permits Wychowawca{
    private String przedmiot;

    public Nauczyciel(String imie, int wiek, String przedmiot) {
        super(imie, wiek);
        this.przedmiot = przedmiot;
    }
}
