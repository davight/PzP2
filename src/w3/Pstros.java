package w3;

import w3.tvary.Obrazok;

public class Pstros implements Nelietajuci {

    private final Obrazok obrazok;
    private boolean n;

    public Pstros() {
        this.n = true;
        this.obrazok = new Obrazok("src/PRzP2/w3/images/pstros1.png");
        this.obrazok.zmenPolohu(10, 150);
        this.obrazok.zobraz();
    }

    @Override
    public void kracaj() {
        this.obrazok.posunVpravo();
        this.obrazok.zmenObrazok(this.n ? "src/PRzP2/w3/images/pstros1.png" : "src/PRzP2/w3/images/pstros2.png");
        this.n = !this.n;
    }

    @Override
    public void znesVajce() {
        Obrazok vajce = new Obrazok("src/PRzP2/w3/images/vajce.png");
        vajce.zmenPolohu(this.obrazok.getPolohaX(), this.obrazok.getPolohaY());
        vajce.zobraz();
    }

}
