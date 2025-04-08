package w8;

import java.util.ArrayList;

public class Pizza {
    private final ArrayList<Surovina> suroviny = new ArrayList<>();
    private String nazov;

    public Pizza(String nazov) {
        this.nazov = nazov;
    }

    public void pridajSUrovinu(Surovina surovina) {
        this.suroviny.add(surovina);
    }

    public boolean jeVeganska() {
        for (Surovina surovina : this.suroviny) {
            if (!surovina.isVeganska()) {
                return false;
            }
        }
        return true;
    }

    public void zveganciPizzu() {
        ArrayList<Surovina> neveganskeSuroviny = new ArrayList<>();
        for (Surovina surovina : this.suroviny) {
            if (!surovina.isVeganska()) {
                neveganskeSuroviny.add(surovina);
            }
        }
        this.suroviny.removeAll(neveganskeSuroviny);
    }

    public double dajHmotnost() {
        double d = 0;
        for (Surovina surovina : this.suroviny) {
            d += surovina.getHmotnost();
        }
        return d;
    }

    public double dajCenu() {
        double d = 0;
        for (Surovina surovina : this.suroviny) {
            d += surovina.getCena();
        }
        return d;
    }

    @Override
    public String toString() {
        String s = this.nazov + " -> " + "Hmotnost: " + this.dajHmotnost() + "kg Cena: " + this.dajCenu() + "€\n";
        StringBuilder zlozenie = new StringBuilder();
        StringBuilder alergeny = new StringBuilder();
        for (Surovina surovina : this.suroviny) {
            if (surovina.vypisAlergeny() != null) {
                alergeny.append(surovina.vypisAlergeny()).append(", ");
            }
            zlozenie.append(surovina.getNazov()).append(", ");
        }
        s += "  Zlozenie: " + zlozenie.substring(0, zlozenie.length() - 2) + "\n";
        s += "  Alergeny: " + alergeny.substring(0, alergeny.length() - 2) + "\n";
        return s;
    }

}
