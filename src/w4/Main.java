package w4;

import w4.tvary.Platno;
import w4.tvary.Prefarbovac;

public class Main {

    public static void main(String[] args) {
        Husenica husenica =  new Husenica();
        for (int i = 0; i < 4; i++) {
            Clanok c = new Clanok();
            c.setVykonavac(new Prefarbovac(c.getKruh()));
            husenica.pridajClanok(c);
        }
        Platno.dajPlatno().wait(1000);
        husenica.spracuj();
        Odbocovac p = new Odbocovac(true, husenica);
        p.vykonaj();
    }

}
