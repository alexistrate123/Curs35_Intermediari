package Curs35_Ex1;

public class Masina {
    String marca;
    String model ;

    public Masina(String marca, String model) {
        this.marca = marca;
        this.model = model;
    }

    public void startEngine() {
        System.out.println("Am pornit.");
    }


    @Override
    public String toString() {
        return "Masina{" +
                "marca='" + marca + '\'' +
                ", model='" + model + '\'' +
                '}';
    }
}
