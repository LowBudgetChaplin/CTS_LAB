public abstract class Angajat {
    protected String nume;
    protected double salariu;
    protected String departament;

    public Angajat(String nume, double salariu, String departament) {
        this.nume = nume;
        this.salariu = salariu;
        this.departament = departament;
    }

    public String getNume() {
        return nume;
    }

    public double getSalariu() {
        return salariu;
    }

    public String getDepartament() {
        return departament;
    }
}
