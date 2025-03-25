package w6.hrac;

import w6.nepriatelia.Kopijnik;
import w6.nepriatelia.Nepriatel;
import w6.postava.Postava;

import java.util.ArrayList;

public class Lukostrelec extends Postava {

    public Lukostrelec(int poziciaX, int poziciaY) {
        super(23, "luk");
        this.obrazok.zmenPolohu(poziciaX, poziciaY);
    }

    public int getX() {
        return this.obrazok.getPolohaX();
    }

    public int getY() {
        return this.obrazok.getPolohaY();
    }

    public void vystrelNa(ArrayList<Nepriatel> nepriatelia) {
        if ((nepriatelia.isEmpty()) || (this.animacia % 23 != 22)) return;

        int mojY = this.obrazok.getPolohaY();
        Nepriatel najblizsi = nepriatelia.getFirst();
        int najmensiRozdiel = Math.abs(najblizsi.getY() - mojY);

        for (int i = 1; i < nepriatelia.size(); i++) {
            int rozdiel = Math.abs(nepriatelia.get(i).getY() - mojY);
            if (rozdiel < najmensiRozdiel) {
                najmensiRozdiel = rozdiel;
                najblizsi = nepriatelia.get(i);
            }
        }

        if (najblizsi instanceof Kopijnik kopijnik) {
            kopijnik.skryKopiju();
        }

        if (najblizsi.uberHp(25)) {
            nepriatelia.remove(najblizsi);
        }
    }

    public void skry() {
        this.obrazok.skry();
    }

}
