public class Buchhalter extends Mitarbeiter {
    private Konto firmenkonto;

    public Buchhalter(Konto firmenkonto) {
        this.firmenkonto = firmenkonto;
    }

    public Buchhalter() {
    }

    public void mitarbeiterBezahlen(Mitarbeiter mitarbeiter) {
        firmenkonto.ueberweisen(mitarbeiter.getKonto(), mitarbeiter.getGehalt());
    }

    public void rechnungStellen(Patient patient) {
        // TODO
    }

    public void setFirmenkonto(Konto firmenkonto) {
        this.firmenkonto = firmenkonto;
    }
}
