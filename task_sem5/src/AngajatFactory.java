public class AngajatFactory {
        public static Angajat creazaAngajat(String job, String nume, double salariu, String departament, String descriereJob) {
            switch (job) {
                case "ProjectManager":
                    return new ProjectManager(nume, salariu, departament, descriereJob);
                case "Developer":
                    return new DepartamentIT(nume, salariu, departament, descriereJob);
                case "HR":
                    return new DepartamentHR(nume, salariu, departament, Integer.parseInt(descriereJob));
                default:
                    throw new IllegalArgumentException(job);
            }
        }
    }

