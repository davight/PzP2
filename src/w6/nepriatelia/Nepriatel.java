package w6.nepriatelia;

import w6.hrac.Lukostrelec;
import w6.postava.Postava;

import java.util.ArrayList;

public abstract class Nepriatel extends Postava {

    private UkazovatelHP hp;

    private int rychlost;

    public Nepriatel(int pocetObrazkov, String nazov, int poziciaY, int rychlost) {
        super(pocetObrazkov, nazov);

        this.obrazok.zmenPolohu(-100, poziciaY);
        this.rychlost = rychlost;

        this.hp = new UkazovatelHP(this.obrazok.getPolohaX(), this.obrazok.getPolohaY());
    }

    public void krok() {
        this.obrazok.posunVodorovne(this.rychlost);
        this.hp.posunNa(this.obrazok.getPolohaX(), this.obrazok.getPolohaY());
        this.hp.zobraz();
        super.krok();
    }

    public void posunY(int pocet) {
        this.obrazok.posunZvisle(pocet);
        this.hp.posunNa(this.obrazok.getPolohaX(), this.obrazok.getPolohaY());
        this.hp.zobraz();
    }

    public int getY() {
        return this.obrazok.getPolohaY();
    }

    public int getX() {
        return this.obrazok.getPolohaX();
    }

    public boolean uberHp(int kolko) {
        this.hp.uberHp(kolko);
        if (this.hp.getHp() <= 0) {
            this.obrazok.skry();
            this.hp.skry();
            return true;
        }
        return false;
    }

    public final Lukostrelec najdiNajblizsiehoLukostrelca(ArrayList<Lukostrelec> list) {
        if (list.isEmpty()) {
            return null;
        }
        Lukostrelec najblizsi = list.getFirst();
        double vzdialenost = this.vypocitajVzdialenost(najblizsi.getX(), najblizsi.getY());
        for (Lukostrelec nepriatel : list) {
            double aktualna = this.vypocitajVzdialenost(nepriatel.getX(), nepriatel.getY());
            if (aktualna < vzdialenost) {
                najblizsi = nepriatel;
                vzdialenost = aktualna;
            }
        }
        return najblizsi;
    }

    public final double vypocitajVzdialenost(int x2, int y2) {
        return Math.sqrt(Math.pow(this.getX() - x2, 2) + Math.pow(this.getY() - y2, 2));
    }

    public abstract void zautoc(ArrayList<Lukostrelec> list);

}
