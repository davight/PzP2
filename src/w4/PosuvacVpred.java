package w4;

public class PosuvacVpred implements Vykonavac {

    private Husenica husenica;

    public PosuvacVpred(Husenica husenica) {
        this.husenica = husenica;
    }

    @Override
    public void vykonaj() {
        for (Clanok c : this.husenica.getAll()) {
            c.posunO(0, 10);
        }
    }

}
