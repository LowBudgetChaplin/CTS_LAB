public class DepartamentIT extends Angajat {
    private String limbaj;

    public DepartamentIT(String nume, double salariu, String departament, String limbaj) {
        super(nume, salariu, departament);
        this.limbaj = limbaj;
    }

    public String getLimbaj() {
        return limbaj;
    }
}
