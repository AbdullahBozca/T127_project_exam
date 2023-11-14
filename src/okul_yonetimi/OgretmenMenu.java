package okul_yonetimi;

import java.util.HashMap;
import java.util.InputMismatchException;
import java.util.Map;
import java.util.Scanner;

public class OgretmenMenu extends InilitizeClass implements Iislemler {
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
    Scanner scanner = new Scanner(System.in);
    static HashMap<Integer, Ogretmen> ogretmenMap = new HashMap<>();
    static int sicilNo = 1005;

    public void ogrtMenu() {
        System.out.println("============= İŞLEMLER =============\n" +
                "\t\t 1-EKLEME\n" +
                "\t\t 2-ARAMA\n" +
                "\t\t 3-LİSTELEME\n" +
                "\t\t 4-SİLME\n" +
                "\t\t Q-ÇIKIŞ\n" +
                "\n" +
                "\tSEÇİMİNİZ:");

        try {
            int secim = scanner.nextInt();
            switch (secim) {
                case 1: {
                    ekleme();
                }
                case 2: {
                    System.out.print("ARANACAK ÖĞRETMENİN SİCİL NUMARASINI GİRİNİZ: ");
                    int aranacakNo = scanner.nextInt();
                    arama(aranacakNo);
                }
                case 3: {
                    listeleme();
                }
                case 4: {
                    System.out.print("SİLİNECEK ÖĞRETMENİN SİCİL NUMARASINI GİRİNİZ: ");
                    int silinecekNo = scanner.nextInt();
                    silme(silinecekNo);
                }
                default: {
                    System.out.println("HATALI GİRİŞ YAPTINIZ.....");
                    ogrtMenu();
                }
            }

        } catch (InputMismatchException e) {
            if (scanner.next().toUpperCase().charAt(0) == 'Q') {
                cikis();
            } else {
                System.out.println("HATALI GİRİŞ YAPTINIZ....");
                ogrtMenu();
            }
        }
    }

    @Override
    public void ekleme() {
        scanner.nextLine();
        System.out.print("ÖĞRETMENİN ADINI GİRİNİZ: ");
        String ad = scanner.nextLine();
        System.out.print("ÖĞRETMENİN SOYADINI GİRİNİZ: ");
        String sAd = scanner.next();
        System.out.print("ÖĞRETMENİN TCNO SUNU GİRİNİZ: ");
        String tcNo = scanner.next();
        System.out.print("ÖĞRETMENİN YAŞINI GİRİNİZ: ");
        int yas = scanner.nextInt();
        scanner.nextLine();
        System.out.print("ÖĞRETMENİN BÖLÜMÜNÜ GİRİNİZ: ");
        String bolum = scanner.nextLine();
        ogretmen = new Ogretmen(ad, sAd, tcNo, yas, bolum);
        ogretmenMap.put(sicilNo++, ogretmen);
        ogrtMenu();
    }

    @Override
    public void arama(int aranacakDeger) {
        boolean kontrol = false;
        for (HashMap.Entry<Integer, Ogretmen> each : ogretmenMap.entrySet()) {
            if (each.getKey() == aranacakDeger) {
                kontrol = true;
            }

        }
        if (kontrol) {
            System.out.println(aranacakDeger + " SİCİL NOLU ARANAN ÖĞRETMENİN " + " " + ogretmenMap.get(aranacakDeger));
        } else {
            System.out.println(aranacakDeger + " SİCİL NOLU ÖĞRETMEN YOKTUR...");
        }
        ogrtMenu();

    }

    @Override
    public void listeleme() {
        for (Map.Entry<Integer, Ogretmen> each : ogretmenMap.entrySet()) {
            System.out.println(each.getKey() + " SİCİL NOLU ÖĞRETMENİN  " + each.getValue());
        }
        ogrtMenu();
    }

    @Override
    public void silme(int silinecekDeger) {
        int kontrol = 0;
        for (int i = 0; i < ogretmenMap.size(); i++) {
            if (ogretmenMap.containsKey(silinecekDeger)) {
                kontrol = 1;
            }
        }
        if (kontrol == 1) {
            System.out.println(silinecekDeger + " SİCİL NOLU SİLİNECEK ÖĞRETMENİN " + ogretmenMap.get(silinecekDeger));
            ogretmenMap.remove(silinecekDeger);
        } else
            System.out.println(silinecekDeger + " SİCİL NOLU ÖĞRETMEN YOKTUR....");
        ogrtMenu();
    }

    @Override
    public void cikis() {
        anamenu = new Anamenu();
        anamenu.menu();
    }
}
