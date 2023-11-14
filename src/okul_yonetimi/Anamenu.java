package okul_yonetimi;

import java.util.Scanner;

public class Anamenu extends InilitizeClass {
    Scanner scan = new Scanner(System.in);

    public void menu() {
        System.out.print("====================================\n" +
                "\t ÖĞRENCİ VE ÖĞRETMEN YÖNETİM PANELİ\n" +
                "\t====================================\n" +
                "\t 1- ÖĞRENCİ İŞLEMLERİ\n" +
                "\t 2- ÖĞRETMEN İŞLEMLERİ\n" +
                "\t Q- ÇIKIŞ\n" +
                "SEÇİMİZ: ");
        char secim = scan.next().toUpperCase().charAt(0);

        switch (secim) {
            case '1': {
                ogrenciMenu=new OgrenciMenu();
                ogrenciMenu.ogrMenu();
            }
            case '2': {
                ogretmenMenu=new OgretmenMenu();
                ogretmenMenu.ogrtMenu();
            }
            case 'Q': {
                System.out.println("SİSTEMDEN ÇIKIYORSUNUZ.....");
                System.exit(0);
            }
        }
    }
}
