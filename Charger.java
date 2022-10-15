
/**
 * PBO Sesi 2
 * Akbar Ilham Perhan
 * 20210040083
 * TI21A
 */

package tugas;

public class Charger {
    String jenis_charger;
    int tahun_pembuatan;
    
    public void setDataCH(String jenis_charger, int tahun_pembuatan) {
        this.jenis_charger = jenis_charger;
        this.tahun_pembuatan = tahun_pembuatan;
    }
    
    public String getJenisCH(){
        return jenis_charger;
        
    }
    public int getTahunPembuatan(){
        return tahun_pembuatan;
    }
    public static void main(String[] args){
        Charger hp = new Charger ();
        
        hp.setDataCH("Auker PA-B1S Omnia Mini", 2020);
        
        System.out.println(hp.getJenisCH());
        System.out.println(hp.getTahunPembuatan());
    }
}