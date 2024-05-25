package Curs35_Ex2;

public class Phone {
    int price;
    String number;

    public Phone(int price, String number) {
        this.price = price;
        this.number = number;
    }

    public void call() {
        System.out.println("Telefonul suna.");
    }

    public void showDetails() {
        System.out.println("Telefonul are pretul " + price + " si numarul de telefon: " + number);
    }


}
