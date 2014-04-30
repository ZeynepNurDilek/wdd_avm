/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package avm;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author zeynep
 */
public class Magaza {
    private String isim;
    private double kira;
    private double bakiye;
    private List<Urun> urunler = new ArrayList();
    private List<Calisan> calisanlar = new ArrayList();

    public Magaza(String isim, double kira){
        this.isim=isim;
        this.kira=kira;
    }
    
    //kontrol 
    public void calisanEkle(Calisan c){
        if(c.getMagaza()==null){
        this.calisanlar.add(c);
        c.setMagaza(this);
        System.out.println(c.getIsim()+" calişanı "+this.isim +" magazasina eklendi.");
        } else {
        System.out.println(c.getIsim()+" calişanı zaten "+c.getMagaza().getIsim()+" magazasinda çalışıyor.");
        }
    }
    
    public void calisanCıkart(Calisan c){
        this.calisanlar.remove(c);
        c.setMagaza(null);
        System.out.println(c.getIsim()+" calişanı "+this.isim +" magazasindaki işinden ayrıldı.");
    }
    
    public void urunAl(Urun u){
        urunler.add(u);
        System.out.println(u.getUrun_kodu()+" ürün koduna sahip ürün  "+this.isim +" magazasina alındı.");
        this.bakiye-= u.getFiyat()-(u.getFiyat()/10);
    }
    
    public void kiraOde(){
        Avm.setBakiye(Avm.getBakiye()+kira);
        this.bakiye -= this.kira;
    }
    
    
    
    /**
     * @return the isim
     */
    public String getIsim() {
        return isim;
    }

    /**
     * @param isim the isim to set
     */
    public void setIsim(String isim) {
        this.isim = isim;
    }

   
    /**
     * @return the urunler
     */
    public List<Urun> getUrunler() {
        return urunler;
    }

    /**
     * @param urunler the urunler to set
     */
    public void setUrunler(List<Urun> urunler) {
        this.urunler = urunler;
    }

    /**
     * @return the calisanlar
     */
    public List<Calisan> getCalisanlar() {
        return calisanlar;
    }

    /**
     * @param calisanlar the calisanlar to set
     */
    public void setCalisanlar(List<Calisan> calisanlar) {
        this.calisanlar = calisanlar;
    }

    /**
     * @return the kira
     */
    public double getKira() {
        return kira;
    }

    /**
     * @param kira the kira to set
     */
    public void setKira(double kira) {
        this.kira = kira;
    }

    /**
     * @return the bakiye
     */
    public double getBakiye() {
        return bakiye;
    }

    /**
     * @param bakiye the bakiye to set
     */
    public void setBakiye(double bakiye) {
        this.bakiye = bakiye;
    }
    
}
