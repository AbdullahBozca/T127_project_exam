package geometrik_sekiller;

import java.util.Scanner;

public class Kare extends Dikdortgen {
    Scanner scanner=new Scanner(System.in);
    void kareHesapla(){
        System.out.print("Karenin bir kenar uzunluğunu giriniz: ");
        int kenar=scanner.nextInt();
        sekil=new Sekil(kenar,kenar);
        System.out.println("Karenin çevresi: " + cevreHesapla()+"\n"+"Karenin alanı: "+ alanHesapla());
    }
}
