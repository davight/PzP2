package w4;

import w4.tvary.Platno;

public class PosuvacVpred implements Vykonavac {

    private final Husenica husenica;

    public PosuvacVpred(Husenica husenica) {
        this.husenica = husenica;
    }

    @Override
    public void vykonaj() {
        for (Clanok c : this.husenica.getAll()) {
            Platno.dajPlatno().wait(100);
            c.posunO(0, 10);
        }
    }

}
