package Curs35_Ex1;

public class Bmw extends Masina {
    boolean diferentialBlocabil;

    public Bmw(String marca, String model, boolean diferentialBlocabil) {
        super(marca, model);
        this.diferentialBlocabil = diferentialBlocabil;
    }

    public void derapeaza() {
        if (diferentialBlocabil) {
            System.out.println("Bmw a derapat.");
            diferentialBlocabil = false;
        } else {
            System.out.println("Bmw nu a derapat.");
        }
    }


}
