import java.util.Date;

public class Test {
    public static void main(String[] args) {
        Patient patient = new Patient(1);

        patient.setKrankheit(Krankheit.TOD);
        patient.setLetzterBesuch(new Date());


        Krankenpfleger krankenpfleger = new Krankenpfleger(1, 100);
        Konto krankenpflegerKonto = new Konto(krankenpfleger);

        krankenpfleger.setKonto(krankenpflegerKonto);

        Buchhalter buchhalter = new Buchhalter();
        Konto firmenKonto = new Konto(buchhalter);
        firmenKonto.erhoeheKontostand(10000);

        buchhalter.setFirmenkonto(firmenKonto);
        buchhalter.mitarbeiterBezahlen(krankenpfleger);

        System.out.println("Krankenpfleger Kontostand:");
        System.out.println(krankenpfleger.getKonto().getKontostand());

    }
}
