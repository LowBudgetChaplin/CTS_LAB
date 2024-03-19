public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");

//        Angajat manager = AngajatFactory.creazaAngajat("Manager", "Serban", 5500, "Management", "Echipa de PR");
        Angajat developer = AngajatFactory.creazaAngajat("Developer", "Mihai", 4000, "Software development", "Java");
        Angajat hr = AngajatFactory.creazaAngajat("HR", "Cosmin", 4000, "Human Resources", "10");


//        System.out.println("Manager: " + manager.getNume() + ", Departament: " + manager.getDepartament() +"Salariu: "+ manager.getSalariu() +" echipa: " + ((ProjectManager) manager).getEchipa());
        System.out.println("Developer: " + developer.getNume() + ", Departament: " + developer.getDepartament() +"Salariu: "+ developer.getSalariu()+ " limbaj de programare: " + ((DepartamentIT) developer).getLimbaj());
        System.out.println("HR: " + hr.getNume() + ", Departament: " + hr.getDepartament() +"Salariu: "+ hr.getSalariu()+ " Numar angajati: " + ((DepartamentHR) hr).getNumarAngajati());
    }
}
