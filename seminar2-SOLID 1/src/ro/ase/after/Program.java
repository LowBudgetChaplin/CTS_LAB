package ro.ase.after;

public class Program {
    public static void main(String[] args) {
        Angajat a = new Angajat("ion", 2500);
        HR hr = new HR();
        System.out.println(hr.estePromovat(a));
        System.out.println(Financiar.calculTaxe(a));
    }
}
