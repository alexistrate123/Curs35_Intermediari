package Curs35_Ex1;

public class Audi extends Masina {
    boolean autoPilot;

    public Audi(String marca, String model, boolean autoPilot) {
        super(marca, model);
        this.autoPilot = autoPilot;
    }

    public void accelereaza() {
        System.out.println("Audi accelereaza.");
    }

    @Override
    public String toString() {
        return "Audi{" +
                "autoPilot=" + autoPilot +
                ", marca='" + marca + '\'' +
                ", model='" + model + '\'' +
                '}';
    }
}
