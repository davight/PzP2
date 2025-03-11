package w4;

import w4.tvary.Platno;

public class Odbocovac implements Vykonavac {

    private final boolean vpravo;
    private final Husenica husenica;

    public Odbocovac(boolean vpravo, Husenica husenica) {
        this.husenica = husenica;
        this.vpravo = vpravo;
    }

    @Override
    public void vykonaj() {
        int pocet = vpravo ? 10 : -10;
        for (Clanok c : this.husenica.getAll()) {
            Platno.dajPlatno().wait(100);
            c.posunO(pocet, 0);
        }
    }

}
