package w4;

import w4.tvary.Platno;
import w4.tvary.Prefarbovac;

public class Main {

    public static void main(String[] args) {
        Husenica husenica =  new Husenica();
        for (int i = 0; i < 4; i++) {
            Clanok c = new Clanok();
            husenica.pridajClanok(c);
        }
        husenica.getPrvy().setVykonavac(new Prefarbovac(husenica.getPrvy().getKruh()));
        Platno.dajPlatno().wait(1000);
        husenica.spracuj();
        Odbocovac p = new Odbocovac(false, husenica);
        p.vykonaj();
        PosuvacVpred v = new PosuvacVpred(husenica);
        v.vykonaj();
    }

}
