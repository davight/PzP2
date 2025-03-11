package w2;

public class Main {

    public static void main(String[] args) {
        Skola skola = new Skola("SOSHA");

        Ucitel u1 = new Ucitel("Peter", "Fabian", "Mgr", "Phd");
        Ucitel u2 = new Ucitel("Stano", "Dolnik", "Mgr", "Phd");
        Ucitel u3 = new Ucitel("Maros", "Matejov", "Mgr", "Phd");

        Trieda t1 = new Trieda("4A");
        t1.pridajStudenta(new Student("Nela", "Beliancinova", "08943830", 4));
        t1.pridajStudenta("Daniela", "Paulyniova", "987987", 4);

        Trieda t2 = new Trieda("4B");
        t2.pridajStudenta(new Student("AlexJozef", "Magdolen", "437893", 4));
        t2.pridajStudenta("Mario", "Bukovan", "49383", 4);

        skola.pridatUcitela(u1);
        skola.pridatUcitela(u2);
        skola.pridatUcitela(u3);

        skola.pridatTriedu(t1);
        skola.pridatTriedu(t2);

        skola.vypisVsetko();
    }

}
