package okul_yonetimi;

public interface Iislemler {
    /*
    ============= İŞLEMLER =============
		 1-EKLEME
		 2-ARAMA
		 3-LİSTELEME
		 4-SİLME
		 Q-ÇIKIŞ
     */
    public void ekleme();
    public void arama(int aranacakDeger);
    public void listeleme();
    public void silme(int silinecekDeger);
    public void cikis();
}
