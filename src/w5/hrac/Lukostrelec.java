package w5.hrac;

import java.util.ArrayList;

public class Lukostrelec extends Postava {

    public Lukostrelec(int poziciaX, int poziciaY) {
        super(22, "luk");
        this.obrazok.zmenPolohu(poziciaX, poziciaY);
        this.obrazok.zobraz();
    }

    public void vystrelNa(ArrayList<Nepriatel> nepriatelia) {
        if (nepriatelia.isEmpty() || this.animacia == 22) {
            return;
        }
        int mojY = this.obrazok.getPolohaY();
        Nepriatel najblizsi = nepriatelia.getFirst();
        int najmensiRozdiel = Math.abs(najblizsi.getY() - mojY);

        for (Nepriatel nepriatel : nepriatelia) {
            int rozdiel = Math.abs(nepriatel.getY() - mojY);
            if (rozdiel < najmensiRozdiel) {
                najmensiRozdiel = rozdiel;
                najblizsi = nepriatel;
            }
        }

        if (najblizsi.uberHp(25)) {
            nepriatelia.remove(najblizsi);
        }
    }
}
