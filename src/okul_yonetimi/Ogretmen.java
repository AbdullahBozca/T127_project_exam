package okul_yonetimi;

public class Ogretmen extends Kisi {
    /*
            1.	Bu programda, Öğrenci ve Öğretmen Kayıtları ile ilgili işlemler yapılabilmelidir. Kayıtlarda şu bilgiler olabilmelidir.

    Öğretmen: Ad-Soyad,  kimlik No, yaş, bölüm, ve sicil No bilgileri içermelidir.
    Öğrenci:  Ad-Soyad,  kimlik No, yaş, numara, sınıf bilgileri içermelidir.
            */
    private String bolum;

    public Ogretmen(String ad, String sAd, String tcNo, int yas, String bolum) {
        super(ad, sAd, tcNo, yas);
        this.bolum = bolum;
    }

    public Ogretmen() {
    }

    public String getBolum() {
        return bolum;
    }

    public void setBolum(String bolum) {
        this.bolum = bolum;
    }

    @Override
    public String toString() {
        return super.toString()+
                "BÖLÜM: " + bolum ;
    }
    public void demoOgretmenler(){
        OgretmenMenu ogretmenMenu=new OgretmenMenu();
        Ogretmen ogretmen0= new Ogretmen("Ali", "Yılmaz", "12345678900", 32, "MATEMATİK");
        ogretmenMenu.ogretmenMap.put(1000,ogretmen0);
        Ogretmen ogretmen1= new Ogretmen("Veli", "Acar", "12349778900", 42, "TÜRKÇE");
        ogretmenMenu.ogretmenMap.put(1001,ogretmen1);
        Ogretmen ogretmen2= new Ogretmen("Hasan", "Şimşek", "12349778900", 45, "SOSYAL BİLİMLER");
        ogretmenMenu.ogretmenMap.put(1002,ogretmen2);
        Ogretmen ogretmen3= new Ogretmen("Hüseyin", "Yıldız", "12349778900", 30, "FEN BİLİMLERİ");
        ogretmenMenu.ogretmenMap.put(1003,ogretmen3);
        Ogretmen ogretmen4= new Ogretmen("Mehmet", "Güneş", "12349778900", 50, "SINIF ÖĞRETMENİ");
        ogretmenMenu.ogretmenMap.put(1004,ogretmen4);
    }
}
