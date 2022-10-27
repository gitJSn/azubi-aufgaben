import java.util.Date;

public class Patient extends Person {
    private int patientennummer;
    private Krankheit erkrankung;
    private Date letzterBesuch;

    public Patient(int patientennummer) {
        this.patientennummer = patientennummer;
    }

    public void setLetzterBesuch(Date value) {
        letzterBesuch = value;
    }

    public void setKrankheit(Krankheit value) {
        erkrankung = value;
    }

    public int getPatientennummer() {
        return patientennummer;
    }
}
