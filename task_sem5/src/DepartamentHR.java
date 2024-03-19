public class DepartamentHR extends Angajat {
    private int numarAngajati;

    public DepartamentHR(String nume, double salariu, String departament, int numarAngajati) {
        super(nume, salariu, departament);
        this.numarAngajati = numarAngajati;
    }

    public int getNumarAngajati() {
        return numarAngajati;
    }
}
