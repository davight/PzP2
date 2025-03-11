package w2;

import java.util.ArrayList;

public class Skola {

    private String nazov;
    private final ArrayList<Trieda> triedy = new ArrayList<>();
    private final ArrayList<Ucitel> ucitelia = new ArrayList<>();

    public Skola(String nazov) {
        this.nazov = nazov;
    }

    public boolean pridatTriedu(Trieda t) {
        if (!this.triedy.contains(t)) { // preco nie pomocou setu?
            this.triedy.add(t);
            return true;
        }
        return false;
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
        if (!this.ucitelia.contains(u)) {
            this.ucitelia.add(u);
            return true;
        }
        return false;
    }

    private void internalVypisTried() {
        this.triedy.forEach(Trieda::vypis);
    }

    public void vypisTried() {
        System.out.println(this.nazov);
        this.internalVypisTried();
    }

    private void internalVypisUcitelov() {
        for (int i = 0; i < this.ucitelia.size(); i++) {
            System.out.println((i + 1) + ". " + this.ucitelia.get(i).toString());
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
