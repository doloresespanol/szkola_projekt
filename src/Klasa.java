import java.util.ArrayList;

public class Klasa {
    private ArrayList<Uczen> uczniowie = new ArrayList<>();
    private String nazwaKlasy;
    private Wychowawca wychowawca;

    public Klasa(String nazwaKlasy) {
        this.nazwaKlasy = nazwaKlasy;
    }

    @Override
    public String toString() {
        System.out.println("Klasa: "+nazwaKlasy+"\n Uczniowie: "+uczniowie);
        return "";
    }

    public Klasa(ArrayList<Uczen> uczniowie, String nazwaKlasy) {
        this.uczniowie = uczniowie;
        this.nazwaKlasy = nazwaKlasy;
    }

    public Klasa(ArrayList<Uczen> uczniowie, String nazwaKlasy, Wychowawca wychowawca) {
        this.uczniowie = uczniowie;
        this.nazwaKlasy = nazwaKlasy;
        this.wychowawca = wychowawca;
    }

    public Klasa(String nazwaKlasy, Wychowawca wychowawca) {
        this.nazwaKlasy = nazwaKlasy;
        this.wychowawca = wychowawca;
    }
    private boolean czyUczenJestWKlasie(Uczen uczen){
        return uczniowie.contains(uczen);
    };
    /**
     * metoda dodaje ucznia do listy uczniów jeżeli jeszcze go nie ma w tej liście
     * @param uczen obiekt dodawany do listy uczniów
     * @return brak wartości
     */
    //zeby wygenerowac z javaDoc html wybierrz Tools/Generate JavaDoc
    public void dodajUczniaDoKlasy(Uczen uczen){
        if(czyUczenJestWKlasie(uczen)){
            System.out.println("Nie można dodać ucznia, już jest");
        }else{
            uczniowie.add(uczen);
        }
    }
    public void usunUczniaZKlasy(Uczen uczen){
        if(czyUczenJestWKlasie(uczen)){
            uczniowie.remove(uczen);
        }else{
            System.out.println("Nie ma takiego ucznia");
        }
    }
}
