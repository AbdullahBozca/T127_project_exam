package okul_yonetimi;

public class Runner extends InilitizeClass {
    public static void main(String[] args) {
        ogrenci=new Ogrenci();
        ogrenci.demoOgrenciler();
        ogretmen=new Ogretmen();
        ogretmen.demoOgretmenler();
        anamenu=new Anamenu();
        anamenu.menu();
    }
}
