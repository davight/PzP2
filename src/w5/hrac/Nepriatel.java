package w5.hrac;

import w5.HPBar;

public class Nepriatel extends Postava {

    private final HPBar hpBar;

    private final int rychlost;
    private final int poziciaY;

    public Nepriatel(int pocetObrazkov, String nazov, int poziciaY, int rychlost) {
        super(pocetObrazkov, nazov);
        this.rychlost = rychlost;
        this.poziciaY = poziciaY;
        this.hpBar = new HPBar(-100, poziciaY);
        this.hpBar.zobraz();
        this.obrazok.zmenPolohu(-100, poziciaY);
        this.obrazok.zobraz();
    }

    @Override
    public void krok() {
        super.krok();
        int x = this.obrazok.getPolohaX() + this.rychlost;
        this.obrazok.zmenPolohu(x, this.poziciaY);
        this.obrazok.zobraz();
        this.hpBar.posunNa(x, this.poziciaY);
    }

    public int getY() {
        return this.poziciaY;
    }

    /** returne ci umrel **/
    public boolean uberHp(int kolko) {
        if (this.hpBar.getHp() - kolko <= 0) {
            this.obrazok.skry();
            this.hpBar.skry();
            return true;
        }
        this.hpBar.uberHp(kolko);
        return false;
    }

}
