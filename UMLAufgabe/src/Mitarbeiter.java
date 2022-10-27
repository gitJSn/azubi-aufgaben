import java.util.Date;

public abstract class Mitarbeiter extends Person {
    protected int aktennummer;
    protected Date einstellungsdatum;
    protected boolean eingestellt;

    public void neuerMitarbeiter(int aktennummer) {
        this.aktennummer = aktennummer;
    }

    public void einstellen() {
        einstellungsdatum = new Date();
        eingestellt = true;
    }

    public void kuendigen() {
        eingestellt = false;
    }


}
