package w8;

import java.util.ArrayList;

public abstract class Predajna<E> {
    private String nazov;
    private ArrayList<E> ponuka = new ArrayList<>();

    public Predajna(String nazov) {
        this.nazov = nazov;
    }

    public void pridajDoPonuky(E jedlo) {
        this.ponuka.add(jedlo);
    }

    public abstract String otvaracieHodiny();

    public String menu() {
        if (this.ponuka.isEmpty()) {
            return "Ospravedlnujeme sa, nemame pre vas ziadnu ponuku";
        }
        StringBuilder sb = new StringBuilder();
        sb.append("**********************************\n");
        sb.append("Vita vas ").append(this.nazov).append(". Nasa ponuka pre vas: \n");
        for (E jedlo : this.ponuka) {
            sb.append(jedlo.toString()).append("\n").append("\n");
        }
        sb.append("Otvaracaie hodiny: \n").append(this.otvaracieHodiny()).append("\n**********************************\n");
        return sb.toString();
    }

}
