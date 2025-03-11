package w4.tvary;

import w4.Vykonavac;

public class Prefarbovac implements Vykonavac {

    private final Kruh kruh;

    public Prefarbovac(Kruh kruh) {
        this.kruh = kruh;
    }

    @Override
    public void vykonaj() {
        this.kruh.zmenFarbu("green");
    }
}
