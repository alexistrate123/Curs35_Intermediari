package Curs35_Ex2;

public class Smartphone extends Phone {

    public Smartphone(int price, String number) {
        super(price, number);
    }

    public void takeScreenShot() {
        System.out.println("Telefonul a facut screenshot.");
    }

    public void takePicture() {
        System.out.println("Telefonul face poze.");
    }

    public void playVideo() {
        System.out.println("Telefonul porneste un video.");
    }
}
