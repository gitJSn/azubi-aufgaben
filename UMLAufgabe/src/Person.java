import java.time.LocalDate;
import java.time.Period;
import java.util.Date;

public abstract class Person {
    protected LocalDate geburtsdatum;
    protected String vorname;
    protected String nachname;

    public LocalDate getGeburtstag() {
        return geburtsdatum;
    }

    public int getAlter() {
        return Period.between(geburtsdatum, LocalDate.now()).getYears();
    }

    public String getVollerName() {
        return vorname + ", " + nachname;
    }
}
