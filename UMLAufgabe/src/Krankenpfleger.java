import java.util.ArrayList;
import java.util.Optional;

public class Krankenpfleger extends Mitarbeiter {
    private ArrayList<Patient> patienten;
    private int gehalt;
    private Konto konto;

    public Krankenpfleger(int aktennummer, int gehalt) {
        this.aktennummer = aktennummer;
        this.gehalt = gehalt;
        patienten = new ArrayList<>();
    }

    public void patientBehandeln(Patient patient) {
        patienten.add(patient);
    }

    public void patientEntlassen(int patientenNummer) {
        Optional<Patient> p = patienten.stream().filter(patient -> patient.getPatientennummer() == patientenNummer).findFirst();

        patienten.remove(p);
    }

    public void setKonto(Konto value) {
        this.konto = value;
    }

    public Konto getKonto() {
        return konto;
    }

    public int getGehalt() {
        return gehalt;
    }
}
