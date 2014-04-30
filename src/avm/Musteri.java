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
public class Musteri {
    private String isim;
    private String soyisim;
    private List<Urun> urunler= new ArrayList();
    private double bakiye;
    
    public Musteri(String isim,String soyisim,double bakiye){
        this.isim=isim;
        this.soyisim=soyisim;
        this.bakiye=bakiye;
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
     * @return the soyisim
     */
    public String getSoyisim() {
        return soyisim;
    }

    /**
     * @param soyisim the soyisim to set
     */
    public void setSoyisim(String soyisim) {
        this.soyisim = soyisim;
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
