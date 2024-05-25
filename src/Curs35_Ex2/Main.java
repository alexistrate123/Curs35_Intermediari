package Curs35_Ex2;

public class Main {
    // Scrieti o clasa parinte (SuperClasa) Phone care sa fie mostenite de urmatoarele clase (Copii):
    // SmartPhone, Celular , DeskPhone
    // Scrieti in clasa Phone doua campuri comune , int price si int numar, metodele call() si showDetails();
    // Acesta din urma , showDetails() va afisa detalii despre telefon folosind campurile.
    // Scrieti cate alte doua clase care sa mosteneasca de la clasele(Copii): Samsung, Iphone, Nokia , Motorola, Panasonic, Cisco
    // Scrieti metodele urmatoare in clasele corespunzatoare: takeScreenShot(), takePicture(), playVideo(), closeClap(), playPoliTone()
    // sendFax(),


    public static void main(String[] args) {
        Samsung telefon1 = new Samsung(2000, "1234567");
        Iphone telefon2 = new Iphone(4000, "1234568");
        Nokia telefon3 = new Nokia(500, "1357900");
        Motorola telefon4= new Motorola(400, "1245780");
        Parasonic telefon5 = new Parasonic(100, "14235768");
        Cisco telefon6 = new Cisco(100, "1623547");

        telefon1.playVideo();
        telefon1.call();
        telefon1.takePicture();
        telefon1.takeScreenShot();
        telefon1.showDetails();

        System.out.println("_________________________________________________________________________");
        System.out.println();

        telefon3.call();
        telefon3.takePicture();
        telefon3.playVideo();
        telefon3.showDetails();
        telefon3.closeClap();

        System.out.println("_________________________________________________________________________");
        System.out.println();

        telefon6.sendFax();
        telefon6.call();
        telefon6.playPolitone();
        telefon6.showDetails();
    }
}
