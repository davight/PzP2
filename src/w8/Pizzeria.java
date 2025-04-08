package w8;

public class Pizzeria extends Predajna<Pizza> {

    public Pizzeria(String nazov) {
        super(nazov);
    }

    @Override
    public String otvaracieHodiny() {
        return "Pondelok - Piatok 24/5";
    }
}
