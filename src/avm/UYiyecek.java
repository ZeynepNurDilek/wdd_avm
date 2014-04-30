/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package avm;

/**
 *
 * @author zeynep
 */
public class UYiyecek extends Urun{
    private String son_tuketim_tarihi;
    private int adet;

    public UYiyecek(String urunkodu,double fiyat,String sontuktar, int adet){
        super(urunkodu,fiyat);
        System.out.println("Yiyecek oluşturuluyor");
        this.son_tuketim_tarihi=sontuktar;
        this.adet=adet;
        
    }
    
    
    /**
     * @return the son_tuketim_tarihi
     */
    public String getSon_tuketim_tarihi() {
        return son_tuketim_tarihi;
    }

    /**
     * @param son_tuketim_tarihi the son_tuketim_tarihi to set
     */
    public void setSon_tuketim_tarihi(String son_tuketim_tarihi) {
        this.son_tuketim_tarihi = son_tuketim_tarihi;
    }

    /**
     * @return the adet
     */
    public int getAdet() {
        return adet;
    }

    /**
     * @param adet the adet to set
     */
    public void setAdet(int adet) {
        this.adet = adet;
    }
    
}
