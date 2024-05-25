package Curs35_Ex2;

public class DeskPhone extends Phone {
    public DeskPhone(int price, String number) {
        super(price, number);
    }

    public void playPolitone() {
        System.out.println("Telefonul are un singur ton.");
    }

    public void sendFax() {
        System.out.println("Telefonul trimite fax.");
    }
}
