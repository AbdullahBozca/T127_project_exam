package okul_yonetimi;

public class Ogrenci extends Kisi{
    /*
    1.	Bu programda, Öğrenci ve Öğretmen Kayıtları ile ilgili işlemler yapılabilmelidir. Kayıtlarda şu bilgiler olabilmelidir.

	Öğretmen: Ad-Soyad,  kimlik No, yaş, bölüm, ve sicil No bilgileri içermelidir.
	Öğrenci:  Ad-Soyad,  kimlik No, yaş, numara, sınıf bilgileri içermelidir.
     */
    private String sinif;

    public Ogrenci(String ad, String sAd, String tcNo, int yas, String sinif) {
        super(ad, sAd, tcNo, yas);
        this.sinif = sinif;
    }

    public Ogrenci() {
    }

    public String getSinif() {
        return sinif;
    }

    public void setSinif(String sinif) {
        this.sinif = sinif;
    }

    @Override
    public String toString() {
        return
                super.toString()+
                "SINIF= " + sinif ;
    }
    public void demoOgrenciler(){
        OgrenciMenu ogrenciMenu=new OgrenciMenu();
        Ogrenci ogrenci0= new Ogrenci("Ali", "Yılmaz", "12345678900", 7, "2-B");
        ogrenciMenu.ogrenciMap.put(100,ogrenci0);
        Ogrenci ogrenci1= new Ogrenci("Veli", "Acar", "12349778900", 8, "3-A");
        ogrenciMenu.ogrenciMap.put(101,ogrenci1);
        Ogrenci ogrenci2= new Ogrenci("Hasan", "Şimşek", "12349778900", 9, "4-A");
        ogrenciMenu.ogrenciMap.put(102,ogrenci2);
        Ogrenci ogrenci3= new Ogrenci("Hüseyin", "Yıldız", "12349778900", 10, "5-A");
        ogrenciMenu.ogrenciMap.put(103,ogrenci3);
        Ogrenci ogrenci4= new Ogrenci("Mehmet", "Güneş", "12349778900", 11, "6-A");
        ogrenciMenu.ogrenciMap.put(104,ogrenci4);
    }
}
