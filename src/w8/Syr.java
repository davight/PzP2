package w8;

public class Syr extends Surovina {

    public Syr(double hmotnost, double cena) {
        super(hmotnost, "syr", false, cena);
    }

    @Override
    public Alergen vypisAlergeny() {
        return null;
    }
}
