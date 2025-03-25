package w6.nepriatelia;

import w6.hrac.Lukostrelec;
import w6.tvary.Obrazok;

public class Kopija {

    private final int dostrel;
    private final Obrazok kopija;
    private final int x;

    public Kopija(int x, int y, int dostrel) {
        this.x = x;
        this.dostrel = dostrel + x;
        this.kopija = new Obrazok("src/w6/animacie/kopija.png");
        this.kopija.zmenPolohu(x, y);
        this.kopija.zobraz();
    }

    public boolean let() {
        this.kopija.posunVodorovne(30);
        if (this.kopija.getPolohaX() >= this.dostrel) {
            this.kopija.skry();
            return false;
        }
        return true;
    }

    public double vzdialenostKu(Lukostrelec lukostrelec) {
        return Math.sqrt(Math.pow(this.kopija.getPolohaX() - lukostrelec.getX(), 2) + Math.pow(this.kopija.getPolohaY() - lukostrelec.getY(), 2));
    }

    public void skry() {
        this.kopija.skry();
    }

}
