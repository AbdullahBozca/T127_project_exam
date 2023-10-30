package geometrik_sekiller;

import java.util.Scanner;

public class Dikdortgen extends Sekil implements IHesaplamalar {
    Scanner scanner = new Scanner(System.in);
    Sekil sekil;

    void dikdortgenHesapla() {
        System.out.print("Kısa kenar uzunluğunu giriniz: ");
        int kısaKenar = scanner.nextInt();
        System.out.print("Uzun kenar uzunluğu giriniz: ");
        int uzunKenar = scanner.nextInt();
        sekil = new Sekil(kısaKenar, uzunKenar);
        System.out.println("Dikdorgenin çevresi: " + cevreHesapla() + "\n" + "Dikdötgenin alanı: " + alanHesapla());
    }

    @Override
    public double alanHesapla() {

        return sekil.getKisaKenar() * sekil.getUzunKenar();
    }

    @Override
    public double cevreHesapla() {

        return (sekil.getKisaKenar() + sekil.getUzunKenar()) * 2;
    }
}
