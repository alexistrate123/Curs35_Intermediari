package Curs35_Ex2;

public class Celular extends Phone {
    public Celular(int price, String number) {
        super(price, number);
    }

    public void takePicture() {
        System.out.println("Telefonul face poze.");
    }

    public void playVideo() {
        System.out.println("Telefonul porneste un video.");
    }

    public void closeClap() {
        System.out.println("Telefonul are clapeta.");
    }
}
