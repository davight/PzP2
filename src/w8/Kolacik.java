package w8;

import java.util.ArrayList;

public class Kolacik {

    private String nazov;
    private double cena;
    private int hmotnost;
    private ArrayList<Alergen> alergeny = new ArrayList<>();

    public Kolacik(String nazov, double cena, int hmotnost) {
        this.nazov = nazov;
        this.cena = cena;
        this.hmotnost = hmotnost;
    }

    public void pridajAlergen(Alergen alergen) {
        this.alergeny.add(alergen);
    }

    @Override
    public String toString() {
        String s = this.nazov + " -> Hmotnost: " + this.hmotnost + "g Cena: " + this.cena + "€";
        StringBuilder sb = new StringBuilder();
        for (Alergen alergen : alergeny) {
            sb.append(alergen.toString()).append(", ");
        }
        s += "\n  Alergeny: " + sb.substring(0, sb.length() - 2);
        return s;
    }
}
