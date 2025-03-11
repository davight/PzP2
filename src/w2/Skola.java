package w2;

import java.util.HashSet;

public class Skola {

    private final String nazov;
    private final HashSet<Trieda> triedy = new HashSet<>();
    private final HashSet<Ucitel> ucitelia = new HashSet<>();

    public Skola(String nazov) {
        this.nazov = nazov;
    }

    public boolean pridatTriedu(Trieda t) {
        return this.triedy.add(t);
    }

    public boolean pridatStudentaDoTriedy(String nazovTriedy, Student s) {
        for (Trieda t : this.triedy) {
            if (t.getNazov().equals(nazovTriedy)) {
                t.pridajStudenta(s);
                return true;
            }
        }
        return false;
    }

    public boolean pridatUcitela(Ucitel u) {
        return this.ucitelia.add(u);
    }

    private void internalVypisTried() {
        this.triedy.forEach(Trieda::vypis);
    }

    public void vypisTried() {
        System.out.println(this.nazov);
        this.internalVypisTried();
    }

    private void internalVypisUcitelov() {
        int c = 1;
        for (Ucitel u : this.ucitelia) {
            System.out.println(c + ". " + u.toString());
        }
    }

    public void vypisUcitelov() {
        System.out.println(this.nazov);
        this.internalVypisUcitelov();
    }

    public void vypisVsetko() {
        System.out.println(this.nazov);
        this.internalVypisUcitelov();
        this.internalVypisTried();
    }

}
