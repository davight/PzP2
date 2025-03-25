package w6;

import w6.hrac.Lukostrelec;
import w6.nepriatelia.Kopijnik;
import w6.nepriatelia.Legionar;
import w6.nepriatelia.Nepriatel;
import w6.tvary.Platno;

import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.util.ArrayList;
import java.util.Random;

public abstract class Main {

    public static void main(String[] args) {
        ArrayList<Lukostrelec> lukostrelci = new ArrayList<>();
        Platno.dajPlatno().addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                lukostrelci.add(new Lukostrelec(e.getX() - 60, e.getY() - 90));
            }
        });

        ArrayList<Nepriatel> nepriatelia = new ArrayList<>();
        Random r = new Random();

        while (true) {
            if (nepriatelia.size() < 5){
                if (r.nextBoolean()) {
                    nepriatelia.add(new Kopijnik(r.nextInt(500), 4));
                } else {
                    nepriatelia.add(new Legionar(r.nextInt(500), 6));
                }
            }

            for (Lukostrelec lukostrelec : lukostrelci) {
                lukostrelec.krok();
                lukostrelec.vystrelNa(nepriatelia);
            }

            for (Nepriatel nepriatel : nepriatelia) {
                nepriatel.krok();
                nepriatel.zautoc(lukostrelci);
            }

            Platno.dajPlatno().wait(50);
        }

    }
}
