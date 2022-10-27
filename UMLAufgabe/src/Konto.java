public class Konto {
    //TEST
    private int kontonummer;
    private int kontostand;
    private Person besitzer;

    public Konto(Person besitzer) {
        this.besitzer = besitzer;
    }

    public void ueberweisen(Konto zielkonto, int betrag) {
        // von konto abziehen
        kontostand -= betrag;
        // zielkonto erhöhen
        zielkonto.erhoeheKontostand(betrag);
    }

    public void erhoeheKontostand(int value) {
        kontostand += value;
    }

    public int getKontostand() {
        return kontostand;
    }
}
