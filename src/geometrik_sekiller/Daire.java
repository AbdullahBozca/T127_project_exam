package geometrik_sekiller;

import java.util.Scanner;

public class Daire extends Sekil implements IHesaplamalar {
    Scanner scanner = new Scanner(System.in);
    Sekil sekil;

    void daireHesapla() {
        System.out.print("Dairenin yarı çapını giriniz: ");
        sekil = new Sekil(scanner.nextInt());
        System.out.println("Dairenin çevresi: " + cevreHesapla() + "\n" + "Dairenin alanı: " + alanHesapla());
    }

    @Override
    public double alanHesapla() {
        return Math.pow(sekil.getYariCap(), 2) * 3.14;
    }

    @Override
    public double cevreHesapla() {
        return sekil.getYariCap() * 2 * 3.14;
    }
}
