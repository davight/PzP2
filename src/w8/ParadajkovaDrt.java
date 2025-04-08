package w8;

public class ParadajkovaDrt extends Surovina {

    public ParadajkovaDrt(double hmotnost, double cena) {
        super(hmotnost, "paradajkovadrt", false, cena);
    }

    @Override
    public Alergen vypisAlergeny() {
        return null;
    }
}
