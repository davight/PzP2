package w5.hrac;

import w5.tvary.Obrazok;

public class Postava {

    private final int pocetObrazkov;

    protected int animacia;
    protected Obrazok obrazok;
    private String nazov;

    public Postava(int pocetObrazkov, String nazov) {
        this.animacia = 0;
        this.nazov = nazov;
        this.obrazok = new Obrazok("src/w5/w6.animacie/" + this.nazov + "/0.png");
        this.obrazok.zobraz();
        this.pocetObrazkov = pocetObrazkov;
    }

    public void krok() {
        this.animacia = this.animacia + 1 > this.pocetObrazkov ? 0 : this.animacia + 1;
        this.obrazok.zmenObrazok("src/w5/w6.animacie/" + this.nazov + "/" + this.animacia + ".png");
        this.obrazok.zobraz();
    }

}
