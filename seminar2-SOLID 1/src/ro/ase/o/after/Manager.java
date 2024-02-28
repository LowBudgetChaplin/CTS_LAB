package ro.ase.o.after;

import ro.ase.o.after.ICalculatorSalariu;

public class Manager implements ICalculatorSalariu {
    @Override
    public double calculSalariu() {
        return 2;
    }
}
