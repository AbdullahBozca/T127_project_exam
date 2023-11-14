package okul_yonetimi;

import java.util.HashMap;
import java.util.Scanner;

public class OgrenciMenu extends InilitizeClass implements Iislemler {
    /*
    3.	Seçilen Kişi türüne göre aşağıdaki işlemleri gösteren bir alt menü daha gösterilsin.

	============= İŞLEMLER =============
		 1-EKLEME
		 2-ARAMA
		 3-LİSTELEME
		 4-SİLME
		 Q-ÇIKIŞ

	SEÇİMİNİZ:
     */

    Scanner scan = new Scanner(System.in);
    static HashMap<Integer, Ogrenci> ogrenciMap = new HashMap<>();
    static int ogrenciNo = 105;

    public void ogrMenu() {
        System.out.print("============= İŞLEMLER =============\n" +
                "\t\t 1-EKLEME\n" +
                "\t\t 2-ARAMA\n" +
                "\t\t 3-LİSTELEME\n" +
                "\t\t 4-SİLME\n" +
                "\t\t Q-ÇIKIŞ\n" +
                "\n" +
                "\tSEÇİMİNİZ:");
        char secim = scan.next().toUpperCase().charAt(0);
        switch (secim) {
            case '1': {
                ekleme();
            }
            case '2': {
                System.out.print("ARANACAK ÖĞRENCİNİN NUMARASINI GİRİNİZ: ");
                int aranacakNo = scan.nextInt();
                arama(aranacakNo);
            }
            case '3': {
                listeleme();
            }
            case '4': {
                System.out.print("SİLİNECEK ÖĞRENCİNİN NUMARASINI GİRİNİZ: ");
                int silinecekNo = scan.nextInt();
                silme(silinecekNo);
            }
            case 'Q': {
                cikis();
            }
            default: {
                System.out.println("HATALI GİRİŞ YAPTINIZ....");
                ogrMenu();
            }
        }
    }

    @Override
    public void ekleme() {
        //Öğrenci:  Ad-Soyad,  kimlik No, yaş, numara, sınıf bilgileri içermelidir.
        scan.nextLine();// dummy objesi
        System.out.print("Öğrencinin Adını giriniz:");
        String ad = scan.nextLine();
        System.out.print("Öğrencinin Soyadını giriniz:");
        String sAd = scan.next();
        System.out.print("Öğrencinin TcNo giriniz:");
        String tcNo = scan.next();
        System.out.print("Öğrencinin Yaşını giriniz:");
        int yas = scan.nextInt();
        System.out.print("Öğrencinin Sınıfını giriniz:");
        String sinif = scan.next();
        ogrenci = new Ogrenci(ad, sAd, tcNo, yas, sinif);
        ogrenciMap.put(ogrenciNo++, ogrenci);
        ogrMenu();
    }

    @Override
    public void arama(int aranacakDeger) {
        boolean kontrol = false;
        for (HashMap.Entry<Integer, Ogrenci> each : ogrenciMap.entrySet()) {
            if (each.getKey() == aranacakDeger) {
                kontrol = true;
            }

        }
        if (kontrol) {
            System.out.println(aranacakDeger + " NOLU ARANAN ÖĞRENCİNİN " + " " + ogrenciMap.get(aranacakDeger));
        } else {
            System.out.println(aranacakDeger + " NOLU ÖĞRENCİ YOKTUR...");
        }
        ogrMenu();
    }

    @Override
    public void listeleme() {
        for (HashMap.Entry<Integer, Ogrenci> each : ogrenciMap.entrySet()) {
            System.out.println(each.getKey() + " NOLU ÖĞRENCİNİN  " + each.getValue());
        }
        ogrMenu();
    }

    @Override
    public void silme(int silinecekDeger) {
        int kontrol = 0;
        for (int i = 0; i < ogrenciMap.size(); i++) {
            if (ogrenciMap.containsKey(silinecekDeger)) {
                kontrol = 1;
            }
        }
        if (kontrol == 1) {
            System.out.println(silinecekDeger + " NOLU SİLİNECEK ÖĞRENCİNİN " + ogrenciMap.get(silinecekDeger));
            ogrenciMap.remove(silinecekDeger);
        }else
            System.out.println(silinecekDeger + " NOLU ÖĞRENCİ YOKTUR....");
        ogrMenu();
    }

    @Override
    public void cikis() {
        anamenu=new Anamenu();
        anamenu.menu();
    }
}
