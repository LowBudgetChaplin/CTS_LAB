package ro.ase.o.after;

import java.util.ArrayList;
import java.util.List;

public class Program {

    public static void main(String[] args) {
        List<ICalculatorSalariu> listaAngajati =  new ArrayList<>();
        listaAngajati.add(new Lucrator());
        listaAngajati.add(new Manager());
        
    }

}
