package geometrik_sekiller;

import java.util.Scanner;

public class Menu extends Kare {
    void menu() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("ÇEVRESİNİ VE ALANINI HESAPLAMAK İSTEDİĞİNİZ GEOMETRİK ŞEKLİ SEÇİNİZ:\n" +
                "1. DAİRE\n" +
                "2. DİKDÖRTGEN\n" +
                "3. KARE\n" +
                "SEÇİMİNİZ: ");
        int secim = scanner.nextInt();
        switch (secim) {
            case 1: {
                Daire daire = new Daire();
                daire.daireHesapla();
                break;
            }
            case 2: {
                dikdortgenHesapla();
                break;
            }
            case 3: {
                kareHesapla();
                break;
            }
            default: {
                System.out.println("Hatalı giriş yaptınız...");
                break;
            }
        }
    }
}
