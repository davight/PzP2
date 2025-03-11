package w2;

public class Trieda {

    private static final int KAPACITA = 30;

    private final Student[] studenti;

    private final String nazov;

    public Trieda(String nazov) {
        this.nazov = nazov;
        this.studenti = new Student[KAPACITA];
    }

    public boolean pridajStudenta(Student s) {
        for (int i = 0; i < this.studenti.length; i++) {
            if (this.studenti[i] == null) {
                this.studenti[i] = s;
                return true;
            }
        }
        return false;
    }

    public boolean pridajStudenta(String meno, String priezvisko, String rodneCislo, int rocnik) {
        return this.pridajStudenta(new Student(meno, priezvisko, rodneCislo, rocnik));
    }

    public boolean odoberStudenta(String rodneCislo) {
        for (int i = 0; i < this.studenti.length; i++) {
            if (this.studenti[i] != null && this.studenti[i].getRodneCislo().equals(rodneCislo)) {
                this.studenti[i] = null;
                return true;
            }
        }
        return false;
    }

    public String getNazov() {
        return this.nazov;
    }

    public void vypis() {
        StringBuilder sb = new StringBuilder();
        sb.append("Trieda ").append(nazov).append(":\n\n");
        int i = 1;
        for (Student student : this.studenti) {
            if (student != null) {
                sb.append(i).append(". ").append(student.getMeno()).append(" ").append(student.getPriezvisko()).append("\n");
                i++;
            }
        }
        System.out.println(sb);
    }

}
