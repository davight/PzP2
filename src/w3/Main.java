package w3;

import w3.tvary.Platno;

import java.util.ArrayList;
import java.util.Random;

public class Main {

    public static void main(String[] args) {
        Random random = new Random();
        ArrayList<Vtacik> vtaci = new ArrayList<>();
        vtaci.add(new Pstros());
        vtaci.add(new Vrana());

        for (int i = 0; i < 100; i++) {
            Platno.dajPlatno().wait(50);
            for (Vtacik v : vtaci) {
                if (v instanceof Lietajuci lietajuci) {
                    lietajuci.lietaj();
                }
                else if (v instanceof Nelietajuci nelietajuci) {
                    nelietajuci.kracaj();
                }
                if (random.nextInt(100) > 95) {
                    v.znesVajce();
                }
            }
        }

    }

}
