package geometrik_sekiller;

public class Sekil {
    /*
    1-SORU GEOMETİK ŞEKİL HESAPLAMA
Asagidaki hiyarasiye gore classlar creat ediniz...
     sekil <--Cember
     sekil <--Dikdortgen<--Kare
    1- Turetilen class'a uygun olanlarina yaricap,  uzunluk ve genislik veriable'ler ekleyiniz.
    2- Runner class'da  Cember Dikdortgen Kare alan ve cevre hesaplamasi yaptirip sonuclari yazdiriniz.
     */
    private int kisaKenar,uzunKenar,yariCap;

    public Sekil() {
    }

    public Sekil(int kisaKenar, int uzunKenar) {
        this.kisaKenar = kisaKenar;
        this.uzunKenar = uzunKenar;
    }

    public Sekil(int yariCap) {
        this.yariCap = yariCap;
    }

    public int getKisaKenar() {
        return kisaKenar;
    }


    public int getUzunKenar() {
        return uzunKenar;
    }

    public int getYariCap() {
        return yariCap;
    }
}
