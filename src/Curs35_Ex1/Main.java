package Curs35_Ex1;

public class Main {
    // MOSTENIREA

    public static void main(String[] args) {
        Audi Vehicul1 = new Audi("Audi","A3", true);
        Bmw Vehicul2 = new Bmw("Bmw","X3", true);
        Mercedes Vehicul3 = new Mercedes("Mercedes", "GLC2560");

        System.out.println(Vehicul1);
        System.out.println(Vehicul2);
        System.out.println(Vehicul3);

        Vehicul1.startEngine();
        Vehicul1.accelereaza();

        Vehicul2.startEngine();
        Vehicul2.derapeaza();
        Vehicul3.startEngine();



    }
}
