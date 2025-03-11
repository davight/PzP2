package w3;

import w3.tvary.Obrazok;

public class Vrana implements Lietajuci {

    private final Obrazok obrazok;
    private boolean n;

    public Vrana() {
        this.n = true;
        this.obrazok = new Obrazok("src/PRzP2/w3/images/vrana1.png");
        this.obrazok.zmenPolohu(10, 20);
        this.obrazok.zobraz();
    }

    @Override
    public void lietaj() {
        this.obrazok.posunVpravo();
        this.obrazok.zmenObrazok(this.n ? "src/PRzP2/w3/images/vrana1.png" : "src/PRzP2/w3/images/vrana2.png");
        this.n = !this.n;
    }

    @Override
    public void znesVajce() {
        Obrazok vajce = new Obrazok("src/PRzP2/w3/images/vajce.png");
        vajce.zmenPolohu(this.obrazok.getPolohaX(), this.obrazok.getPolohaY());
        vajce.zobraz();
    }

}
