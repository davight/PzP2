package w8;

public class Cukraren extends Predajna<Kolacik> {

    public Cukraren(String nazov) {
        super(nazov);
    }

    @Override
    public String otvaracieHodiny() {
        return "Streda: 8-16";
    }
}
