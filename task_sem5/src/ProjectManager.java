public class ProjectManager extends Angajat {
    private String echipa;

    public ProjectManager(String nume, double salariu, String departament, String echipa) {
        super(nume, salariu, departament);
        this.echipa = echipa;
    }

    public String getEchipa() {
        return echipa;
    }
}
