package w8;

public class Main {
    public static void main(String[] args) {
        Cesto cesto = new Cesto(1.23, 1);
        Syr syr = new Syr(0.4, 2);
        Pizza pizza = new Pizza("idk");
        pizza.pridajSUrovinu(cesto);
        pizza.pridajSUrovinu(syr);
        System.out.println(pizza);

        Kolacik kolacik = new Kolacik("rezy", 1, 2);
        kolacik.pridajAlergen(Alergen.MLIEKO);
        kolacik.pridajAlergen(Alergen.VAJCIA);
        System.out.println(kolacik.toString());

        Pizzeria pizzeria = new Pizzeria("papucka");
        pizzeria.pridajDoPonuky(pizza);
        pizzeria.pridajDoPonuky(pizza);
        System.out.println(pizzeria.menu());

        Cukraren cukraren = new Cukraren("cukr");
        cukraren.pridajDoPonuky(kolacik);
        cukraren.pridajDoPonuky(kolacik);
        System.out.println(cukraren.menu());
    }

}
