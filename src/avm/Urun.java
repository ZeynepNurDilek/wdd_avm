/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package avm;

/**
 *
 * @author zeynep
 */



public class Urun {
 
    private String urun_kodu;
    private double fiyat;
    private double indirim = 0.1;
    private boolean alinabilir;
    
    
    public Urun(String urun_kodu,double fiyat){
        this.urun_kodu= urun_kodu;
        this.fiyat=fiyat;
        this.indirim=indirim;
    }
    
    
    
    
    /**
     * @return the urun_kodu
     */
    public String getUrun_kodu() {
        return urun_kodu;
    }

    /**
     * @param urun_kodu the urun_kodu to set
     */
    public void setUrun_kodu(String urun_kodu) {
        this.urun_kodu = urun_kodu;
    }

    /**
     * @return the fiyat
     */
    public double getFiyat() {
        return fiyat;
    }

    /**
     * @param fiyat the fiyat to set
     */
    public void setFiyat(double fiyat) {
        this.fiyat = fiyat;
    }

    /**
     * @return the indirim
     */
    public double getIndirim() {
        return indirim;
    }

    /**
     * @param indirim the indirim to set
     */
    public void setIndirim(double indirim) {
        this.indirim = indirim;
    }

    
    /**
     * @return the alinabilir
     */
    public boolean isAlinabilir() {
        return alinabilir;
    }

    /**
     * @param alinabilir the alinabilir to set
     */
    public void setAlinabilir(boolean alinabilir) {
        this.alinabilir = alinabilir;
    }
    
    
    /**
     * polymorphism
     */
    public void setSezon(Sezonlar sezon) {
       
    }

   
    
}
