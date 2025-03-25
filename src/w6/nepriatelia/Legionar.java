package w6.nepriatelia;

import w6.hrac.Lukostrelec;

import java.util.ArrayList;

public class Legionar extends Nepriatel {

    public Legionar(int poziciaY, int rychlost) {
        super(7, "mec", poziciaY, rychlost);
    }

    @Override
    public void zautoc(ArrayList<Lukostrelec> list) {
        Lukostrelec najblizsi = super.najdiNajblizsiehoLukostrelca(list);
        if (najblizsi == null) {
            return;
        }
        double vzdialenost = super.vypocitajVzdialenost(najblizsi.getX(),najblizsi.getY());
        super.posunY(super.getY() - najblizsi.getY());
        if (vzdialenost <= 15) {
            list.remove(najblizsi);
            najblizsi.skry();
        }
    }

}
