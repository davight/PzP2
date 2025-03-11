package w2;

public class Student {

    private String meno;
    private String priezvisko;
    private String rodneCislo;
    private int rocnik;

    public Student() {
    }

    public Student(String meno, String priezvisko, String rodneCislo, int rocnik) {
        this.meno = meno;
        this.priezvisko = priezvisko;
        this.rodneCislo = rodneCislo;
        this.rocnik = rocnik;
    }

    public int getRocnik() {
        return this.rocnik;
    }

    public String getRodneCislo() {
        return this.rodneCislo;
    }

    public void setRodneCislo(String rodneCislo) {
        this.rodneCislo = rodneCislo;
    }

    public String getPriezvisko() {
        return this.priezvisko;
    }

    public void setPriezvisko(String priezvisko) {
        this.priezvisko = priezvisko;
    }

    public String getMeno() {
        return meno;
    }

    public void setMeno(String meno) {
        this.meno = meno;
    }

    public void setRocnik(int rocnik) {
        if (rocnik < 0) {
            throw new IllegalArgumentException("Rocnik nemoze byt mensi ako 0");
        }
        this.rocnik = rocnik;
    }

    @Override
    public String toString() {
        return this.meno + " " + this.priezvisko + " (" + this.rodneCislo + ") - " + this.rocnik + ". rocnik";
    }
}
