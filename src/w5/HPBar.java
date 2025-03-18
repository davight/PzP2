package w5;

import w5.tvary.Obdlznik;

public class HPBar {

    private int hp;
    private final Obdlznik vonkajsi;
    private final Obdlznik vnutorny;

    public HPBar(int x, int y) {
        this.hp = 100;
        this.vonkajsi = new Obdlznik(x, y, 104, 12, "black");
        this.vnutorny = new Obdlznik(x, y, 100, 8, "green");
    }

    public void uberHp(int kolko) {
        this.hp -= kolko;
        this.vnutorny.zmenStrany(this.hp, 8);
    }

    public void posunNa(int x, int y) {
        this.vonkajsi.posunNaXY(x, y);
        this.vonkajsi.zobraz();
        this.vnutorny.posunNaXY(x, y);
        this.vnutorny.zobraz();
    }

    public int getHp() {
        return this.hp;
    }

    public void zobraz() {
        this.vonkajsi.zobraz();
        this.vnutorny.zobraz();
    }

    public void skry() {
        this.vonkajsi.skry();
        this.vnutorny.skry();
    }

}
