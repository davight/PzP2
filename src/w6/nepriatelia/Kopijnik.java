package w6.nepriatelia;

import w6.hrac.Lukostrelec;

import java.util.ArrayList;

public class Kopijnik extends Nepriatel {

    private Kopija kopija = null;

    public Kopijnik(int poziciaY, int rychlost) {
        super(7, "kopija", poziciaY, rychlost);
    }

    @Override
    public void zautoc(ArrayList<Lukostrelec> list) {
        if (this.kopija == null) {
            System.out.println("nova kopija");
            this.kopija = new Kopija(super.getX(), super.getY(), 200);
        }
        if (!this.kopija.let()) {
            this.kopija = null;
            return;
        }
        Lukostrelec najblizsi = super.najdiNajblizsiehoLukostrelca(list);
        if (najblizsi == null) {
            return;
        }
        double vzdialenost = this.kopija.vzdialenostKu(najblizsi);
        if (vzdialenost <= 20) {
            list.remove(najblizsi);
            najblizsi.skry();
        }
    }

    public void skryKopiju() {
        if (this.kopija != null) {
            this.kopija.skry();
        }
    }

}
