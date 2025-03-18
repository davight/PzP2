package w5;

import w5.tvary.Platno;
import w5.hrac.Kopijnik;
import w5.hrac.Legionar;
import w5.hrac.Lukostrelec;
import w5.hrac.Nepriatel;

import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.util.ArrayList;
import java.util.Random;

public class Main {

    private static final ArrayList<Lukostrelec> lukostrelci = new ArrayList<>();
    private static final ArrayList<Nepriatel> nepriatelia = new ArrayList<>();
    private static final Random rand = new Random();

    public static void main(String[] args) {
        Platno.dajPlatno().addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                lukostrelci.add(new Lukostrelec(e.getX(), e.getY()));
            }
        });

        boolean hrame = true;
        while (hrame) {
            if (nepriatelia.size() < 5) {
                nepriatelia.add(rand.nextBoolean() ? new Kopijnik(rand.nextInt(600), 4) : new Legionar(rand.nextInt(600), 8));
            }
            lukostrelci.forEach(l -> {
                l.vystrelNa(nepriatelia);
                l.krok();
            });
            nepriatelia.forEach(Nepriatel::krok);
            Platno.dajPlatno().wait(100);
        }
    }


}
