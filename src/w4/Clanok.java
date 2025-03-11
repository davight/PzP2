package w4;

import w4.tvary.Kruh;

public class Clanok {

    private Clanok predchodca = null;
    private Clanok nasledovnik = null;
    private int poziciaX;
    private int poziciaY;
    private Kruh kruh;
    private Vykonavac vykonavac = null;

    public Clanok(Vykonavac vykonavac) {
        this();
        this.vykonavac = vykonavac;
    }

    public Clanok() {
        this.kruh = new Kruh();
        this.poziciaX = this.kruh.getLavyHornyX();
        this.poziciaY = this.kruh.getLavyHornyY();
    }

    public int getPoziciaX() {
        return this.poziciaX;
    }

    public int getPoziciaY() {
        return this.poziciaY;
    }

    public Kruh getKruh() {
        return this.kruh;
    }

    public Vykonavac getVykonavac() {
        return this.vykonavac;
    }

    public void setVykonavac(Vykonavac vykonavac) {
        this.vykonavac = vykonavac;
    }

    public Clanok getNasledovnik() {
        return this.nasledovnik;
    }

    public void setPredchodca(Clanok predchodca) {
        this.predchodca = predchodca;
    }

    public void setNasledovnik(Clanok nasledovnik) {
        this.nasledovnik = nasledovnik;
    }

    public void posunO(int x, int y) {
        this.poziciaX += x;
        this.kruh.posunVodorovne(x);
        this.poziciaY += y;
        this.kruh.pomalyPosunZvisle(y);
    }

    public void posunSa(int x, int y) {
        this.kruh.posunNaPoziciu(x, y);
        this.poziciaX = x;
        this.poziciaY = y;
    }

    public Clanok getPredchodca() {
        return this.predchodca;
    }

}
