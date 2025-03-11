package w4;

import w4.tvary.Platno;

import java.util.ArrayList;

public class Husenica {

    private Clanok prvy = null;
    private Clanok posledny = null;

    public void pridajClanok(Clanok clanok) {
        if (prvy == null && posledny == null) {
            this.prvy = clanok;
            clanok.posunSa(40, 20);
        } else {
            clanok.posunSa(this.posledny.getPoziciaX() + 25, this.posledny.getPoziciaY());
            this.posledny.setNasledovnik(clanok);
            clanok.setPredchodca(this.posledny);
        }
        this.posledny = clanok;
    }

    public Clanok getPrvy() {
        return this.prvy;
    }

    public void spracuj() {
        for (Clanok clanok : this.getAll()) {
            Platno.dajPlatno().wait(1000);
            clanok.getVykonavac().vykonaj();
        }
    }

    public Clanok[] getAll() {
        ArrayList<Clanok> clanky = new ArrayList<>();
        Clanok zaciatok = this.prvy;
        while (zaciatok != null) {
            clanky.add(zaciatok);
            zaciatok = zaciatok.getNasledovnik();
        }
        return clanky.toArray(new Clanok[0]);
    }

}
