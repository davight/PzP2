package w2;

public class Ucitel {

    private String meno;
    private String priezvisko;
    private String titulPredMenom;
    private String titulZaMenom;

    public Ucitel() {

    }

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
