package w2;

public class Ucitel {

    private final String meno;
    private final String priezvisko;
    private final String titulPredMenom;
    private final String titulZaMenom;

    public Ucitel(String meno, String priezvisko, String titulPredMenom, String titulZaMenom) {
        this.meno = meno;
        this.priezvisko = priezvisko;
        this.titulPredMenom = titulPredMenom;
        this.titulZaMenom = titulZaMenom;
    }

    @Override
    public String toString() {
        return this.titulPredMenom + ". " + this.meno + " " + this.priezvisko + ", " + this.titulZaMenom + ". ";
    }

}
